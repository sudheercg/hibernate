package com.codegnan.hibernateapps;

public class Employee {
	
	private int eid;
	private String name;
	private float esal;
	private String eaddr;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", esal=" + esal + ", eaddr=" + eaddr + "]";
	}

}
