package com.bestcxx.stu.springsecurity.entity;

import java.util.Date;

public class User {
	private String userName;
	private Date time;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
