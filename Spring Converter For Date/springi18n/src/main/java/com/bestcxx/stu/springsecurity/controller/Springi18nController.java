package com.bestcxx.stu.springsecurity.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bestcxx.stu.springsecurity.entity.User;

@Controller
@RequestMapping("/home")
public class Springi18nController{
	
	/**
	 * 国际化测试
	 * @param request
	 * @return
	 */
	@GetMapping("/index")
	public String login(HttpServletRequest request){
		return "index";
	}
	
	/**
	 * 自动将前台字符串转化为时间的时间格式转化器测试
	 * @param user
	 * @param request
	 * @return
	 */
	@PostMapping("/user")
	public String add(@ModelAttribute("user") User user,HttpServletRequest request,BindingResult result){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		request.setAttribute("time",sdf.format(user.getTime()));
		return "index";
	}

}
