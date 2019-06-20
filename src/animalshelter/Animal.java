/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshelter;

import java.time.LocalDate;

/**
 *  may27,2019
 * @author jeel
 */
public class Animal {

    private String name;
    private String breed;
    private String description;
    private LocalDate dob = LocalDate.now();
    private Shelter shelter;
    private short height;

    public Animal(){};
    
    public Animal(String name, String breed, String description, int year, int month, int day){
        this.name = name;
        this.breed = breed;
        this.description = description;
       // if month between 1 and 12 and day hmmmmmmmmmmmmmm . maybe try catch
        this.dob = LocalDate.of(year, month, day);
    }
    
    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public String getName() {
        return name;
    }
    public short adoptionFee(){ 
       
        return 0;
    }

    public String getBreed() {
        return breed;
    }

    public String getDescription() {
        return description;
    }

    public Shelter getShelter() {
        return shelter;
    }

    private LocalDate getDob() {
        return dob;
    }
    
    
    public double getAge() {
        LocalDate currentDate = LocalDate.now();
        double age = (currentDate.toEpochDay() - getDob().toEpochDay())/365;
        return age;
    }
    
    
       
}
