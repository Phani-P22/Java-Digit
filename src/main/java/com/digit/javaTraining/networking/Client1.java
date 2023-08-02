package com.digit.javaTraining.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket csoc = new Socket("10.1.131.214", 4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		Scanner sc = new Scanner(System.in);

		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		while (true) {
			System.out.println("Enter Message: ");
			String msg = sc.nextLine();
			if (msg.equals("QUIT")) {
				break;
			}

			dos.writeUTF(msg);

			String temp = dis.readUTF();
			System.out.println(temp);
		}
		
		csoc.close();
		sc.close();
	}
}
