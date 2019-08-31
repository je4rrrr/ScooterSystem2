package entity;

import enums.ScooterStatusEnum;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Scooter implements Serializable{

    @OneToMany(mappedBy = "scooter")
    private List<Rental> rentals;
    @OneToMany(mappedBy = "affectedScooter")
    private List<DamageReport> damageReports;
    @ManyToOne
    private ScooterPark lastParkedAt;
    @OneToMany
    private List<ScooterFeature> features;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scooterId;
    private ScooterStatusEnum status;
    private String registrationNum;
    private Integer batteryLevel;
    private String[] coordinates;

    /**
     * @return the rentals
     */
    public List<Rental> getRentals() {
        return rentals;
    }

    /**
     * @param rentals the rentals to set
     */
    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    /**
     * @return the damageReports
     */
    public List<DamageReport> getDamageReports() {
        return damageReports;
    }

    /**
     * @param damageReports the damageReports to set
     */
    public void setDamageReports(List<DamageReport> damageReports) {
        this.damageReports = damageReports;
    }

    /**
     * @return the lastParkedAt
     */
    public ScooterPark getLastParkedAt() {
        return lastParkedAt;
    }

    /**
     * @param lastParkedAt the lastParkedAt to set
     */
    public void setLastParkedAt(ScooterPark lastParkedAt) {
        this.lastParkedAt = lastParkedAt;
    }

    /**
     * @return the features
     */
    public List<ScooterFeature> getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(List<ScooterFeature> features) {
        this.features = features;
    }

    /**
     * @return the status
     */
    public ScooterStatusEnum getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ScooterStatusEnum status) {
        this.status = status;
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
     * @return the batteryLevel
     */
    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * @param batteryLevel the batteryLevel to set
     */
    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * @return the coordinates
     */
    public String[] getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates the coordinates to set
     */
    public void setCoordinates(String[] coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return the scooterId
     */
    public Long getScooterId() {
        return scooterId;
    }

    /**
     * @param scooterId the scooterId to set
     */
    public void setScooterId(Long scooterId) {
        this.scooterId = scooterId;
    }

}
