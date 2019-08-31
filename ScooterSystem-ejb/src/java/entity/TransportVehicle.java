package entity;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TransportVehicle implements Serializable{

    @OneToMany
    private List<PickUpTransaction> pickupTransactions;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transportVehicleId;
    private String registrationNum;
    private Integer capacity;

    /**
     * @return the pickupTransactions
     */
    public List<PickUpTransaction> getPickupTransactions() {
        return pickupTransactions;
    }

    /**
     * @param pickupTransactions the pickupTransactions to set
     */
    public void setPickupTransactions(List<PickUpTransaction> pickupTransactions) {
        this.pickupTransactions = pickupTransactions;
    }

    /**
     * @return the transportVehicleId
     */
    public Long getTransportVehicleId() {
        return transportVehicleId;
    }

    /**
     * @param transportVehicleId the transportVehicleId to set
     */
    public void setTransportVehicleId(Long transportVehicleId) {
        this.transportVehicleId = transportVehicleId;
    }

    /**
     * @return the registrationNum
     */
    public String getRegistrationNum() {
        return registrationNum;
    }

    /**
     * @param registrationNum the registrationNum to set
     */
    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    /**
     * @return the capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
