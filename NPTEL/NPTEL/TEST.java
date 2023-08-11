package NPTEL;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TEST {
	
	
	// creating the array for the 
	// now creating the fucntion of the given oup
// now creating the function 
	
	// now gain makeing the algorithm 
	
	// creatnng the funcrtion for the finding the size of the number 
	
 public static int sizenumber(int n ) {
	 
	 int size = 0 ; 
	 
	 for (int i = n; i  > 0 ; i =  i/10) {
		size++ ; 
	}
	 return size ; 
	 
 }
	
	
	
	
	
	public static boolean stronnymenber (int n ) {
		
		// frist checkingthe number of the size 
		
		// now creating the algorithum for the finding 
		
		
		
		int totalnumber = 0  ; 
		
		for (int i = n; i > 0; i = i/10) {
			//now finding the particulat number and its power 
			int numberp = i%10 ; 
			int nup = 1 ; 
			
			//  again using the loop for the finding the power 
			for (int j = 0; j < sizenumber(n); j++) {
				
				nup = nup*numberp ; 
				
			}
			
			totalnumber += nup ; 
			
			
			
		}
		System.out.println(totalnumber);
		
		
		// mow check the codtion 
		if (n == totalnumber ) {
			return true ; 
		}else {
			return false ; 
		}
		
	
		
	}
	
	
	
	
	public static List<String>astrony(List<Integer>arry){
		
		// now creating the diffrenet obejct 
		List<String>resultString = new ArrayList<>() ; 
		
	for (int i = 0; i < arry.size(); i++) {
		
		
		// it this checking the element if right then add other wise not 
		
		if (stronnymenber(arry.get(i)) == true ) {
			// now adding in in the string number 
			resultString.add("this is the astrony number") ; 
		}else {
			resultString.add("this is the not astroynumber") ; 
		}
		
		
		
	}
		
	// now return the function 
	return resultString ; 
			
		
		
	}
	
	
	// now creating the printfunction 
	
	public static <E> void print(List<E>pri) {
		for (E astory : pri) {
			System.out.println(astory);
		}
	}
	
	// now creating the another function for the taking the input 
	
	public static List<Integer>takeinput(){
		
		// creating the for loop and take input 
		System.out.println("enter the number you want to add ");
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		// now creating the the generting the list 
		List<Integer>shivam = new ArrayList<>() ; 
		
		
		// now we are are adding the elemnt in the list 
		shivam.add(234) ; 
		shivam.add(9) ; 
		shivam.add(153);
		
		// now agian adding the element in the number 
		
		
		// now checking the calling for the size 
		
	//	System.out.println(sizenumber(347));
		
		// now checking the printng number 
//		System.out.println(stronnymenber(8));
		
		
		// now calling the function astronmy 
		
		// now creating the refrence list of thestring 
		List<String>store = astrony(shivam) ; 
		print(store);
		print(shivam);
		// print();
		
		
		
		
	
		
		 
	}

}
