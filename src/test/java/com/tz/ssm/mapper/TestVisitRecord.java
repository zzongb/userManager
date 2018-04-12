package com.tz.ssm.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.ssm.entity.Customer;
import com.tz.ssm.entity.VisitRecord;

public class TestVisitRecord {
	
	ApplicationContext context;
	VisitRecordMapper visitRecordMapper;
	
	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		visitRecordMapper = (VisitRecordMapper) context.getBean("visitRecordMapper");
	}

	
	@Test
	public void testSave(){
		/*private String type;
			private String contact;
			private String content;
			
			private Customer customer;*/
		
		Customer customer = new Customer();
		customer.setId(1);
		VisitRecord visitRecord = new VisitRecord();
		visitRecord.setVisitDate(new Date());
		visitRecord.setType("电话");
		visitRecord.setContact("678");
		visitRecord.setContent("fghjkl");
		visitRecord.setCustomer(customer);
		
		visitRecordMapper.saveVisitRecord(visitRecord);
	} 
	
	@Test
	public void testFindAllContactByCustomerId(){
		Customer customer = new Customer();
		customer.setId(1);
		List<VisitRecord> contacts = visitRecordMapper.findAllVisitRecordByCustomerId(customer);
		for (VisitRecord contact : contacts) {
			System.out.println(contact);
		}
	}
}
