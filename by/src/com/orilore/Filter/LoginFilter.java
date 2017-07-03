package com.orilore.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) arg0;
		HttpServletResponse response=(HttpServletResponse) arg1;
		String rurl=request.getRequestURL().toString();
		int index=rurl.lastIndexOf("/");
		String fl=rurl.substring(index+1);
		String type=rurl.substring(rurl.lastIndexOf(".")+1);
		if(fl.equals("login.jsp")||fl.equals("login")||"js".equals(type)||"css".equals(type)||"jpg".equals(type)||"png".equals(type)){
			
			arg2.doFilter(request, response);
			
		}else{
			HttpSession session=request.getSession();
			String username=(String) session.getAttribute("username");
			if(username!=null){
	    		
	    		
	    		arg2.doFilter(request,response);	
	    		
	    		
	    	}
	    	
	    	else{
	    		
	    		
	    		response.sendRedirect("login.jsp");
	    		
	    		
	    	}
			
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
