package com.tz.ssm.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class VisitRecord implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8683781064745012416L;
	
	private Integer id;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date visitDate;
	
	private String type;
	private String contact;
	private String content;
	
	private Customer customer;
	
	
	
	public VisitRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public VisitRecord(Integer id, Date visitDate, String type, String contact, String content, Customer customer) {
		super();
		this.id = id;
		this.visitDate = visitDate;
		this.type = type;
		this.contact = contact;
		this.content = content;
		this.customer = customer;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VisitRecord [id=");
		builder.append(id);
		builder.append(", visitDate=");
		builder.append(visitDate);
		builder.append(", type=");
		builder.append(type);
		builder.append(", contact=");
		builder.append(contact);
		builder.append(", content=");
		builder.append(content);
		builder.append(", customer=");
		builder.append(customer);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
