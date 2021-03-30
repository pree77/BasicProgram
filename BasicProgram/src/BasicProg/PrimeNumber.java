package BasicProg;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=30;
		boolean flag=false;
		
		if (num==0 || num==1) {
			System.out.println(num + " is not prime number");
		}else {
				
			for (int i = 2; i <= num/2; i++) {
				if (num%i==0) {
					System.out.println(num + " is not prime number");
					flag =true;
					break;
				
			}
			}
			if (flag==false) 
				System.out.println(num + " is prime number");
			
			
		}
	}}

