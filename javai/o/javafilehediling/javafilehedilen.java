package javafilehediling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class javafilehedilen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// creating the onject
		FileReader read = null ; 
		FileWriter write = null  ; 
		
		
		// now creating the ohject 
		
		
		
		try {
			
			read = new FileReader("D:\\nptel java leran\\NPTEL_JAVA_DSA\\javai\\o\\javafilehediling\\destination.txt");
			write = new FileWriter("D:\\nptel java leran\\NPTEL_JAVA_DSA\\javai\\o\\javafilehediling\\sorce.txt");
			
			
			// now creating 
			int content  ; 
			while ((content = read.read() ) != -1) {
				
				
				// writing evertihing 
				write.write((byte)content);
	
			}
			
			
		} finally {
			// TODO: handle finally clause 
			
			if (read != null) {
				read.close();
			}
			if (write != null) {
				write.close();
			}
		}
		
		
		
	
	}

}
