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
	//使用transient 修饰的属性也会被串行化到JSON
	private transient String content;
	
	public String userMessage(){
		System.out.println(password);
		
		return "success";
	}
	
	public String loadInfo(){
		
		title ="123木头人";
		content = "你是木头人，哈哈";
		loadComments();
		return "success";
	}

	private void loadComments() {
		Comment com1 = new Comment();
		com1.setContent("很不错吗");
		com1.setId(1);
		com1.setNickname("纳尼");
		
		Comment com2 = new Comment();
		com2.setContent("吆西吆西");
		com2.setId(2);
		com2.setNickname("小强");
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
