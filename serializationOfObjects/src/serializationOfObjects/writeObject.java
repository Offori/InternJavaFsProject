package serializationOfObjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeObject {
	public static void main(String[] args) {
		Vehicle bike=new Vehicle("Bike", 9444);
		Vehicle car=new Vehicle("Car", 4268);
		
		System.out.println(bike);
		
		try(FileOutputStream fos=new FileOutputStream("studyeasy\\vehicles.dat")){
			try(ObjectOutputStream obj=new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				
				System.out.println("Object written onto the file");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
		}
	}
}
