import java.util.ArrayList;

public class TreasureChest {
    // INSTANCE VARIABLES
    private boolean locked = true;
    private ArrayList<Treasure> treasures = new ArrayList<>();

    /**
     * Three options can happen when open is executed. The chest can open or
     * the chest can fail to unlock or the chest can fail to unlock and all of
     * its treasures can be destroyed and the player can take damage
     * @return
     */
    public boolean open(){
        // roll the dice
        double odds = Math.random();

        // it's already open
        if (!locked) return true;

        // 70% chance the chest failed to unlock
        if (odds < .7) return false;

        // 20% chance the chest unlocks
        else if (odds < .9) {
            this.locked = false;
            return true;
        }

        // chest clears itself and hurts the Player (10%)
        else{
            System.out.println("\nTHE CHEST EXPLODED!!! \n");
            treasures.clear(); //empties treasures
            Player.modifyHealth(-(int)(Math.random()*30));
            return false;
        }
        
    }

    /**
     * Adds given treasure to the instance's collection
     * @param treasures
     */
    public void addTreasure(ArrayList<Treasure> treasures){

    }

    /**
     * Removes a treasure from the instance's collection and returns it
     * @return
     */
    public Treasure randomTreasure(){
        if(this.treasures.size() == 0) return null;
        

    }


}
