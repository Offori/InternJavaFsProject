package creatingFileOnDisk;

import java.io.File;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		File file=new File("Study.txt");//this file is related to the path of the current project(relative path)
		file.createNewFile();
		System.out.println("New file creating");
	}
}
