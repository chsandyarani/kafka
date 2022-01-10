import java.util.Properties;

import org.apache.kafka.clients.Metadata;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Producer {

	public static void main(String[] args) {
		// create object for properties

		Properties obj1 = new Properties();

		// setting properties
		obj1.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		obj1.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		obj1.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		
		
		//creating java class object
		
		// creating object for producer
		KafkaProducer obj = new KafkaProducer(obj1);
		// creating a record
		ProducerRecord pr = new ProducerRecord ("topic2", "have a nice day ");
		
		//to receive acknowledge
		

		obj.send(pr, new Callback() {

			public void onCompletion(RecordMetadata recordmetadata, Exception exception) {

				Logger logger = LoggerFactory.getLogger(Producer.class);
				if (exception == null) {

					logger.info("\n successfully recieved the details as:\n" + "topic:" + recordmetadata.topic() + "\n"
							+ "partition:" + recordmetadata.partition() + "\n" + "offset" + recordmetadata.offset()
							+ "\n" + "timestamp" + recordmetadata.timestamp());

				} else {
					logger.error("cant produce,getting error", exception);
				}
			}
		});

		obj.flush();
		obj.close();

	}

}

