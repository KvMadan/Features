package in.km;

import java.io.File;
import java.io.IOException;

public class Dummy {

	public static void main(String[] args) throws IOException {
		
		String current = new java.io.File( "." ).getCanonicalPath();
		
		String home = current + "\\src\\in\\km\\";
		
		File jmeterhome = new File (home);
		
        System.out.println("Current dir:"+current);
		
		if (jmeterhome.exists()) {
			System.out.println("Exists");
		}
		else {
			System.out.println("None");
		}

	}

}
