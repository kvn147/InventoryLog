import java.util.*;

/*
 * Kevin Nguyen
 * 04/09/2024
 * InventoryEngine.java tests InventoryLog.java
 * Creates a new InventoryLog
 */

public class InventoryEngine {

    public static void main(String[] args) {
        InventoryLog inventoryLog = new InventoryLog();
        testInventory_Log(inventoryLog);
    }

    // Adding, subtracting, setting and getting a character,
    // and checking if inventory contains a character
    public static void testInventory_Log(InventoryLog inventory) {
        inventory.add('a');
        inventory.add('z');
        inventory.add('c');
        inventory.add('c');
        inventory.add('c');
        inventory.add('a');
        System.out.println(inventory);
        inventory.subtract('c');
        System.out.println(inventory);
        inventory.set('k', 1);
        System.out.println("As = " + inventory.get('k'));
        System.out.println(inventory.contains('a'));
    }
}

/*
 * Output:
 * azccca
 * aza
 * As = 1
 * true
 */