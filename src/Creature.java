/**
 * A basic building block for an opponent
 */
public class Creature {
    // INSTANCE VARIABLES aka "this"
    private String name;
    private int health = 100;
    private Treasure booty; 

    // CONSTRUCTORS
    
    public Creature(String name){
        System.out.println(name + " is born!");
        this.name = name;
    }

    public Creature(String name, int health){
        this(name);
        this.health = health;
    }
 
    public Creature(String name, Treasure t){
        this(name);
        booty = t;
    }

    public Creature() {
        this("Villager");
    }

    // ACCESSORS -- part of the concept of encapsulation 

    public String name() {
        return this.name;
    }

    public int health() {
        return this.health;
    }

    public Treasure getTreasure() {
        return this.booty;
    }

    // MUTATORS -- another part of encapsulation

    public void name(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " - Health:" + this.health;
    }
}
