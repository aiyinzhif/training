package com.yin.sample;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         //in = new FileInputStream(".\\input.txt");
         
         in = new FileInputStream("C:\\STUDENT\\MyPrograms\\intput.txt");
         System.out.println("Input : ");
         out = new FileOutputStream("C:\\STUDENT\\MyPrograms\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}