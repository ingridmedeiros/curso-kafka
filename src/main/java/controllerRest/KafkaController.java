package controllerRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import servico.KafkaConsumerService;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaConsumerService kafkaConsumerService;

    @GetMapping("/messages")
    public List<String> getMessages() {
        return kafkaConsumerService.getMessages();
    }
}
