package BasicProg;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
        int largest=arr[0];
        int secondlargest=arr[0];
        
       /* for (int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
			
		}*/
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i]>largest) {
			secondlargest=largest;
			largest=arr[i];
		}
        	else if (arr[i]>secondlargest) {
				arr[i]=secondlargest;
			}
	}
        System.out.println("  "+secondlargest);
	}
}
