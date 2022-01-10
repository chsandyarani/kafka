import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

public class StudentSerializer  implements Serializer{
	

	public byte[] serialize(String topic, Object data) {
		  try {
	            Student student = (Student) data;
	            ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
	            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
	            objectOutputStream.writeObject(student);
	            objectOutputStream.close();
	            byte[] b = byteArrayOutputStream.toByteArray();
	            return b;
	        } catch (Exception e) {
	            return new byte[0];
	        }
	    }



	 public void close() {

	    }
	

}
