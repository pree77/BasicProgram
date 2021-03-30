package BasicProg;

import java.util.HashSet;

public class CommonElementFromArray {
public static void main(String[] args) {
	String a[]= {"red","blue"};
	String b[]= {"white","red","blue"};
	HashSet<String> hs= new HashSet<String>();
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if (a[i].equals(b[j])) {
				hs.add(a[i]);
				hs.add(b[j]);
			}
			System.out.print(hs);
		}
		
	}
}
}
