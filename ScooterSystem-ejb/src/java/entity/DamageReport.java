package entity;

import enums.ReportStatusEnum;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DamageReport implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long damageReportId;
    @ManyToOne
    private Employee repairman;
    @ManyToOne
    private Employee reportingRunner;
    @OneToMany
    private List<RepairLineItem> repairLineItem;
    @ManyToOne
    private Scooter affectedScooter;
    private ReportStatusEnum status;
    private String issue;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    /**
     * @return the damageReportId
     */
    public Long getDamageReportId() {
        return damageReportId;
    }

    /**
     * @param damageReportId the damageReportId to set
     */
    public void setDamageReportId(Long damageReportId) {
        this.damageReportId = damageReportId;
    }

    /**
     * @return the repairman
     */
    public Employee getRepairman() {
        return repairman;
    }

    /**
     * @param repairman the repairman to set
     */
    public void setRepairman(Employee repairman) {
        this.repairman = repairman;
    }

    /**
     * @return the reportingRunner
     */
    public Employee getReportingRunner() {
        return reportingRunner;
    }

    /**
     * @param reportingRunner the reportingRunner to set
     */
    public void setReportingRunner(Employee reportingRunner) {
        this.reportingRunner = reportingRunner;
    }

    /**
     * @return the repairLineItem
     */
    public List<RepairLineItem> getRepairLineItem() {
        return repairLineItem;
    }

    /**
     * @param repairLineItem the repairLineItem to set
     */
    public void setRepairLineItem(List<RepairLineItem> repairLineItem) {
        this.repairLineItem = repairLineItem;
    }

    /**
     * @return the affectedScooter
     */
    public Scooter getAffectedScooter() {
        return affectedScooter;
    }

    /**
     * @param affectedScooter the affectedScooter to set
     */
    public void setAffectedScooter(Scooter affectedScooter) {
        this.affectedScooter = affectedScooter;
    }

    /**
     * @return the status
     */
    public ReportStatusEnum getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ReportStatusEnum status) {
        this.status = status;
    }

    /**
     * @return the issue
     */
    public String getIssue() {
        return issue;
    }

    /**
     * @param issue the issue to set
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

}
