package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Deliverycompleted extends AbstractEvent {

    private Long id;
    private String orderid;
    private String storeid;
    private String riderid;
    private String address;
    private String statusid;
    private String menuid;

    public Deliverycompleted(Rider aggregate){
        super(aggregate);
    }
    public Deliverycompleted(){
        super();
    }
}
