package serializationOfObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readObject {
	public static void main(String[] args) {
		try(FileInputStream FIO=new FileInputStream("studyeasy\\vehicles.dat")){
			try(ObjectInputStream OBJ=new ObjectInputStream(FIO)){
				try {
					Vehicle v1=(Vehicle)OBJ.readObject();
					Vehicle v2=(Vehicle)OBJ.readObject();
					
					System.out.println(v1);
					System.out.println(v2);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
