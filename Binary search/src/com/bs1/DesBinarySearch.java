package com.bs1;

public class DesBinarySearch {
	public static void descendingbinarySearch(int[] array,int key,int last,int first) {
		
		while(last>=first) {
			int mid = first + ((last-first)/2);
			if ( array[mid] > key ){  
		        first = mid + 1;     
		      }else if ( array[mid] == key ){  
			        System.out.println("Element is found at index: " + mid +" and the number is: " + array[mid]);  
			        break;  
			  }else if( array[mid] < key ){  
			         last = mid - 1;  
			  }
				  System.out.println("not found");
			  
		}
	}

	public static void main(String[] args) {
		int[] array = {20,17,15,14,13,12,10,8,7,4};
		int key = 7;
		int last = array.length - 1;
		int first = 0;
		
		descendingbinarySearch(array,key,last,first);

	}

}
