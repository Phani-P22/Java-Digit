package com.digit.javaTraining.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps1 {

	public static void main(String[] args) {

		try {
			FileReader fis = new FileReader("C:\\Users\\phaneendra.kotha\\Desktop\\Ip.txt");
			int temp;
			FileWriter fos = new FileWriter("C:\\Users\\phaneendra.kotha\\Desktop\\Output.txt");

			while ((temp = fis.read()) != -1) {
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
