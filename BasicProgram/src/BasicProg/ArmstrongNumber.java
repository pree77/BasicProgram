package BasicProg;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,orgNum,rem,total=0;
		 orgNum=num;
		
		while (orgNum!=0) {
			rem=orgNum%10;
			total=total+rem*rem*rem;
			orgNum /= 10;
		
		}
		if (total==num) 
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
		

	}

}
