import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "java")
public class ProcessadorVendas {
    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(ProcessadorVendas.class, args);
        /*Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, VendaDeserializer.class.getName());
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "grupo-processamento-vendas");
        // properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");:

        // config o consumer para se inscrever no tópico
        try (KafkaConsumer<String, Venda> consumer = new KafkaConsumer<>(properties)) {
            consumer.subscribe(Arrays.asList("venda-ingresso"));

            while (true) {

                ConsumerRecords<String, Venda> retornoConsumoKafkaVendas = consumer.poll(Duration.ofMillis(200));

                for (ConsumerRecord<String, Venda> registroRetornado : retornoConsumoKafkaVendas) {

                    Venda venda = registroRetornado.value();

                    if (new Random().nextBoolean()) {
                        venda.setStatus("APROVADA");
                    } else {
                        venda.setStatus("REPROVADA");
                    }
                    Thread.sleep(500);
                    System.out.println(venda);
                }
            }
        }*/
    }
}
