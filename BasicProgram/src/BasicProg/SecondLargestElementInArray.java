package BasicProg;

public class SecondLargestElementInArray {
public static int getSecondLargest(int c[],int total) {
	int temp;
	for (int i = 0; i < total; i++) {
		for (int j = i+1; j < total; j++) {
			if (c[i]>c[j]) {
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
	}
	return c[total-2];
	
	
}
 public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	System.out.println("number is:"+getSecondLargest(a, 9));
}
}