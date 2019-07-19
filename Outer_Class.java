package com.yin.sample;

public class Outer_Class {
	int num;
	
	//private inner class
	private class Inner_Class{
		public void print(){
			System.out.println("inner class");
		}
	}
	//public inner class
	public class Inner_Class2{
		public void print(){
			System.out.println("inner class2");
		}
	}
	void myMethod(){
	//local inner class
	class Inner_Class3{
		public void print(){
			System.out.println("inner class2");
		}
		
		}//end of class3
		Inner_Class3 inner = new Inner_Class3();
		inner.print();
	}//end of myMethod
	
	//acces dispaly_inner method
	void display_Inner(){
		Inner_Class inner = new Inner_Class();
		inner.print();
	}
}
