/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshelter;

/**
 *  may27,2019
 * @author jeel
 */
public class AnimalShelter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog();
        Dog d2 = new Dog("Tera", "Dane", "description", 2016, 2, 3);
        Cat c1 = new Cat();
        Cat c2 = new Cat("Mawi", "Shorthair Domestic", "domestic", 2010,4,1);
        Horse h1=new Horse();
        Horse h2=new Horse("Ginger","thunder bolt","lighting",2000,10,8,9.6);
        Plant p1= new Plant();
        
        Shelter s1 = new Shelter();
        s1.addClient((Hostable)d1,(Hostable)d2,(Hostable)c1,(Hostable)c2,(Hostable)h1,(Hostable)h2,(Hostable)p1);
        Animal a1 = new Dog();
    //    if (a1 instanceof Hostable){
      //      System.out.println("succes");
    for(Hostable h: s1.getClient()){
        if(h instanceof Walkable){
            
        
        System.out.println(((Walkable) h).walkingInstuction());
    }
    }
    Dog d3 = new Dog();
    if(d3 instanceof Dog){
        System.out.println("I am dog");
    }
    if(d3 instanceof Animal){
        System.out.println("I am animal");
    }
    if(d3 instanceof Walkable){
        System.out.println("I am walkable");
    }
    if(d3 instanceof Hostable){
        System.out.println("I am Hostable");
    }
    
        
     /*   Animal a2=new Animal();
        
       
        System.out.println(c1.adoptionFee());
        System.out.println(h1.adoptionFee());
        System.out.println(h1.getHeight());
        System.out.println(d1.adoptionFee());
        System.out.println("animal fee :"+ a1.adoptionFee());
        System.out.println(a2.adoptionFee());
        
        Shelter shelter1 = new Shelter();
        shelter1.addClient(d1);
        shelter1.addClient(d2, c1, c2);
        shelter1.addClient(h1,h2);
        
        for (int i = 0; i < shelter1.getClient().size(); i++) {
            Animal a= shelter1.getClient().get(i);
            System.out.println(shelter1.getClient().get(i).getName()); 
        }
        
        */
    }
    
}
