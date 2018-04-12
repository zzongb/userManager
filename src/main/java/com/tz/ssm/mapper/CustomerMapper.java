package com.tz.ssm.mapper;

import java.util.List;

import com.tz.ssm.entity.Customer;
public interface CustomerMapper {
	
	/***
	 * 保存一个客户信息
	 * @param customer
	 */
	void saveCustomer(Customer customer);
	
	/****
	 * 根据指定id来查询出该客户的信息
	 * @param id
	 * @return
	 */
	Customer findCustomerById(Integer id);
	
	/***
	 * 查询出所有的客户信息
	 * @return
	 */
	List<Customer> findAllCustomer();
	
	/****
	 * 删除指定id的客户信息
	 * @param id
	 */
	void deleteCustomer(Integer id);

	/***
	 * 根据指定的用户名来查询出该客户的信息
	 * @param name
	 * @return
	 */
	Customer findCustomerByName(String name);
}
