package BasicProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestForCompanyNames {

	/*static void logErrors(ArrayList<String> expList , ArrayList<String> actList) {
		System.out.println( "testing is started");
		*/
		
		
	/*	//count
		int ExpectedCount=expList.size();
		System.out.println("Expected Count is " + ExpectedCount);
		int ActualCount =actList.size();
		System.out.println("Actual count is " + ActualCount);
			
		if (ExpectedCount==ActualCount) {
			System.out.println(" count is matching");
		} else {
         System.out.println(" count is not matching");
		}
		
		//sequence
		boolean flag =false;
		for (String string : actList) {
			if (expList.equals(actList)) {
			System.out.println(" index is correct");
		} else {
       System.out.println(" index is not correct");
		}
		}
		
		//checkM1(ArrayList <String> expList,ArrayList <String> actList){
			
		//}
			
			
	      //spelling checking
	   String one = "Contact us";
	   String two = "contact us";
		  if(one.equals(two)) {
		   System.out.println("String one is equal to two i.e. one==two");
		  }else{
		   System.out.println("String one is not equal to String two i.e. one!=two");
		       }
		
		}*/
		
		static void logErrors(ArrayList<String> expList1, ArrayList<String> actList1) {

			System.out.println("Testing is Strated");

/**********COUNT *****************/
			  if(expList1.size()!=actList1.size()) {
			  		  System.out.println(" No of menus must be "+ expList1.size() +
			  " But Actual Menus is " +actList1.size()); } else {
			  System.out.println("menu are equl"); }
				  Iterator<String> expitr = expList1.iterator();
			  Iterator<String> actitr = actList1.iterator();
			   while (actitr.hasNext()) {
				   String actliststring = actitr.next();
				   							while (expitr.hasNext()) {		  
				   								String expliststring=expitr.next();
				   								try { 
/*******SEQUENCE && SPECILLING MISTAKES******************/
				   			if (!actliststring.equals(expliststring))
				   						{
	  System.out.println("actual Menu is "+expliststring+ " please correct word  " +actliststring); 
				   					}
			else {
	  System.out.println("actual Menu is "+expliststring+ "You entered " +actliststring);
				   	}
		}
		catch (NoSuchElementException e) {
			System.out.println("element not fount "+ actliststring);
			}
				 break;
				  }	  
/****AVAILABILITY OF MENU ***/
				if(!expList1.contains(actliststring)) {
	System.out.println("Menu " +actliststring+ " is not available menu at expected list"); 
				   }
		 }
		
		}
		
		public static void main(String[] args) {
		ArrayList<String> expList= new ArrayList<>();
    expList.add("Home");
    expList.add("About us");
    expList.add("Services");
    expList.add("Contact us");
    
   ArrayList<String> actlist=new ArrayList<>();
    actlist.add("Home");
    actlist.add("About us");
    actlist.add("Services");
    actlist.add("Contact us");
    actlist.add("Resources");
    logErrors(expList,actlist);
    
   
	}

}
  