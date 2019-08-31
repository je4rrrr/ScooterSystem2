package entity;

import enums.PurchaseOrderStatusEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PurchaseOrder implements Serializable{

    @OneToMany
    Collection<PurchaseOrderLineItem> purchaseOrderLineItems;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseOrderId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    private Integer quantity;
    private PurchaseOrderStatusEnum status;
    private BigDecimal totalValueOfOrder;

}
