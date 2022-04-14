package com.motivity.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "ITcompany")
public class ITcompany
{

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeid;

	@Column(name = "companyname")
	private String companyname;
	@Column(name = "ceo")
	private String ceo;


	/*@Column(name = "ceo", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate joiningDate;*/

	@Column(name = "branches")
	private String branches;

	@Column(name = "project")
	private String project;

	public ITcompany() {}
	public ITcompany(int employeeid,String companyname,String ceo,String branches,String project) {
		this.employeeid=employeeid;
		this.companyname=companyname;
		this.ceo=ceo;
		this.branches=branches;
		this.project=project;
	}
	public ITcompany(int employeeid) {
		this.employeeid=employeeid;
	}
	
	public int getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getCeo() {
		return ceo;
	}


	public void setCeo(String ceo) {
		this.ceo = ceo;
	}


	public String getBranches() {
		return branches;
	}


	public void setBranches(String branches) {
		this.branches = branches;
	}


	public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}


	@Override
	public String toString()
	{
		return "ITcompany [employeeid=" + employeeid + ", companyname=" + companyname
				+ ", ceo=" + ceo + ", branches="
				+ branches+ ", project=" + project + "]";
	}

}

