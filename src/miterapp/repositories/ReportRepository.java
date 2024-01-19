/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.repositories;

import miterapp.models.Report;
import miterapp.services.MainService;

/**
 *
 * @author begoingtodev
 */
public class ReportRepository extends MainService<Report>{

    public ReportRepository() {
        super.clazz = Report.class;
    }
    
    
    public Class<Report> getClazz(){
        return this.clazz;
    }
}
