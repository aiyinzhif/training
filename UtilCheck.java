package com.yin.sample;

import java.util.*;

public class UtilCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generic
		List <String> list = new ArrayList();
		
		list.add("helloo ");
		list.add("I ");
		list.add("am ");
		list.add("Java ");
		
//		String s = (String)list.get(0);
		
//		for(String s : list)
//		System.out.println("i got : "+s);

		for (Iterator<?> it = list.iterator(); it.hasNext();){
			
			String s = (String) it.next();
			if(s.equals("yuhuhu"))
				System.out.println("resut=lt : "+s);
		}
	}

}
