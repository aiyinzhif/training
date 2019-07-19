package com.yin.sample;

import java.util.*;

class ContinueTriangle{
	
	public static void main(String[] args) {
		
		String strInput = "yeayyy";
		
		try{
		
		strInput = args[0];
//		System.out.println(strInput instanceof String);
		
		int input= Integer.parseInt(strInput);
		
//		int  input = Integer.parseInt(args[0]);
		int target = 0;

		// if (input >10) {
		// 	target = 10;
		// }else {
		// 	target = input;
		// }

		target = (input > 10) ? 10 : input;

		outer: for (int i=0;i<target ;i++ ) {
			for (int j=0;j<target ;j++ ) {
				if (j > i) {
					System.out.println(" Aiyoyo ");
					continue outer;
				}
				System.out.print(" "+(i * j));
			}
		}
		System.out.println();
		
		int num = 10;
		
		int result = num/input;
		
		System.out.println("\nResult : "+ result);
		
	}catch ( NumberFormatException ex ){
		System.out.println("Errorrrrr Number : " + strInput );
		System.out.println();
//		ex.printStackTrace();
	}catch ( Exception ex ){
		System.out.println("Errorrrrr : " + strInput );
		System.out.println();
//		ex.printStackTrace();
	}
		finally {
		System.out.println("Finally cbakbi");
	}
	}

}