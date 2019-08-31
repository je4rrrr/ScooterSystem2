package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Advertisement implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advertisementId;
    
    @ManyToMany (mappedBy="advertisements")
    private List<ScooterPark> scooterParks;
    
    private String companyName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;
    private Boolean paid;
    private String image;
    private BigDecimal paymentAmount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDueDate;
    private String email;
    private String contactNum;

    public Advertisement() {
    }

    /**
     * @return the advertisementId
     */
    public Long getAdvertisementId() {
        return advertisementId;
    }

    /**
     * @param advertisementId the advertisementId to set
     */
    public void setAdvertisementId(Long advertisementId) {
        this.advertisementId = advertisementId;
    }

    /**
     * @return the scooterParks
     */
    public Collection<ScooterPark> getScooterParks() {
        return scooterParks;
    }

    /**
     * @param scooterParks the scooterParks to set
     */
    public void setScooterParks(List<ScooterPark> scooterParks) {
        this.scooterParks = scooterParks;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the dateStart
     */
    public Date getDateStart() {
        return dateStart;
    }

    /**
     * @param dateStart the dateStart to set
     */
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * @return the dateEnd
     */
    public Date getDateEnd() {
        return dateEnd;
    }

    /**
     * @param dateEnd the dateEnd to set
     */
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * @return the paid
     */
    public Boolean getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the paymentAmount
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * @param paymentAmount the paymentAmount to set
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return the paymentDueDate
     */
    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * @param paymentDueDate the paymentDueDate to set
     */
    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contactNum
     */
    public String getContactNum() {
        return contactNum;
    }

    /**
     * @param contactNum the contactNum to set
     */
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    

}
