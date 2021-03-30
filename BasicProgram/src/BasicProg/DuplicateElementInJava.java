package BasicProg;

import java.util.HashSet;

public class DuplicateElementInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","c","c++","python","c#  "};
		boolean flag=false;
		
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println("duplicate element in array is:"+arr[i]);
					flag= true;
				}
			}
		}
     if (flag==false) {
    	 System.out.println("duplicate element is found");
	}*/
		 
		HashSet <String> langs=new HashSet();
		for (String l : arr) {
			if (langs.add(l)==false) {
				System.out.println("found duplicate element:"+l);
				flag=true;
			}
		}
		if (flag==false) {
			System.out.println("not found duplicates");
			
		}
	}

}
