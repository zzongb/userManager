package com.tz.ssm.mapper;

import java.util.List;

import com.tz.ssm.entity.Customer;
import com.tz.ssm.entity.VisitRecord;

public interface VisitRecordMapper {
	
	/***
	 * 保存一个新的联系人
	 * @param VisitRecord
	 */
	void saveVisitRecord(VisitRecord VisitRecord);
	
	/****
	 * 查询出该客户的所有的联系人
	 * @param customer
	 * @return
	 */
	List<VisitRecord> findAllVisitRecordByCustomerId(Customer customer);
	
	/***
	 * 删除指定客户id的所有联系人
	 * @param customer
	 */
	void deleteVisitRecordByCustomerId(Customer customer);

}
