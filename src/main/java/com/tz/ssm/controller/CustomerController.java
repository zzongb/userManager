package com.tz.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tz.ssm.entity.Customer;
import com.tz.ssm.entity.VisitRecord;
import com.tz.ssm.mapper.VisitRecordMapper;
import com.tz.ssm.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	VisitRecordMapper visitRecordMapper;

	@RequestMapping("/list")
	public String showList(Model model) throws Exception {
		List<Customer> list = customerService.findAllCustomer();
		model.addAttribute("customerList",list);
		return "CustomerList";
	}
	
	@RequestMapping("/add")
	public String addCustomer() throws Exception {
		return "addCustomer";
	}
	
	@RequestMapping("/addCustomer")
	public String add(Customer customer) throws Exception {
		customerService.saveCustomer(customer);
		
		return "forward:/customer/list";
	}
	
	@RequestMapping("/keep")
	public String keep(Model model,Integer id) throws Exception {
		System.out.println(id);
		model.addAttribute("cid",id);
		Customer customer = customerService.findCustomer(id);
		List<VisitRecord> list = customer.getVistRecords();
		model.addAttribute("recordList",list);
		return "keepRecord";
	}
	
	
	
	@RequestMapping("/saveRecord")
	public String addrecord(Model model,Integer id) throws Exception {
		model.addAttribute("vid",id);
		return "addRecord";
	}
	
	@RequestMapping("/addRecord")
	@ResponseBody
	public String saveRecord(VisitRecord visitRecord) throws Exception {
		Customer customer = new Customer();
		customer.setId(visitRecord.getId());
		visitRecord.setCustomer(customer);
		visitRecordMapper.saveVisitRecord(visitRecord);
		
		return "SUCCESS"; 
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		Customer customer = new Customer();
		customer.setId(id);
		
		customerService.deleteCustomer(customer);
		
		return "forward:/customer/list"; 
	}
}
