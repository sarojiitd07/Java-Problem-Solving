package com.in28minutes.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindString {

	public static void main(String[] args) throws FileNotFoundException {
		File lines = new File("resources/data.txt");
		Scanner line = new Scanner(lines);
		while(line.hasNext()){
			String data = line.nextLine();
			System.out.println(findString(data));
		}

	}
	
	
	public static boolean findString(String str) {
		if(str.contains("is")) {
			return true;
		}
		return false;
	}

}
