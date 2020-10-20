import java.util.ArrayList;

public class UnitTests {
    public static void main(String[] args){

        // CREATE A CREATURE
        System.out.print("\nShould announce a creature: ");
        Creature a = new Creature("Hockey Player");
        System.out.println();

        // CHECK CREATURE'S HEALTH
        System.out.print("\nHealth should be set to 100 by default: ");
        System.out.println(a.health() == 100);
        System.out.println();

        // CHECK CREATURE'S TREASURE
        System.out.print("\nCreature should have no default treasure: ");
        System.out.println(a.getTreasure() == null);
        System.out.println();

        // BUILD A TREASURE
        System.out.print("\nTreasure's name is Golden Hockeystick: ");
        Treasure gh = new Treasure("Golden Hockeystick");
        System.out.println(gh.title().equals("Golden Hockeystick"));
        System.out.println();
        gh.hashCode();

        // TEST THE PLAYER
        System.out.print("\nPlayer should have 100 health: ");
        System.out.println(Player.health() == 100);
        System.out.println();       

        // PICK UP A TREASURE
        Player.pickupTreasure(gh);
        System.out.print("\nPlayer should have 1 item: ");
        System.out.println(Player.satchelSize() == 1);
        System.out.println();    

        // ACTIVATE TREASURE
        System.out.print("\nPlayer should have no active item: ");
        System.out.println(Player.activeTreasures().size() == 0);
        Player.satchel().get(0).activate();
        System.out.print("\nPlayer should have 1 active item: ");
        System.out.println(Player.activeTreasures().size() == 1);
        System.out.println(); 
        
        // FILL A TREASURE CHEST
        System.out.print("\nTreasure chest should have no items: ");
        TreasureChest chesty = new TreasureChest();
        System.out.println(chesty.size() == 0);
        ArrayList<Treasure> sack = new ArrayList<>(); // sack full of treasures!
        sack.add(gh);
        sack.add(new Treasure("Pickle Rick"));
        sack.add(new Treasure("Sword of Galantry", 3000));
        chesty.addTreasure(sack);
        System.out.print("\nTreasure chest should have no items: ");
        System.out.println(chesty.size() == 3);

        // OPEN A TREASURE CHEST
        System.out.print("\nTreasure chest should be locked: ");
        System.out.println(chesty.isLocked() == true);
        System.out.print("\nTreasure chest's open should return true/false: ");
        System.out.println(chesty.open());

        // DRAW A RANDOM OBJECT FROM A CHEST
        TreasureChest hacked = new TreasureChest(false);
        System.out.print("\nTreasure Chest yields a treasure: ");
        System.out.println(hacked.randomTreasure() != null);
    }
}
