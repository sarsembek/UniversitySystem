package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Enums.StudentDegree;
import model.Student;

public class Test {
	public static void main(String[] args) throws IOException{
		Student s = new Student("Arman","Sarsembek","ar_srsembek","armanio",StudentDegree.PHD,1050000);
		try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("students.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(s);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
		try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream("students.txt");
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            s = (Student)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println(s.getfName());
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)-+
        
        {
            System.out.println("ClassNotFoundException is caught");
        }
	}
}
