package com.digit.javaTraining.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps2 {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\phaneendra.kotha\\Desktop\\Inp.txt"));
			int temp;
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\phaneendra.kotha\\Desktop\\Output.txt"));

			while ((temp = br.read()) != -1) {
				bw.write(temp);
			}
			bw.flush();
			bw.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
