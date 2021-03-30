package BasicProg;

public class ReverseString {

	public static void main(String[] args) {
		
       String str="abcd";
      String revStr=" ";
     int len= str.length();
     for (int i = len-1; i >= 0; i--) {
		revStr=revStr+str.charAt(i);
	}
     System.out.println("reverse string is" + revStr);
	}

}
