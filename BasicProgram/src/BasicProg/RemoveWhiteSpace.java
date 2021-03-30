package BasicProg;

public class RemoveWhiteSpace {
   public static void main(String[] args) {
	String str="java selenium";
	String s[]=str.split(" ");
	for (int i = 0; i < s.length; i++) {
		if (s[i]==" ") {
			continue;
		}
		else {
			System.out.print(s[i]);
		}
	}
}
}
