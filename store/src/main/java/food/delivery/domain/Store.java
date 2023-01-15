package food.delivery.domain;

import food.delivery.domain.Accepted;
import food.delivery.domain.Rejected;
import food.delivery.domain.Cookingstarted;
import food.delivery.domain.Cookingfinished;
import food.delivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Store_table")
@Data

public class Store  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderid;
    
    
    
    
    
    private String storeid;
    
    
    
    
    
    private String menuid;
    
    
    
    
    
    private String qty;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();



        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();



        Cookingstarted cookingstarted = new Cookingstarted(this);
        cookingstarted.publishAfterCommit();



        Cookingfinished cookingfinished = new Cookingfinished(this);
        cookingfinished.publishAfterCommit();

    }

    public static StoreRepository repository(){
        StoreRepository storeRepository = StoreApplication.applicationContext.getBean(StoreRepository.class);
        return storeRepository;
    }




    public static void orderIntoTransfer(Orderplaced orderplaced){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderplaced.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }
    public static void cancelCook(Ordercanceled ordercanceled){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordercanceled.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }


}
