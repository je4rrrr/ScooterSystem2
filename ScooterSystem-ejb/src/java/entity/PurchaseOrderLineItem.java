package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PurchaseOrderLineItem implements Serializable{

    @OneToOne
    InventoryItem inventoryItem;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseOrderLineItemId;
    private Integer quantityToPurchase;
    private BigDecimal totalValueOfLineItem;

}
