package entity;

import enums.ReportStatusEnum;
import enums.FeedbackEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Feedback implements Serializable{

    @ManyToOne
    Rental rentals;
    @ManyToOne
    Employee employee;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    private FeedbackEnum issue;
    private String remarks;
    private ReportStatusEnum status;
    private String[] incidentCoordinates;

}
