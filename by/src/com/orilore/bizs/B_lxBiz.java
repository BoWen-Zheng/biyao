package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.util.SingleContainer;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_lxBiz implements IB_lxBiz{
	@Resource
	private B_lxMapper mapper;
	@Override
	public boolean addB_lx(B_lx bean) {
		
			mapper.insert(bean);
				return true;
		
	}
	@Override
	public boolean removeB_lx(int id) {
		
			mapper.delete(id);
			
			return true;
		
	}
	@Override
	public boolean modifyB_lx(B_lx bean) {
		
			mapper.update(bean);
			
			return true;
	
	}
	@Override
	public B_lx getB_lx(int id) {
		B_lx bean = null;
		
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<B_lx> findB_lx() {
		List<B_lx> beans = null;
		
			beans = mapper.select();
		
		return beans;
	}
	private List<B_lx> comtree(List<B_lx> alllist,int level,int id){
		List<B_lx> list=SingleContainer.comlist();
		for (B_lx lx : alllist) {
			if(lx.getPid()==id){
				lx.setLevel(level);
				
				list.add(lx);
				this.comtree(alllist, level+1, lx.getId());
			}
		}
		
		return list;
	}
	
	@Override
	public List<B_lx> comtrees(){
		List<B_lx> list=new ArrayList<B_lx>();
		List<B_lx> rootlist=mapper.selectbypid();
		List<B_lx> alllist=mapper.selectzt(0);
 		
		for (B_lx lx : rootlist) {
			list.add(lx);
			int id=lx.getId();
		    List<B_lx> treelist=this.comtree(alllist, 1, id);
		    list.addAll(treelist);
		    treelist.clear();
		}
		return list;
		
	}
	@Override
	public List<B_lx> selecttrees(){
		List<B_lx> list=new ArrayList<B_lx>();
		List<B_lx> rootlist=mapper.selectbypid();
		List<B_lx> alllist=mapper.select();
 		
		for (B_lx lx : rootlist) {
			list.add(lx);
			int id=lx.getId();
		    List<B_lx> treelist=this.comtree(alllist, 1, id);
		    list.addAll(treelist);
		    treelist.clear();
		}
		return list;
		
	}
	@Override
	public List<B_lx> familytree(int id){
		List<B_lx> list=SingleContainer.comlist();
		List<B_lx> alllist=mapper.select();
		for (B_lx lx : alllist) {
			if(lx.getId()==mapper.selectOne(id).getPid()){
				list.add(lx);
				this.familytree(lx.getId());
			}
		}
		return list;
	}
	@Override
	public boolean updatelx(int id,String mc,String bm,int zt,int pid,int xszt) {
		
		
		B_lx lx1=mapper.selectOne(id);
		
		lx1.setId(id);
		lx1.setMc(mc);
		lx1.setBm(bm);
		lx1.setPid(pid);
		lx1.setXszt(xszt);
		mapper.update(lx1);
		System.out.println(zt);
		if(zt==1){

			List<B_lx> alllist=mapper.select();
			List<B_lx> clist=this.comtree(alllist, 1, id);
			List<B_lx> lists=new ArrayList<B_lx>();
			lists.add(lx1);
			lists.addAll(clist);
			for (B_lx lx : lists) {
				lx.setZt(1);
				mapper.update(lx);
			}
			
		}
		
		if(zt==0){
			List<B_lx> plist=this.familytree(id);
			List<B_lx> lists=new ArrayList<B_lx>();
			lists.add(lx1);
			lists.addAll(plist);
			lists.addAll(lists);
			for(B_lx lx : lists){
				lx.setZt(0);
				mapper.update(lx);
				
			}
			
		}

		return false;
	}
	@Override
	public boolean checkupdatelx(int pid, int id) {
		boolean flag=true;
		List<B_lx> alllist=mapper.select();
		List<B_lx> lists=this.comtree(alllist, 1, id);
		for (B_lx lx : lists) {
			if(pid==lx.getId()){
				flag=false;
			}
			
		}
		return flag;
	}
	
	
	
}