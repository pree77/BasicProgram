package BasicProg;

public class EvenOrOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456789;
		int even=0;
		int odd=0;
		
		while (num>0) {
			int rem=num%10;
			if (rem%2==0) {
			even++;
		}else {
			odd++;
		}
		
		num=num/10;
		}
		System.out.println(even);
		System.out.println(odd);

}
	}


