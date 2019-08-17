/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;

class MergeSort {
	public static void main (String[] args) {
	    int[] arr={2,4,4,2,1,56,45,23,11,3,75643,12,354};
	   mergeSort(arr);
	    System.out.println(Arrays.toString(arr));
	    
	}
	
	public static void mergeSort(int[] arr){
	    if(arr.length==1)
	        return;
	    int len=arr.length;
	    int[] a =new int[len/2];
	    int[] b= new int[len-len/2];
	    for(int i=0;i<len/2;i++){
	        a[i]=arr[i];
	    }
	    int top=0;
	     for(int i=len/2;i<len;i++){
	        b[top]=arr[i];
	        top++;
	    }
	    
	    mergeSort(a);
	    mergeSort(b);
	    
	    merge(a,b,arr);
	}
	
	public static void merge(int[] a,int[] b,int[] arr){
	    int i=0,k=0,j=0;
	    int ai=a.length,bj=b.length;
	    while(i<ai&&j<bj){
	        if(a[i]<=b[j])   {
	            arr[k]=a[i];
	            k++;i++;
	        }
	        else{
	            arr[k]=b[j];
	            k++;j++;
	        }
	    }
	    
	    
	    while(i<ai){
	        arr[k]=a[i];
	        i++;k++;
	    }
	    
	    while(j<bj){
	        arr[k]=b[j];
	        j++;k++;
	    }
	    
	}
	
}
