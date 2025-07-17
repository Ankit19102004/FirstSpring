package com.example.FirstSpring.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class EmployeeDetails {
	@Id

	@Column
	private Integer eid;

	@Column
	private String ename;

	@Column
	private String edeapartment;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdeapartment() {
		return edeapartment;
	}

	public void setEdeapartment(String edeapartment) {
		this.edeapartment = edeapartment;
	}

	public EmployeeDetails(Integer eid, String ename, String edeapartment) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edeapartment = edeapartment;
	}

	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeDetails [eid=" + eid + ", ename=" + ename + ", edeapartment=" + edeapartment + "]";
	}
	

}
