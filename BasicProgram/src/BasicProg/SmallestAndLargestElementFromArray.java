package BasicProg;

import java.util.Arrays;

public class SmallestAndLargestElementFromArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int smallest=a[0];
	int largest=a[0];
	for (int i = 1; i < a.length; i++) {
		if (a[i]<smallest) {
			smallest=a[i];
		}else  if (a[i]>largest) {
			largest=a[i];
		}
			}
	System.out.println(Arrays.toString(a));
	System.out.println("number is:" + smallest + " " +largest);
}
}
