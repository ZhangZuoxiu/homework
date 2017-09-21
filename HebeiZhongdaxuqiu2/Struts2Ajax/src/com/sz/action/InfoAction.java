package com.sz.action;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Comment;


public class InfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Comment> comments = new ArrayList<Comment>();
	private String title ;
	private String username;
	private String password;
	//ʹ��transient ���ε�����Ҳ�ᱻ���л���JSON
	private transient String content;
	
	public String userMessage(){
		System.out.println(password);
		
		return "success";
	}
	
	public String loadInfo(){
		
		title ="123ľͷ��";
		content = "����ľͷ�ˣ�����";
		loadComments();
		return "success";
	}

	private void loadComments() {
		Comment com1 = new Comment();
		com1.setContent("�ܲ�����");
		com1.setId(1);
		com1.setNickname("����");
		
		Comment com2 = new Comment();
		com2.setContent("ߺ��ߺ��");
		com2.setId(2);
		com2.setNickname("Сǿ");
		comments.add(com1);
		comments.add(com2);
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@JSON(serialize=false)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
