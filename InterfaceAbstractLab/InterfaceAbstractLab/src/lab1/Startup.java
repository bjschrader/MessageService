
package lab1;


/**
 *
 * @author Brian Schrader
 */
public class Startup {
    
    public static void main(String[] args) {
        
        CollegeProgrammingCourse course = new AdvancedJavaCourse("Advanced Java", "10291", 2.5);
        System.out.println(course.getCourseName() + ", " + course.getCourseNumber() + ", " + course.getCredits());
        
      
    }
}
