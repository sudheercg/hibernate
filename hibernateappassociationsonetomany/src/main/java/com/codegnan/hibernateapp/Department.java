package com.codegnan.hibernateapp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@Column(name = "did", length = 5)
	private String did;
	@Column(name = "dname", length = 10)
	private String dname;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Employee> emps;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String did, String dname, Set<Employee> emps) {
		super();
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Employee> getEmps() {
		return emps;
	}

	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", emps=" + emps + "]";
	}
}
