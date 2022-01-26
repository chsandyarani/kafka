import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

//import org.apache.kafka.clients.producer.ProducerConfig;

//import kafka.tools.ConsoleConsumer.ConsumerConfig;

public class Consumer {

	public static void main(String[] args) {
		// creating properties
		Properties properties = new Properties();
		// setting the properties
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringDeserializer");
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "Student_DeSerializer");
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG,"groupname");
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
		// creating consumer
		KafkaConsumer<String, Student> Consumer = new KafkaConsumer(properties);
		// Subscribing
		Consumer.subscribe(Collections.singletonList("new1"));

		while (true) {
			ConsumerRecords<String, Student> consumerRecords = Consumer.poll(Duration.ofMillis(200));
			for (ConsumerRecord<String, Student> consumerRecord : consumerRecords) 
			{
				
				System.out.println(consumerRecord);
				System.out.println("key :"+consumerRecord.key()+"value :"+consumerRecord.value()+"offset :"+consumerRecord.offset());
			}
		}
	}

}
