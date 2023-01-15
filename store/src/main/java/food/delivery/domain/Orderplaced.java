package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Orderplaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String menuid;
    private String qty;
    private String status;
    private String storeid;
}


