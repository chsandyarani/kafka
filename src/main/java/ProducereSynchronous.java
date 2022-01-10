import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class ProducereSynchronous {

	public static void main(String[] args) {

		Properties obj1 = new Properties();

		// setting properties
		obj1.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		obj1.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		obj1.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "StudentSerializer");
		Student student = new Student("sandya","kmc","1234");
		// creating object for producer
		KafkaProducer<String,Student> obj = new KafkaProducer<String,Student>(obj1);
		// creating a record
	
		ProducerRecord<String, Student> record = new ProducerRecord<String,Student>("new1",student);
	obj.send(record);
	System.out.println(record.topic());
	
	System.out.println(record.value());
	obj.flush();
	obj.close();
	
	
	}
	

}
