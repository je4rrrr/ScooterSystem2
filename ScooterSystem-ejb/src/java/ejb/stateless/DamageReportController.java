/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.DamageReport;
import exception.CreateNewDamageReportException;
import exception.DamageReportNotFoundException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class DamageReportController implements DamageReportControllerLocal {

    @PersistenceContext(unitName = "ScooterSystem-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public DamageReport createNewDamageReport (DamageReport damageReport) throws CreateNewDamageReportException{
        try{
            damageReport.setRepairman(null);
            em.persist(damageReport);
            //add new scooter to warehouse!!
            return damageReport;
        }
        catch (Exception ex) {
            System.out.println("persistence exception thrown in createNewDamageReport");
            throw new CreateNewDamageReportException("persistence exception thrown in createNewDamageReport");
        }
    }
    
    @Override
    public DamageReport retrieveDamageReportById(Long damageReportId) throws DamageReportNotFoundException {
        DamageReport damageReport = em.find(DamageReport.class, damageReportId);
        if (damageReport != null) {
            damageReport.getRepairLineItem().size();
            return damageReport;
        } else {
            throw new DamageReportNotFoundException("Damage Report with id " + damageReportId + " does not exist");
        }
    }
    
    @Override
    public DamageReport updateDamageReport(DamageReport newDamageReport) throws DamageReportNotFoundException {
        
        
        DamageReport damageReportToUpdate = retrieveDamageReportById(newDamageReport.getDamageReportId());
        damageReportToUpdate.setAffectedScooter(newDamageReport.getAffectedScooter());
        damageReportToUpdate.setDate(newDamageReport.getDate());
        damageReportToUpdate.setIssue(newDamageReport.getIssue());
        damageReportToUpdate.setRepairLineItem(newDamageReport.getRepairLineItem());
        damageReportToUpdate.setRepairman(newDamageReport.getRepairman());
        damageReportToUpdate.setReportingRunner(newDamageReport.getReportingRunner());
        damageReportToUpdate.setStatus(newDamageReport.getStatus());

        
        return damageReportToUpdate;
    }
    
    @Override
    public void deleteDamageReport(Long damageReportId) throws DamageReportNotFoundException {
        
        DamageReport damageReport = retrieveDamageReportById(damageReportId);
        em.remove(damageReport);
    }
    

}
