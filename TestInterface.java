package com.yin.sample;

public class TestInterface implements int2 {

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "Yup Helloo";
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("test IT ");
	}
	public static void main(String args[]){
		System.out.println("inside testclass main");
		System.out.println(name);
//		name = "New Name";
		TestInterface test = new TestInterface();
		test.testIt();
		System.out.println(int2.name);
		
		int2 obj = new TestInterface();
		
		System.out.println(obj.hello());
		obj.testIt();
	}

}
