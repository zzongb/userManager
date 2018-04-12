package com.tz.ssm.entity;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 385586103715832501L;
	private Integer id;
	private String name;
	private String address;
	private String phone;
	private String fax;
	private String levels;
	
	//多条拜访记录
	List<VisitRecord> vistRecords;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public List<VisitRecord> getVistRecords() {
		return vistRecords;
	}

	public void setVistRecords(List<VisitRecord> vistRecords) {
		this.vistRecords = vistRecords;
	}

	public Customer(Integer id, String name, String address, String phone, String fax, String levels,
			List<VisitRecord> vistRecords) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
		this.levels = levels;
		this.vistRecords = vistRecords;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", fax=");
		builder.append(fax);
		builder.append(", levels=");
		builder.append(levels);
		builder.append(", vistRecords=");
		builder.append(vistRecords);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
