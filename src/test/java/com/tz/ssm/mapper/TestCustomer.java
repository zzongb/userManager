package com.tz.ssm.mapper;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.ssm.entity.Customer;

public class TestCustomer {
	
	ApplicationContext context;
	CustomerMapper customerMapper;
	
	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		customerMapper = (CustomerMapper) context.getBean("customerMapper");
	}
	
	@Test
	public void testSave(){
		
		Customer customer = new Customer();
		customer.setName("王五");
		customer.setPhone("1884567");
		customer.setAddress("安徽");
		customer.setFax("56");
		customer.setLevels("2");
		customerMapper.saveCustomer(customer);
	}
	
	@Test
	public void testFindCustomerById(){
		Customer customer = customerMapper.findCustomerById(1);
		System.out.println(customer);
	}
	
	@Test
	public void testFindAllCustomer(){
		List<Customer> customers = customerMapper.findAllCustomer();
		
		customers.forEach(System.out::println);
	}
	
	@Test
	public void testDeleteCustomer(){
		customerMapper.deleteCustomer(1);
	}
	
	

}
