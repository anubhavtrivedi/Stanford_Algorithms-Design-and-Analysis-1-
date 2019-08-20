/*package whatever //do not write package name here */

import java.io.*;

class CountingInversions {
	public static void main (String[] args) {
	    int inversions=0;
	   
	    int[] arr={10,9,8,7,6,5,4,3,2,1};
	    inversions=countInversions(arr);
	    
		System.out.println(inversions);
		
	}
	
	public static int countInversions(int[] x){
	    if(x.length<=1){
	        return 0;
	    }
	    int[] a=new int[x.length/2];
	    int[] b=new int[x.length-x.length/2];
	    for(int i=0;i<x.length/2;i++){
	        a[i]=x[i];
	    }
	    int top=0;
	    for(int i=x.length/2;i<x.length;i++){
	        b[top]=x[i];
	        top++;
	    }
	    int leftInversions=countInversions(a);
	    int rightInversions=countInversions(b);
	    int splitInversions=0;
	    int i=0,k=0,j=0;
	    
	    while(i<a.length&&j<b.length){
	        if(a[i]<b[j]){
	            x[k]=a[i];
	            i++;k++;
	            continue;
	        }
	          if(a[i]==b[j]){
	            x[k]=a[i];
	            i++;k++;
	        }
	        else{
	            splitInversions+=a.length-i;
	            x[k]=b[j];
	            j++;k++;
	        }
	    }
	    
	    while(i<a.length){
	         x[k]=a[i];
	            i++;k++;
	    }
	    
	    while(j<b.length){
	         x[k]=b[j];
	            j++;k++;
	    }
	    
	    return leftInversions+rightInversions+splitInversions;
	}
}
