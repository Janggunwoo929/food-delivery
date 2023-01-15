package food.delivery.domain;

import food.delivery.domain.Orderplaced;
import food.delivery.domain.Ordercanceled;
import food.delivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String userid;
    
    
    
    
    
    private String menuid;
    
    
    
    
    
    private String qty;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String storeid;

    @PostPersist
    public void onPostPersist(){


        Orderplaced orderplaced = new Orderplaced(this);
        orderplaced.publishAfterCommit();



        Ordercanceled ordercanceled = new Ordercanceled(this);
        ordercanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void updateOrderStatus(Accepted accepted){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void updateOrderStatus(Rejected rejected){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
