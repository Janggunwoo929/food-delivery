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
    @Autowired NotifyRepository notifyRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverystarted'")
    public void wheneverDeliverystarted_KakaoNotificationSend(@Payload Deliverystarted deliverystarted){

        Deliverystarted event = deliverystarted;
        System.out.println("\n\n##### listener KakaoNotificationSend : " + deliverystarted + "\n\n");


        

        // Sample Logic //
        Notify.kakaoNotificationSend(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_KakaoNotificationSend(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener KakaoNotificationSend : " + accepted + "\n\n");


        

        // Sample Logic //
        Notify.kakaoNotificationSend(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_KakaoNotificationSend(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener KakaoNotificationSend : " + rejected + "\n\n");


        

        // Sample Logic //
        Notify.kakaoNotificationSend(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Cookingfinished'")
    public void wheneverCookingfinished_KakaoNotificationSend(@Payload Cookingfinished cookingfinished){

        Cookingfinished event = cookingfinished;
        System.out.println("\n\n##### listener KakaoNotificationSend : " + cookingfinished + "\n\n");


        

        // Sample Logic //
        Notify.kakaoNotificationSend(event);
        

        

    }

}


