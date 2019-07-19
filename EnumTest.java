package com.yin.sample;
import static com.yin.sample.Day.*;

public class EnumTest {

	Day day;
	
		public EnumTest(Day day){this.day=day;}
		
		public void tellIt(){
			switch(day){
			case Monday:
				System.out.println("bad");
				break;
			case Friday:
				System.out.println("enjoy");
				break;
			case Saturday:
				System.out.println("sleep");
				break;
			case Sunday:
				System.out.println("bad");
				break;
			default:
				break;
			}
			
		}
		public static void main(String args[]){
			EnumTest firstDay = new EnumTest(Monday);
			firstDay.tellIt();
			EnumTest secDay = new EnumTest(Friday);
			secDay.tellIt();
			EnumTest thirdDay = new EnumTest(Day.Saturday);
			thirdDay.tellIt();
			EnumTest fourthDay = new EnumTest(Day.Sunday);
			fourthDay.tellIt();
		}
	}

