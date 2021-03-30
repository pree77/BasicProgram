package BasicProg;

public class Dupli {
	public static void main(String[] args) {
		String str="hello";
		char[] carray=str.toCharArray();
		System.out.println("the string is " + str);
		System.out.print("duplicate characters are " );
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (carray[i]==carray[j]) {
					System.out.print(carray[j] + " ");
					break;
				}
			}
			
		}
	}

}
