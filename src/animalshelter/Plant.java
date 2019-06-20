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
public class Plant implements Hostable{

    private int id;
    private String species;
    private String type;
    
    public Plant(){
        
    };

    public Plant(int id, String species, String type) {
        this.id = id;
        this.species = species;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    

}
