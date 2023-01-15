package food.delivery.domain;

import food.delivery.domain.Notified;
import food.delivery.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Notify_table")
@Data

public class Notify  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        Notified notified = new Notified(this);
        notified.publishAfterCommit();

    }

    public static NotifyRepository repository(){
        NotifyRepository notifyRepository = CustomerApplication.applicationContext.getBean(NotifyRepository.class);
        return notifyRepository;
    }




    public static void kakaoNotificationSend(Deliverystarted deliverystarted){

        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliverystarted.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

        
    }
    public static void kakaoNotificationSend(Accepted accepted){

        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

        
    }
    public static void kakaoNotificationSend(Rejected rejected){

        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

        
    }
    public static void kakaoNotificationSend(Cookingfinished cookingfinished){

        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookingfinished.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

        
    }


}
