package com.yin.sample;

public class sampleA {
	
	String myName = "";
	
	public sampleA(String myName){
		this.myName = myName;
	}
	
	@Override
	public String toString(){
		return "sampleA";
	}
	
	@Override
	public boolean equals(Object obj){
		boolean isEqual = false;
		if(obj instanceof sampleA){
			String objName = ((sampleA) obj).toString();
			if(objName.equals(myName)){
				isEqual =  true;
			}
		}
		return isEqual;
	}
	
	
}
