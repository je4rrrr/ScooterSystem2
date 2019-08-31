package entity;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EWallet implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eWalletId;
    @OneToMany
    List<PointTransaction> toPointTransactions;
    @OneToMany
    List<PointTransaction> fromPointTransactions;
    @OneToMany
    List<Card> cards;
    @OneToMany
    List<Transaction> fromTransactions;
    @OneToMany
    List<Transaction> toTransactions;
    

}
