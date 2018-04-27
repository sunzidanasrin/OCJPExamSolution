package com.urmi.question18;

import java.io.File;
import java.io.IOException;

public class Dos {

public static void main(String[] args) {
		
		File dir = new File("dir");
		
		dir.mkdir();
		
		File f1 = new File(dir, "f1.txt");
		//create kora directory er vetor f1.txt name e file create hbe
		
		try {
			
			f1.createNewFile();
			
			System.out.println("Success");
			
		}catch (IOException e) {
			e.printStackTrace();
		}

		
		File newDir = new File("newDir");
		
		dir.renameTo(newDir);
		
		//dir name ta rename kre newDir create korar jnno ei object
	}

}
