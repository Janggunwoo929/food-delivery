package food.delivery.domain;

import food.delivery.domain.Deliverystarted;
import food.delivery.domain.Deliverycompleted;
import food.delivery.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Rider_table")
@Data

public class Rider  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderid;
    
    
    
    
    
    private String storeid;
    
    
    
    
    
    private String riderid;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String statusid;
    
    
    
    
    
    private String menuid;

    @PostPersist
    public void onPostPersist(){


        Deliverystarted deliverystarted = new Deliverystarted(this);
        deliverystarted.publishAfterCommit();



        Deliverycompleted deliverycompleted = new Deliverycompleted(this);
        deliverycompleted.publishAfterCommit();

    }

    public static RiderRepository repository(){
        RiderRepository riderRepository = RiderApplication.applicationContext.getBean(RiderRepository.class);
        return riderRepository;
    }




    public static void updateOrderStatus(Cookingstarted cookingstarted){

        /** Example 1:  new item 
        Rider rider = new Rider();
        repository().save(rider);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookingstarted.get???()).ifPresent(rider->{
            
            rider // do something
            repository().save(rider);


         });
        */

        
    }


}
