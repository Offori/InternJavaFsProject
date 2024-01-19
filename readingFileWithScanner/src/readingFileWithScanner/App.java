package readingFileWithScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(new File("test.txt"));
			String line;
			while(sc.hasNext()) {
				line=sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while reading file");
		}
	}
}
