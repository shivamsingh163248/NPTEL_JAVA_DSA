package NPTELQ1;

public class errorcheck {
	
	
	// creating the some exceptin sfter the call 


	
	// creating the method 
	
	public  void add(int a , int b) {
		
		// checking the erro 
		if (a == 0 ) {
			throw new NullPointerException();
		}else {
			int c = a+b ; 
			System.out.println("the nummber is "+c);
			
		}
		// now writing the function 
		
		
		
	}

}
