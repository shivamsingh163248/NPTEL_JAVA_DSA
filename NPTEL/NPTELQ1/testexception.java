package NPTELQ1;

public class testexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object 
		errorcheck shivam = new errorcheck() ; 
		
		
		// now callling the function 
		
		int a = 0 ; 
		int b = 7 ; 
		
		try {
			shivam.add(a, b);
		} catch (shivamerror e) {
			// TODO Auto-generated catch block
			System.out.println("this is the input by the user 0 ");
		}

	}

}
