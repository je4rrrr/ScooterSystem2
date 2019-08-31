package entity;

import enums.GenderEnum;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rider implements Serializable{

    @OneToMany(mappedBy = "rider")
    List<Rental> rentals;
    @OneToOne
    EWallet eWallet;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long riderId;
    private String username;
    private String password;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    private GenderEnum gender;
    private String email;
    private String mobileNumber;

}
