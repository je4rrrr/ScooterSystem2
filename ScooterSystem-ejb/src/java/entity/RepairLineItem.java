package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RepairLineItem implements Serializable{
    @OneToOne
    InventoryItem inventoryItem;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long repairLineItemId;
    private Integer quantityUsed;

}
