package com.tz.ssm.service;

import java.util.List;

import com.tz.ssm.entity.Customer;

public interface CustomerService {
	
	/***
	 * 保存一个新的客户信息
	 */
	void saveCustomer(Customer customer);
	
	/***
	 * 删除客户信息，包括对应的联系人信息
	 */
	void deleteCustomer(Customer customer);
	
	/**
	 * 查询出所有的客户信息，不查询对应的联系人
	 */
	List<Customer> findAllCustomer();
	
	/***
	 * 查询指定id的客户，并查询出所对应的联系人信息
	 */
	Customer findCustomer(Integer id);

	/****
	 * 查询出指定用户名的信息
s	 */
	Customer findCustomerByName(String name);

}
