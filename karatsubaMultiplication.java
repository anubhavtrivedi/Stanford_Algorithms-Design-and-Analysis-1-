/*package whatever //do not write package name here */

import java.io.*;

class Karatsuba {
	public static void main (String[] args) {
	    String x="1234";
	    String y="5678";
	    
		System.out.println(karatsubaMultiplication(x,y));
	}
	
	public static long karatsubaMultiplication(String x,String y){
	    if(x.length()<2||y.length()<2){
	        return Long.parseLong(x)*Long.parseLong(y);
	    }
	    String a=x.substring(0,x.length()/2);
	    String b=x.substring(x.length()/2,x.length());
	    String c=y.substring(0,y.length()/2);
	    String d=y.substring(y.length()/2,y.length());
	    
	   long half = (long)(Math.pow(10,x.length()-x.length()/2+y.length()-y.length()/2) * karatsubaMultiplication(a,c)+karatsubaMultiplication(b,d));
	   long half2= (long)(Math.pow(10,x.length()-x.length()/2) * karatsubaMultiplication(a,d)+Math.pow(10,y.length()-y.length()/2) * karatsubaMultiplication(b,c));
	    
	    return half+half2;
	}
}
