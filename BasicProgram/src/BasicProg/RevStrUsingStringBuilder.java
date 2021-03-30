package BasicProg;

public class RevStrUsingStringBuilder {
	public static void main(String[] args) {
		String str="abcd";
		//String revStr=" ";
		 int len=str.length();
		 System.out.println(len);
		 StringBuilder sb=new StringBuilder(str);
		 System.out.println(sb.reverse());
		 
	}

}
