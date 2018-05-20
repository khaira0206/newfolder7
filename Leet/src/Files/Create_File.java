package Files;

import java.io.File;
import java.io.IOException;

public class Create_File {

	public static void main(String[] arg){
		
		int i = 0;
		try { 
			String[] files = new String[100];
			File search = new File("searchThis");
			files = search.list(); // create the list
			for(String fn : files) // iterate through it
			System.out.println("found " + fn);
		
			} catch(Exception e) { }
		
	}
	
}
