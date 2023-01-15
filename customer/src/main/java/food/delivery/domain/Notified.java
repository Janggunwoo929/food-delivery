package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;

    public Notified(Notify aggregate){
        super(aggregate);
    }
    public Notified(){
        super();
    }
}
