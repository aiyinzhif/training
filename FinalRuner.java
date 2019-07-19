package com.yin.sample;

public class FinalRuner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass.sayHai("Trial ");
		
		FinalClass obj = new FinalClass();
		FinalClass obj2 = new FinalClass();
		
		obj.sayHai("Helo1");
		obj.sayGoodBye("Balik1");
		System.out.println(obj.className);
		System.out.println(obj.ClassName2);
		
		obj2.sayHai("Helo kedua");
		obj2.sayGoodBye("Balik kedua");
		System.out.println(obj2.className);
		System.out.println(obj2.ClassName2);
		
		//Modifed
		obj.className = "MyClass 1";
		obj.ClassName2 = "My Class 2";
		
		obj2.className = "MyClass 3";
		obj2.ClassName2 = "My Class 3";
		
		FinalClass.className = "MyClassTiga";
		
		//Print
		System.out.println("Modified 1 : " + obj.ClassName2);
		System.out.println("Modified 1 : " + obj.ClassName2);
		
		System.out.println("Modified 2 : " + obj2.ClassName2);
		System.out.println("Modified 2 : " + obj2.ClassName2);
		
	}

}
