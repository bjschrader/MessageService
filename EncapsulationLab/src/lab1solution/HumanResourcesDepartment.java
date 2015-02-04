/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author schra_000
 */
public class HumanResourcesDepartment {
    
    
    private Date currentDate;
    private String cubeId;
    
    private Employee employee;
    
    public String dateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
    }
   public void hireEmployee(String firstName, String lastName, String ssn){
      employee.getFirstName();
      employee.getLastName();
      employee.getSsn();
   }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
