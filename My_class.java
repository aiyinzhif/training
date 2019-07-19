package com.yin.sample;

public class My_class {
	
	public void displayMessage(Message m){
		System.out.println(m.greet());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_Class outer = new Outer_Class();
		
		//access inner
		outer.display_Inner();
		
		//access myMethod
		outer.myMethod();;
		
		Outer_Class.Inner_Class2 inner = outer.new Inner_Class2();
		inner.print();
		
		//pass anon inner class as a parameter
		My_class obj = new My_class();
//		obj.displayMessage(new Message());
	}

}
