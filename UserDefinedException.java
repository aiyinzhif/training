package com.yin.sample;

/* This is my Exception class, I have named it MyException
 * you can give any name, just remember that it should
 * extend Exception class
 */
class MyException extends Exception{
   String str1;
   /* Constructor of custom exception class
    * here I am copying the message that we are passing while
    * throwing the exception to a string and then displaying 
    * that string along with the message.
    */
   MyException(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("MyException Occurred: "+str1) ;
   }
}

class MyRule extends Exception{
	String rule;
	
	MyRule(String rule2){
		rule=rule2;
	}
	public String toString(){ 
		return ("My Rule has been Release : "+ rule) ;
	   }
}

public class UserDefinedException{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new MyException("This is My error Message");
		
	}
	catch(MyException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
	try{
		System.out.println("\nThe rules will begin : ");
		throw new MyRule("My Rule error Message Appear");
	}
	catch(MyRule rl){
		System.out.println("Habis la") ;
		System.out.println(rl) ;
	}
   }
}