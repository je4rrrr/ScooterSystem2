package entity;

import enums.AreaEnum;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Warehouse implements Serializable{

    @OneToMany
    Collection<TransportVehicle> transportVehicles;
    @OneToMany
    Collection<Scooter> scooters;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouseId;
    private AreaEnum area;
    private String coordinates;
    private Integer capacity;
    private String name;

}
