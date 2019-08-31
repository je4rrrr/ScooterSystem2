/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.DamageReport;
import exception.CreateNewDamageReportException;
import exception.DamageReportNotFoundException;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface DamageReportControllerLocal {

    public DamageReport createNewDamageReport(DamageReport damageReport) throws CreateNewDamageReportException;

    public DamageReport retrieveDamageReportById(Long damageReportId) throws DamageReportNotFoundException;

    public DamageReport updateDamageReport(DamageReport newDamageReport) throws DamageReportNotFoundException;

    public void deleteDamageReport(Long damageReportId) throws DamageReportNotFoundException;
    
}
