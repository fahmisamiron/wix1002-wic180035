package pokemon;

import java.util.Random;

public class Pokemon {
    private String ID, name, elementType;
    private int HP, attack, defense, speed, special, level;

    public Pokemon(String ID, String name, String elementType) {
        this.ID = ID;
        this.name = name;
        this.elementType = elementType;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public void generateRandom() {
        Random g = new Random();
        
        System.out.println("ID : " + ID + "\nName : " + name + "\nElement Type : " + elementType + "\n");
        
        System.out.println("Initial stat");
        
        HP = g.nextInt(11)+15;
        System.out.println("Hit Point : " + HP);
        
        attack = g.nextInt(8)+10;
        System.out.println("Attack : " + attack);
        
        defense = g.nextInt(8)+10;
        System.out.println("Defense : " + defense);
        
        speed = g.nextInt(11)+5;
        System.out.println("Speed : " + speed);
        
        special = g.nextInt(6)+5;
        System.out.println("Special : " + special + "\n");
    }
    
    public void increaseLevel() {
        Random r = new Random();
        
        System.out.println("Level Up!!");
        
        HP+=r.nextInt(4)+2;
        System.out.println("Hit Point : " + HP);
        
        attack+=r.nextInt(3)+1;
        System.out.println("Attack : " + attack);
        
        defense+=r.nextInt(3)+1;
        System.out.println("Defense : " + defense);
        
        speed+=r.nextInt(3)+1;
        System.out.println("Speed : " + speed);
        
        special+=r.nextInt(3)+1;
        System.out.println("Special : " + special + "\n");
    }
}
package pokemon;

public class tester {
    public static void main(String []args) {
        Pokemon p = new Pokemon("WIC180035","Bulbasaur","Leaf");
        p.generateRandom();
        p.increaseLevel();
        p.increaseLevel();
        p.increaseLevel();
    }
}
package barbie;

import java.util.Random;

public class Doll {
    private String name;
    private int hairColor, attire, longOrShort;

    public Doll(String name, int hairColor, int attire, int longOrShort) {
        this.name = name;
        this.hairColor = hairColor;
        this.attire = attire;
        this.longOrShort = longOrShort;
    }

    public void generateRandom() {
        Random g = new Random();
        
        System.out.println("Name : " + name);
        
        System.out.print("Hair color : ");
        hairColor = g.nextInt(3);
        switch (hairColor) {
            case 0:
                System.out.println("Red");
                break;
            case 1:
                System.out.println("Green");
                break;
            default:
                System.out.println("Blue");
                break;
        }
        
        System.out.print("Attire : ");
        attire = g.nextInt(3);
        switch (attire) {
            case 0:
                System.out.println("Shirt");
                break;
            case 1:
                System.out.println("Dress");
                break;
            default:
                System.out.println("Jacket");
                break;
        }
        
        System.out.print("Hair : ");
        longOrShort = g.nextInt(2);
        switch (longOrShort) {
            case 0:
                System.out.println("Long");
                break;
            default:
                System.out.println("Short");
                break;
        }
        System.out.println("");
    }
    
    public void hair() {
        if (longOrShort == 0) {
            System.out.println("Hair has been cut\nHair : Short");
            System.out.println("");
        }
    }
    
    public void colorOfHair() {
        Random l = new Random();
        System.out.print("Hair color has been changed\nHair color : ");
        
        if (hairColor == 0) {
            l.nextInt(2);
            if (l.nextInt(2) == 0)
                System.out.println("Green");
            else
                System.out.println("Blue");
        }
        
        else if (hairColor == 1) {
            l.nextInt(2);
            if (l.nextInt(2) == 0)
                System.out.println("Red");
            else
                System.out.println("Blue");
        }
        
        else {
            l.nextInt(2);
            if (l.nextInt(2) == 0)
                System.out.println("Green");
            else
                System.out.println("Red");
        }
        System.out.println("");
    }
}
package barbie;

public class tester {
    public static void main (String [] args) {
        Doll d = new Doll("Barbie", 0, 0, 0);
        d.generateRandom();
        d.hair();
        d.colorOfHair();
    }
}

