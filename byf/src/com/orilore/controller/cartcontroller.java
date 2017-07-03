package com.orilore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orilore.bizs.IB_ccBiz;
import com.orilore.bizs.IB_cpBiz;
import com.orilore.bizs.IB_sjBiz;
import com.orilore.bizs.IB_ysBiz;
import com.orilore.dto.cartcpdto;
import com.orilore.dto.cartdto;
import com.orilore.model.B_cc;
import com.orilore.model.B_cp;
import com.orilore.model.B_sj;
import com.orilore.model.B_ys;

@Controller
public class cartcontroller {
	@Resource
	public IB_cpBiz cpbiz;
	@Resource
	public IB_ysBiz ysbiz;
	@Resource
	public IB_sjBiz sjbiz;
	@Resource
	public IB_ccBiz ccbiz;
@RequestMapping(value="/cart")
	public String cart(HttpServletRequest request){
	String id=request.getParameter("id");
	String ys=request.getParameter("ys");
	String cc=request.getParameter("cc");
	String cpsl=request.getParameter("cpsl");
	int cpid=Integer.parseInt(id);
	int ysid=Integer.parseInt(ys);
	B_cp cp=cpbiz.getB_cp(cpid);
	int ccid=Integer.parseInt(cc);
	String cpmc=cp.getCpmc();
	String cptp=cp.getCptp();
	double cpjg=cp.getCpjg();
	B_ys ys1=ysbiz.getB_ys(ysid);
	String ysmc=ys1.getYsmc();
	B_cc cc1=ccbiz.getB_cc(ccid);
	String ccmc=cc1.getCcmc();
	cartcpdto cartcpdto=new cartcpdto();
	cartcpdto.setCpid(cpid);
	cartcpdto.setCpjg(cpjg);
	cartcpdto.setCcmc(ccmc);
	cartcpdto.setCpmc(cpmc);
	cartcpdto.setCpsl(Integer.parseInt(cpsl));
	cartcpdto.setImg(cptp);
	cartcpdto.setYsmc(ysmc);
	List<cartcpdto> cartcpdtos=new ArrayList<cartcpdto>();
	List<cartdto> cartdtos=new ArrayList<cartdto>();
	B_sj sj=sjbiz.getB_sj(cp.getSjid());
	String sjmc=sj.getSjmc();
	int sjid=sj.getId();
	HttpSession session=request.getSession();
	List<cartdto> sessioncartdtos=(List<cartdto>) session.getAttribute("cartdtos");
	
	
	
	if(sessioncartdtos!=null&&sessioncartdtos.size()>0){
		
		
		for (int i=0;i<sessioncartdtos.size();i++) {
			boolean flag1=false;
			cartdto cartdto=sessioncartdtos.get(i);
			System.out.println(cartdto.getSjid());
			System.out.println(sjid);
				if(sjid==cartdto.getSjid()){
					flag1=true;
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
					List<cartcpdto> cpdto=cartdto.getCartcpdto();
					boolean flag=false;
					for (int j=0;j<cpdto.size();j++) {
						cartcpdto cpdto2=cpdto.get(j);
						
						if(cpdto2.getYsmc().equals(ysmc)&&cpdto2.getCcmc().equals(ccmc)){
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
							cpdto2.setCpsl(cpdto2.getCpsl()+Integer.parseInt(cpsl));
							flag=true;
							break;
						}
						
					}
					
					if(!flag){
						System.out.println("-----------------------");
						cartdto.getCartcpdto().add(cartcpdto);
						
					}
					
					break;
				}
				
				if(!flag1){
				
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
					cartdto cartdto1=new cartdto();
					cartcpdtos.add(cartcpdto);
					cartdto1.setCartcpdto(cartcpdtos);
					cartdto1.setSjid(sjid);
					cartdto1.setSjmc(sjmc);
					
				
					sessioncartdtos.add(cartdto1);
					break;
				
				}
		
		}
		
	}
	
	
	else{
		
		System.out.println("$$$$$$$$$$$$$$$$$");
		cartdto cartdto=new cartdto();
		cartcpdtos.add(cartcpdto);
		cartdto.setCartcpdto(cartcpdtos);
		cartdto.setSjid(sjid);
		cartdto.setSjmc(sjmc);
		
		
		cartdtos.add(cartdto);
		session.setAttribute("cartdtos", cartdtos);
	
	}
	
	return "redirect:/cart.jsp";
	
} 

}
