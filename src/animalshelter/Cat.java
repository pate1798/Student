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
public class Cat extends Animal implements Hostable {
 
    public Cat(){
    super("Tiger","Russian Blue", "something", 2015,1,1);
    }
    
    public Cat(String name, String breed, String description, int year, int month, int day){
        super(name,breed, description, year,month,day);
        
    }
    
    public short adoptionFee(){
        return (short)(200 - getAge() * 10);
    }
     public String walkingInstuction(){
        return"walking instruction are:"+ " "+super.getName();
    }
}
