package BasicProg;

public class RevStrUsingStringBuffer {
	public static void main(String[] args) {
		String str="abcd";
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
