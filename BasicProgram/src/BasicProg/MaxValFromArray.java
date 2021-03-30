package BasicProg;

public class MaxValFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {50,30,40,60,100};
       int max=a[0];
       
       for (int i = 1; i < a.length; i++) {
		    if (a[i]>max) {
				max=a[i];
			}
	}
       System.out.println(" the max number is:"+max);
	}

}
