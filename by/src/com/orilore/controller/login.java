package com.orilore.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.orilore.bizs.B_yhBiz;
import com.orilore.bizs.IB_yhBiz;
import com.orilore.model.B_yh;
import com.orilore.util.MD5Util;
@Controller
public class login {
	@Resource
	IB_yhBiz yhbiz;
	@RequestMapping(value="/login")
	public String loginsuccess(@RequestParam(value="yhm") String yhm,@RequestParam(value="yhmm") String yhmm,HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException{
		Map map=new HashMap();
		String newyhmm=MD5Util.createmd5str(yhmm);
		map.put("yhm", yhm);
		map.put("yhmm", newyhmm);
		map.put("zt", 1);
		B_yh yh=yhbiz.getB_yh(map);
		boolean flag=false;
		if(yh==null){
			flag=true;
			return "redirect:/login.jsp?flag="+flag;
			
		}else{
			HttpSession session=request.getSession();
			session.setAttribute("username", yhm);
			return "main.jsp";
		}
		
	}
	@RequestMapping(value="/outlogin")
	public String outlogin(HttpServletRequest request){
		HttpSession session=request.getSession();
		session.invalidate();
		
		return "redirect:/login.jsp";
	}
	
}
