package servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private final List<String> messages = new ArrayList<>();

    @KafkaListener(topics = "venda-ingresso", groupId = "grupo-processamento-vendas")
    public void listen(String message) {
        synchronized (messages) {
            messages.add(message);
        }
    }

    public List<String> getMessages() {
        synchronized (messages) {
            return new ArrayList<>(messages);
        }
    }
}
