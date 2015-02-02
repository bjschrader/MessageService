package lab1solution;

/**
 *
 * @author Brian Schrader
 */
public class Startup {
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        
        employee.setFirstName("Bob");
        employee.setLastName("Vila");
        employee.setSsn("867-53-0999");
        HumanResourcesDepartment hrd = new HumanResourcesDepartment();
        
        employee.meetDepartmentStaff();
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.reviewDeptPolicies();

        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
}
