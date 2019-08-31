package entity;

import enums.PickUpStatusEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PickUpTransaction implements Serializable{

    @ManyToOne
    TransportVehicle transportVehicle;
    @OneToOne
    Scooter oldScooter;
    @OneToOne
    Scooter newScooter;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pickupTransactionId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    private PickUpStatusEnum status;
    private String remarks;

}
