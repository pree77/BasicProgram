package BasicProg;

public class duplicateIntegerInArray {

	public static void main(String[] args) {
	
		  String [] arr = new String [] {"java","priya","java","rushi"};   
          
	        System.out.println("Duplicate elements in given array: ");  
	      
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	    }  
	}


