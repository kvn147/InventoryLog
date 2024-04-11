import java.util.*;

/*
 * Kevin Nguyen
 * 04/09/2024
 * InventoryLog.java creates ArrayList inventory for characters to be logged.
 * Adds and subtracts characters, finds and retrieves a character, checks if
 * a character is in it, gives the size of the inventory, and if it is empty.
 */

public class InventoryLog {
    ArrayList<Character> inventory = new ArrayList<>();

    // Adds a character to the end of the ArrayList
    public void add(char c) {
        c = Character.toLowerCase(c);

        if (Character.isLetter(c)) {
            inventory.add(c);
        }
    }

    // Removes all occurrences of a character in the ArrayList
    public void subtract(char c) {
        char target = Character.toLowerCase(c);

        inventory.removeIf(ch -> Character.toLowerCase(ch) == target);
    }

    // Gets the count of occurrences of a character in the ArrayList
     public int get(char c) {
         c = Character.toLowerCase(c);

         if (Character.isLetter((c))) {
             int count = 0;
             for (char item : inventory) {
                 if (Character.toLowerCase(item) == c) {
                     count++;
                 }
             }
             return count;
         }
         return 0;
     }

     // Sets the count of occurrences of a character in the ArrayList
     public void set(char c, int count) {
        char target = Character.toLowerCase(c);

         if (Character.isLetter((c))) {
             inventory.removeIf(ch -> Character.toLowerCase(ch) == target);
             for (int i =0; i < count; i++) {
                 inventory.add(c);
             }
         }
     }

    public boolean contains(char c) {
        return get(c) > 0;
    }

    public int size() {
        return inventory.size();
    }

    public boolean isEmpty() {
        return inventory.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char item : inventory) {
            sb.append(item);
        }
        return sb.toString();
    }

//    public static void main(String[] args) {
//        InventoryLog inventoryLog = new InventoryLog();
//    }
}
