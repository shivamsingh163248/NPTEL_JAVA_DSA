package NPTELQ1;

import java.util.Iterator;

public class febonic {
	
	
	// creating the class for the finding the febonic number
	 public int febonic(int n ) {
		 
		 // creating the for loop 
		 
		 // creating the for 
		 if (n == 1) {
			return 0 ; 
		}
		 if (n == 2) {
			return 1 ; 
		}
		 
		 int num1 = 0 ; 
		 int num2 = 1 ; 
		 
		 int update = 1 ; 
		 
		for (int i = 2; i < n; i++) {
			
			int temp = update ; 
			
			// System.out.println(update +" = "+num1+"  +  "+num2);
			
			update = num1+num2 ; 
			
			// now swetching the value 
			
			// creating the temp 
			
			num1 = temp ; 
			num2 = update ; 
			
			
			
			
			
			
		}
		
		return update ; 
		 
	 }
	 
	 
	 public static void main(String[] args) {
		
		 
		 febonic shivam = new febonic() ; 
		 int s = shivam.febonic(13) ; 
		 System.out.println(s);
	}

}
