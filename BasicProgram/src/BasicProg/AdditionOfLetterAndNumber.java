package BasicProg;

public class AdditionOfLetterAndNumber {
	public static void main(String[] args) {
		String a="abc123xy21";
		int sum=0;
		for (int i = 0; i < args.length; i++) {
		//	if (Character.isDigit(a.charAt(i))) {
				sum=sum+Integer.parseInt(a.charAt(i)+ " ");
			}
		}
	//	System.out.println(sum);
	}

//}
