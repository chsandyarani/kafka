import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.kafka.common.serialization.Deserializer;

public class Student_DeSerializer implements Deserializer<Student> {
	 

	    public Student deserialize(String s, byte[] bytes) {
	        try {

	            ByteArrayInputStream byteArrayInputStream= new ByteArrayInputStream(bytes);
	            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
	            Student student = (Student) objectInputStream.readObject();
	            objectInputStream.close();

	           return student;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;

	            
	            
	}
	    }
	        
	    public void close()
        {
        	
    }
}