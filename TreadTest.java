package com.yin.sample;

public class TreadTest extends Thread {
//public class TreadTest {

	@Override
	public void run(){
//	public void start(){
		try{
			long l = (long) (Math.random() * 100);
//		System.out.println("new Thread " + (Math.random()) * 10);
		System.out.println("Thread running = " + this.getName() +" - "+this.getPriority() + " running : " + l);
		Thread.sleep(100);
		System.out.println(this.getName() + " Thread just go up " + l);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreadTest t1 = new TreadTest();
		t1.setPriority(MIN_PRIORITY);
		TreadTest t2 = new TreadTest();
		t2.setPriority(NORM_PRIORITY);
		TreadTest t3 = new TreadTest();
		TreadTest t4 = new TreadTest();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
