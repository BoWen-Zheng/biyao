package com.orilore.util;

import java.util.ArrayList;
import java.util.List;

import com.orilore.model.B_lx;

public class SingleContainer {
	private static List list;
	public static List comlist(){
		if(list==null){
		list=new ArrayList();
		}
		return list;
	}
}
