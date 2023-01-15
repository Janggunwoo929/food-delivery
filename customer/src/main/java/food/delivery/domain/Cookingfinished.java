package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Cookingfinished extends AbstractEvent {

    private Long id;
    private String orderid;
    private String storeid;
    private String menuid;
    private String qty;
    private String address;
    private String status;
}


