package com.tz.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tz.ssm.entity.Customer;
import com.tz.ssm.entity.VisitRecord;
import com.tz.ssm.mapper.CustomerMapper;
import com.tz.ssm.mapper.VisitRecordMapper;
import com.tz.ssm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerMapper customerMapper;
	
	@Autowired
	VisitRecordMapper visitRecordMapper;
	
	@Override
	public void saveCustomer(Customer customer) {
		customerMapper.saveCustomer(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		//删除一个客户的信息
		customerMapper.deleteCustomer(customer.getId());
		//删除制定客户的所有的联系人
		visitRecordMapper.deleteVisitRecordByCustomerId(customer);
	}

	@Override
	public List<Customer> findAllCustomer() {
		List<Customer> customers = customerMapper.findAllCustomer();
		return customers;
	}

	@Override
	public Customer findCustomer(Integer id) {
		Customer customer = customerMapper.findCustomerById(id);
		List<VisitRecord> vistRecords = visitRecordMapper.findAllVisitRecordByCustomerId(customer);
		customer.setVistRecords(vistRecords);
		return customer;
		
	}

	@Override
	public Customer findCustomerByName(String name) {
		return customerMapper.findCustomerByName(name);
	}

}
