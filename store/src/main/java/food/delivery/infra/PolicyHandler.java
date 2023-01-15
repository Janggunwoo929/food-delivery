package food.delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import food.delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import food.delivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired StoreRepository storeRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Orderplaced'")
    public void wheneverOrderplaced_OrderIntoTransfer(@Payload Orderplaced orderplaced){

        Orderplaced event = orderplaced;
        System.out.println("\n\n##### listener OrderIntoTransfer : " + orderplaced + "\n\n");


        

        // Sample Logic //
        Store.orderIntoTransfer(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordercanceled'")
    public void wheneverOrdercanceled_CancelCook(@Payload Ordercanceled ordercanceled){

        Ordercanceled event = ordercanceled;
        System.out.println("\n\n##### listener CancelCook : " + ordercanceled + "\n\n");


        

        // Sample Logic //
        Store.cancelCook(event);
        

        

    }

}


