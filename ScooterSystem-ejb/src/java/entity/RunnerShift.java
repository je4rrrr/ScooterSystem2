package entity;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RunnerShift implements Serializable{

    @ManyToOne
    Employee runner;
    Collection<PickUpTransaction> pickupTransactions;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long runnerShiftId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDateTime;

}
