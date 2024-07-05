package com.codegnan.hibernateapp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {
	@Id
	@Column(name = "eno", length = 5)
	private int eno;
	@Column(name = "ename", length = 10)
	private String ename;
	@Column(name = "esal", length = 8)
	private float esal;
	@Column(name = "eaddr", length = 10)
	private String eaddr;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eno, String ename, float esal, String eaddr) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + "]";
	}

}

