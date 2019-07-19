package com.yin.sample;

public class TestAnon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonInner obj = new AnonInner(){
			@Override
			public void myMethod(){
				System.out.println("Inside my method");
			}
		};
		obj.myMethod();
	}

}
