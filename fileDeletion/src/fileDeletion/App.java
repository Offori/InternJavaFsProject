package fileDeletion;

import java.io.File;

public class App {
	public static void main(String[] args) {
		File file=new File("StudyEasy\\Team.txt");
		if(file.delete()) {
			System.out.println("Deletion successful");
		}else {
			System.out.println("Error");
		}
	}
}
