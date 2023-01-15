package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Deliverystarted extends AbstractEvent {

    private Long id;
    private String orderid;
    private String storeid;
    private String riderid;
    private String address;
    private String statusid;
    private String menuid;

    public Deliverystarted(Rider aggregate){
        super(aggregate);
    }
    public Deliverystarted(){
        super();
    }
}
