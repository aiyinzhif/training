package com.yin.sample;

public class allSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sampleA obj1 = new sampleA("Lampu");
		sampleB obj2 = new sampleB();
		
		System.out.println("Display Object : ");
		System.out.println(obj1);
		System.out.println(obj2);
		
		String strObjName = obj1.toString();
//		String strObjName = new String(obj1.toString());
		System.out.println("Name : " + strObjName);
		
		sampleA obj3 = new sampleA("Lampu");
		System.out.println(obj3);
		
		sampleA obj4 = new sampleA("Meja");
		System.out.println(obj4);
				
//		if (strObjName == "sampleA"){
		if (obj1.equals(obj4)){
			System.out.println("this is sample A / same name : ");
		}else {
			System.out.println("not sample A / different name : ");
		}

	}

}
