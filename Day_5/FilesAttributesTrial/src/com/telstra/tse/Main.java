package com.telstra.tse;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\d977013\\Downloads\\Telstra.txt");
		try {
			file.createNewFile();
			System.out.println("File Created Successfully...");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Absolute Path : "+file.getAbsolutePath());
		System.out.println("File Name : "+file.getName());
		System.out.println("File Parent : "+file.getParent());

		File fileA = new File("C:\\Users\\d977013\\Downloads","TelstraA.txt");
		try {
			fileA.createNewFile();
			System.out.println("FileA Created Successfully...");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		File dir = new File("C:\\Users\\d977013\\Downloads");
		File[] fileList = dir.listFiles();
		System.out.println("List of files in C:\\Users\\d977013\\Downloads are");
		for(File f:fileList) {
			if(f.isFile())
				System.out.println("   "+f.getName());
		}
	}
}
