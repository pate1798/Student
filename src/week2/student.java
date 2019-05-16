/*
 *  Jeel Patel
 * Student ID: 991548626
 *  PROG24178 OOP-2 Java 
 */
package week2;

/**
 *
 * @author jeel
 */
public class student {

    private static int numofstudent = 0;
    private final String id;
    private final String name;
    private int grade;

    student(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        numofstudent++;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void setNumofstudent(int numofstudent) {
        student.numofstudent = numofstudent;
    }
   
    public void output(){
        System.out.println
    }
    
}
