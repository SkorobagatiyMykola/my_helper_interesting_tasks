package ua.skorobahatyi.help_kafka;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class SimpleProducer {
    public static void main(String[] args) {

        // 1. Налаштування продюсера
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092,localhost:9093");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,   StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // Дуже важливі production-налаштування (2025+ стандарт)
        props.put(ProducerConfig.ACKS_CONFIG, "all");              // чекаємо підтвердження від усіх реплік
        props.put(ProducerConfig.RETRIES_CONFIG, 5);               // або Integer.MAX_VALUE
        props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, true); // увімкнення ідемпотентності (exactly-once)

        // 2. Створюємо продюсера
        try (KafkaProducer<String, String> producer = new KafkaProducer<>(props)) {

            // 3. Надсилаємо 10 повідомлень
            for (int i = 0; i < 10; i++) {
                String key   = "user-" + i;
                String value = "Подія #" + i + " о " + System.currentTimeMillis();

                ProducerRecord<String, String> record =
                        new ProducerRecord<>("orders", key, value);

                // Асинхронна відправка + callback
                producer.send(record, (metadata, exception) -> {
                    if (exception == null) {
                        System.out.printf("Успіх → topic=%s partition=%d offset=%d%n",
                                metadata.topic(), metadata.partition(), metadata.offset());
                    } else {
                        exception.printStackTrace();
                    }
                });
            }

            // producer.flush();   // примусово відправити все, що залишилось у буфері (не обов'язково)
            // producer.close();   // автоматично викликається завдяки try-with-resources

            System.out.println("Всі повідомлення відправлено асинхронно");
        }
    }
}
