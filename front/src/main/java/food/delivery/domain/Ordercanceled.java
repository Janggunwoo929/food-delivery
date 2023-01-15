package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordercanceled extends AbstractEvent {

    private Long id;
    private String userid;
    private String menuid;
    private String qty;
    private String status;
    private String storeid;

    public Ordercanceled(Order aggregate){
        super(aggregate);
    }
    public Ordercanceled(){
        super();
    }
}
