package NPTELQ1;

public class errorcheck {
	
	
	// creating the some exceptin sfter the call 
	
	
	private int a ; 
	private int b ; 
	
	
	
	
	
	


	
	// creating the method 
	
	public  void add(int a , int b) throws shivamerror {
		
		// checking the erro 
		if (a == 0 ) {
			throw new shivamerror();
		}else {
			int c = a+b ; 
			System.out.println("the nummber is "+c);
			
		}
		// now writing the function 
		
		
		
	}

}
