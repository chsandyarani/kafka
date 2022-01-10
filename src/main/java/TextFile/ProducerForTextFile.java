package TextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerForTextFile {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		// TextFileTransfer textfiletransfer = new TextFileTransfer();
		KafkaProducer kafkaproducer = new KafkaProducer(properties);
		// creating a record

		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\connect1\\input.txt"));
		String line = null;
		while (true) {
			line = bufferedReader.readLine();
			if (line == null) {

			} else {
				ProducerRecord<String, String> record = new ProducerRecord<String, String>("connect12", line);
				System.out.println(record.value());
				kafkaproducer.send(record);
				kafkaproducer.flush();

			}

		}
	}
}
