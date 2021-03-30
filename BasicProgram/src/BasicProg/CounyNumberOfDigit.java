package BasicProg;

public class CounyNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6541;
		int count=0;
		while (num>0) {
			num=num/10;
			count++;
		}
		System.out.println("number of digits in a number is:" +count);
	}

	}


