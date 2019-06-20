/*
 *  Jeel Patel
 * Student ID: 991548626
 *  PROG24178 OOP-2 Java 
 */
package animalshelter;

/**
 *
 * @author jeel
 */
public class Horse extends Animal implements Hostable {
    private double height;
    
      public Horse(){
    this("black horse","Poodle", "something", 2015,1,1,3.1);
    }
    
    public Horse(String name, String breed, String description, int year, int month, int day,double height){
        super(name,breed, description, year,month,day);
        this.height=height;
        
    }

    public double getHeight() {
        return height;
    }
    
    
    public short adoptionFee(){
        return (short)(2000 - getAge() * 15);
    }
     public String walkingInstuction(){
        return" walking instruction for: "+ " " +super.getName();
    }
    
}
