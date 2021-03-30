package BasicProg;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int orgNum=num;
		int revNum=0;
		
		while (num!=0) {
			revNum=revNum*10 +num%10;
			num=num/10;
			
		}
		if (revNum==orgNum) {
			System.out.println(num +" palindrome number");
			}
          else {
			System.out.println(num +" not palindrome number");
		}
	}

}
