/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanv
 */
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+": "+this.name; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        
        if (!(o instanceof Item)){
            return false;
        }
        
        Item castedO = (Item)o;
        
        return this.id.equals(castedO.id);
    }
    
    
}
