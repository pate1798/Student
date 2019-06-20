/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshelter;

import java.util.ArrayList;

/**
 *  may27,2019
 * @author jeel
 */
public class Shelter implements Hostable {
    private String address;
    private String nearestInt;
    private int capacity;
    private ArrayList<Hostable> client = new ArrayList<>();
   
    
    public Shelter(){
    this("121 king st", "King and Yong", 120 );
    }
    
    public Shelter(String address, String nearestInt, int capacity){
        this.address = address;
        this.nearestInt = nearestInt;
        this.capacity = capacity;
    }
    
    public void addClient(Hostable a){
        // can you add a dog with the same name?
        client.add(a);
        
    }
    
    public void addClient(Hostable ... arr){
        // can you add a dog with the same name?
        for(Hostable a: arr){
            client.add(a);
           
        }
    }
   
    public void transfer(Shelter newShelter, Animal a){
        // find it in the array list
        //add it to the arraylist of newShelter
        //remove it from the arraylist
        
    }

    public ArrayList<Hostable> getClient() {
        return client;
    }
    
    
    
    
    
    
    
}
