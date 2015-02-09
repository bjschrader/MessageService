
package lab2;

import java.util.Scanner;

/**
 *
 * @author Brian Schrader
 */
public class Startup {
    
    public static void main (String[] args){
        
        String courseName, courseNumber, prerequisite;
        double credits;
        Scanner keyboard = new Scanner(System.in);
        
        //Use Liskov's Substitution Principle
        
        CollegeProgrammingCourse a = new IntroToProgrammingCourse();
        CollegeProgrammingCourse b = new IntroJavaCourse();
        CollegeProgrammingCourse c = new AdvancedJavaCourse();
        
        //Use standard object instantiation
        IntroToProgrammingCourse d = new IntroToProgrammingCourse();
        IntroJavaCourse e = new IntroJavaCourse();
        AdvancedJavaCourse f = new AdvancedJavaCourse();
        
        System.out.println("Enter in the course number.");
        courseNumber = keyboard.nextLine();
        
        System.out.println("Enter in the course name.");
        courseName = keyboard.nextLine();
        
        System.out.println("Enter in the prerequisite, if any.");
        prerequisite = keyboard.nextLine();
        
        System.out.println("Enter in the number of credits.");
        credits = Double.parseDouble(keyboard.nextLine());
        
        ((IntroToProgrammingCourse)a).setCourseNumber(courseNumber);
        ((IntroToProgrammingCourse)a).setCourseName(courseName);
        ((IntroToProgrammingCourse)a).setCredits(credits);
        
        System.out.println(a.getCourseName() + " " + a.getCourseNumber() + " " +
                ((IntroToProgrammingCourse)a).getCredits());
        
        ((IntroJavaCourse)b).setCourseNumber(courseNumber);
        ((IntroJavaCourse)b).setCourseName(courseName);
        ((IntroJavaCourse)b).setCredits(credits);
        ((IntroJavaCourse)b).setPrerequisites(prerequisite);
        
        System.out.println(b.getCourseName() + " " + b.getCourseNumber() + " " +
                ((IntroJavaCourse)b).getCredits() + " " + 
                ((IntroJavaCourse)b).getPrerequisites());
        
        ((AdvancedJavaCourse)c).setCourseNumber(courseNumber);
        ((AdvancedJavaCourse)c).setCourseName(courseName);
        ((AdvancedJavaCourse)c).setCredits(credits);
        ((AdvancedJavaCourse)c).setPrerequisites(prerequisite);
        
        System.out.println(c.getCourseName() + " " + c.getCourseNumber() + " " +
                ((AdvancedJavaCourse)c).getCredits() + " " + 
                ((AdvancedJavaCourse)c).getPrerequisites());
        
        //With Liskov's Principle, methods not in the superclass are not available
        //to be used by the object without casting it first
        
        d.setCourseNumber(courseNumber);
        d.setCourseName(courseName);
        d.setCredits(credits);
        
        System.out.println(d.getCourseName() + " " + d.getCourseNumber() + " " +
                d.getCredits());
        
        e.setCourseNumber(courseNumber);
        e.setCourseName(courseName);
        e.setCredits(credits);
        e.setPrerequisites(prerequisite);
        
        System.out.println(e.getCourseName() + " " + e.getCourseNumber() + " " +
                e.getCredits() + " " + e.getPrerequisites());
        
        f.setCourseNumber(courseNumber);
        f.setCourseName(courseName);
        f.setCredits(credits);
        f.setPrerequisites(prerequisite);
        
        System.out.println(f.getCourseName() + " " + f.getCourseNumber() + " " +
                f.getCredits() + " " + f.getPrerequisites());

    }
}
