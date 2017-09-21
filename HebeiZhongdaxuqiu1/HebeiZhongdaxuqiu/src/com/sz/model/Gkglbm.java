package com.sz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Gkglbm {
	//��ڹ�����
	private String Department;

	@Id
	@GeneratedValue(generator = "usergenerator")    
	@GenericGenerator(name = "usergenerator", strategy = "assigned")
	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

}
