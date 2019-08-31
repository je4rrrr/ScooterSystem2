package entity;

import enums.AreaEnum;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class ScooterPark implements Serializable{

    @OneToMany(mappedBy = "lastParkedAt")
    List<Scooter> scootersAvailable;
    @ManyToMany
    List<Advertisement> advertisements;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scooterParkId;
    private AreaEnum area;
    private String[] coordinates;
    private Integer capacity;
    private String name;

}
