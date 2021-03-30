package BasicProg;

public class MinValFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {50,30,40,10,80,90};
      int min=a[0];
      
      for(int i = 1; i<a.length; i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
      System.out.println("the min value from array is:"+min);
	}

}
