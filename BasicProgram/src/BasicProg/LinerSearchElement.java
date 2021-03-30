package BasicProg;

public class LinerSearchElement {

	public static void main(String[] args) {
	     int a[]= {10,50,20,30,40};
        boolean flag=false;
        int search_ele=50;
        
        for (int i = 0; i < a.length; i++) {
			if (search_ele==a[i]) {
			System.out.println("element found at:"+i);
				flag=true;
				break;
			}
		}
        if (flag==false) {
			System.out.println("element not found");
		}
	}

}
