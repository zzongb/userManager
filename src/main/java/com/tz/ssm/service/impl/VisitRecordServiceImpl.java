package com.tz.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tz.ssm.entity.VisitRecord;
import com.tz.ssm.mapper.VisitRecordMapper;
import com.tz.ssm.service.VisitRecordService;

@Service
public class VisitRecordServiceImpl implements VisitRecordService {

	@Autowired
	VisitRecordMapper visitRecordMapper;
	@Override
	public void saveContact(VisitRecord visitRecord) {
		visitRecordMapper.saveVisitRecord(visitRecord);
	}
	
	

}
