package com.digit.javaTraining.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOps {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\phaneendra.kotha\\Desktop\\Input.txt");
			int temp;
			FileOutputStream fos = new FileOutputStream("C:\\Users\\phaneendra.kotha\\Desktop\\Output.txt");
			
			while((temp = fis.read()) != -1) {
				fos.write(temp);
			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
