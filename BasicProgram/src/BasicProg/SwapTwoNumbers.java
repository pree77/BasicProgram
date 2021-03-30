package BasicProg;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20,temp;
		
		/*System.out.println("before swapping " + x + " " + y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping " + x + " " + y);
		*/
		System.out.println("before swapping " + x + " " + y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping " + x + " " + y);
		

	}

}
