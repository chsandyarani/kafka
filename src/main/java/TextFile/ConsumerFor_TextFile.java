package TextFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class ConsumerFor_TextFile {

	public static void main(String[] args) throws FileNotFoundException {
		Properties properties = new Properties();
		// setting the properties
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringDeserializer");
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringDeserializer");
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "grdmglffblmdu");
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		// creating consumer
		KafkaConsumer<String, String> Consumer = new KafkaConsumer(properties);
		// subcribe

		File file = new File("C:\\Connect1\\output.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		// writing data
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
		Consumer.subscribe(Collections.singletonList("connect12"));

		while (true) {
			ConsumerRecords<String, String> records = Consumer.poll(100);
			for (ConsumerRecord<String, String> record : records) {
			
				try {
					bufferedWriter.write(record.value().toString());
					System.out.println(record.value().toString());
					bufferedWriter.flush();
					bufferedWriter.newLine();
					System.out.print("");
				
				} catch (Exception e) {
						
				}
			}

		}

	}
}
