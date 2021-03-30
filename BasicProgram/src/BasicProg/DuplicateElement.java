package BasicProg;

public class DuplicateElement {
	public static void main(String[] args) {
		String a[]= {"ram","sham","sham"};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.print(a[j]);
				}
			}
			
		}
	}

}
