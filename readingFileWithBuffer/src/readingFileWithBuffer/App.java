package readingFileWithBuffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
			File file=new File("StudyEasy");
			file.mkdir();
			file=new File("StudyEasy\\team.txt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while computing");
			}
			try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
				bw.write("Offori\n");
				bw.newLine();
				bw.write("Christ\n");
				bw.newLine();
				bw.write("Black\n");
				bw.newLine();
				bw.write("Best");
				bw.newLine();
				System.out.println("Writing onto the file completed\n");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error occured while writing onto the file");
			}
			try (BufferedReader br = new BufferedReader(new FileReader("StudyEasy\\\\team.txt"))) {
				String line;
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

