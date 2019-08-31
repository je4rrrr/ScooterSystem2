package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Transaction implements Serializable{

    @OneToOne
    Rental rental;
    @ManyToOne
    EWallet fromWallet;
    @ManyToOne
    EWallet toWallet;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private BigDecimal amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
