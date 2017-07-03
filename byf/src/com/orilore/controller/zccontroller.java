package com.orilore.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;
import javax.management.StringValueExp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.orilore.bizs.IB_cpBiz;
import com.orilore.bizs.IB_lxBiz;
import com.orilore.bizs.IB_ysBiz;
import com.orilore.bizs.ISmsBiz;
import com.orilore.model.B_cp;
import com.orilore.model.B_ys;
import com.orilore.model.Sms;
import com.orilore.util.RandomCode;

@Controller
public class zccontroller {
	@Resource
	public ISmsBiz smsbiz;
	@RequestMapping(value="/sendsms")
	public @ResponseBody boolean sendsms(@RequestParam(value="sjh") String sjh){
		 // 用户名
		String name="15232339970"; 
		// 密码
		String pwd="01A9DA2B13FAFE45287804789A93"; 
		// 电话号码字符串，中间用英文逗号间隔
		StringBuffer mobileString=new StringBuffer(sjh);
		
		int code=RandomCode.getRandNum(1, 999999);
		
		
		// 内容字符串
		StringBuffer contextString=new StringBuffer("【爱你永远】验证码：4396");
		// 签名
		String sign="";
		
		String stime="";
		// 扩展码，必须为数字 可为空
		
		StringBuffer extno=new StringBuffer();
	  
			try {
				String  result = doPost(name, pwd, mobileString, contextString, sign, stime, extno);
				System.out.println(result);
				if(result.split(",")[0].equals("0")){
					
					Sms sms=new Sms();
					sms.setSjh(sjh);
					sms.setYzm(String.valueOf(4396));
					sms.setSj(System.currentTimeMillis());
					smsbiz.addSms(sms);
					return true;
				}
				else{
					return false;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		
		
	}
	 public static String doPost(String name, String pwd, 
	    		StringBuffer mobileString, StringBuffer contextString,
	    		String sign, String stime, StringBuffer extno) throws Exception {
	    	StringBuffer param = new StringBuffer();
	    	param.append("name="+name);
	    	param.append("&pwd="+pwd);
	    	param.append("&mobile=").append(mobileString);
	    	param.append("&content=").append(URLEncoder.encode(contextString.toString(),"UTF-8"));
	    	param.append("&stime="+stime);
	    	param.append("&sign=").append(URLEncoder.encode(sign,"UTF-8"));
	    	param.append("&type=pt");
	    	param.append("&extno=").append(extno);
	        
	        URL localURL = new URL("http://web.cr6868.com/asmx/smsservice.aspx?");
	        URLConnection connection = localURL.openConnection();
	        HttpURLConnection httpURLConnection = (HttpURLConnection)connection;
	        
	        httpURLConnection.setDoOutput(true);
	        httpURLConnection.setRequestMethod("POST");
	        httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");
	        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(param.length()));
	        
	        OutputStream outputStream = null;
	        OutputStreamWriter outputStreamWriter = null;
	        InputStream inputStream = null;
	        InputStreamReader inputStreamReader = null;
	        BufferedReader reader = null;
	        String resultBuffer = "";
	        
	        try {
	            outputStream = httpURLConnection.getOutputStream();
	            outputStreamWriter = new OutputStreamWriter(outputStream);
	            
	            outputStreamWriter.write(param.toString());
	            outputStreamWriter.flush();
	            
	            if (httpURLConnection.getResponseCode() >= 300) {
	                throw new Exception("HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
	            }
	            
	            inputStream = httpURLConnection.getInputStream();
	            resultBuffer = convertStreamToString(inputStream);
	            
	        } finally {
	            
	            if (outputStreamWriter != null) {
	                outputStreamWriter.close();
	            }
	            
	            if (outputStream != null) {
	                outputStream.close();
	            }
	            
	            if (reader != null) {
	                reader.close();
	            }
	            
	            if (inputStreamReader != null) {
	                inputStreamReader.close();
	            }
	            
	            if (inputStream != null) {
	                inputStream.close();
	            }
	            
	        }

	        return resultBuffer;
	    }
		
		
		/**
		 * 转换返回值类型为UTF-8格式.
		 * @param is
		 * @return
		 */
		public static String convertStreamToString(InputStream is) {    
	        StringBuilder sb1 = new StringBuilder();    
	        byte[] bytes = new byte[4096];  
	        int size = 0;  
	        
	        try {    
	        	while ((size = is.read(bytes)) > 0) {  
	                String str = new String(bytes, 0, size, "UTF-8");  
	                sb1.append(str);  
	            }  
	        } catch (IOException e) {    
	            e.printStackTrace();    
	        } finally {    
	            try {    
	                is.close();    
	            } catch (IOException e) {    
	               e.printStackTrace();    
	            }    
	        }    
	        return sb1.toString();    
	    }
}
