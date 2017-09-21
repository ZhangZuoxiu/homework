package com.sz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class LocalArea {
	private String Code;
	private String Title;
	
	@Id
	@GeneratedValue(generator = "usergenerator")    
	@GenericGenerator(name = "usergenerator", strategy = "assigned")
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
}
