package BasicProg;

public class CharSize {
	public static void main(String[] args) {
		String s= "  Hey Hello How are you";
		int count=0;
		char c[]=s.toCharArray();
		
		for (char ch : c) {
			if (ch=='h' || ch=='H') {
				count ++;
			}
		}
		System.out.println(count);
	}
	}


