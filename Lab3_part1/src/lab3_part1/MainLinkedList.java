
package lab3_part1;

import java.util.Arrays;

public class MainLinkedList {

    public static void main(String[] args) {
        LinkedList AriyaGeneratorZla= new LinkedList();
        
        System.out.println("Create songlist from album 'Generator zla' of Ariya and print it");
        AriyaGeneratorZla.addFirst("Smotri");
        AriyaGeneratorZla.addLast("Gryaz");
        AriyaGeneratorZla.addLast("Dezertir");
        
        AriyaGeneratorZla.printAll();
        System.out.println("count of songs: "+AriyaGeneratorZla.Size());
        System.out.println("");
        
        System.out.println("Add 'Begi za solncem' at start of songlist and 'Pitka tishinoi' at finish: ");
        AriyaGeneratorZla.addLast("Pitka tishinoi");
        AriyaGeneratorZla.addFirst("Begi za solncem");
        
        AriyaGeneratorZla.printAll();
        System.out.println("count of songs: "+AriyaGeneratorZla.Size());
        System.out.println("");
        
        System.out.println("Delete songs from start and finish.");
        AriyaGeneratorZla.getRemoveFromStart();
        AriyaGeneratorZla.getRemoveFromLast();
        
        System.out.println("And our songlist looked:");
        AriyaGeneratorZla.printAll();
        System.out.println("");
        
        System.out.println("Songlist contains song 'Smotri'.");
        System.out.println("Answer: "+AriyaGeneratorZla.containsValue("Smotri"));
        
        System.out.println("");
        
        System.out.println("Songlist contains song 'S kem ti'.");
        System.out.println("Answer: "+AriyaGeneratorZla.containsValue("S kem ti"));
    }
    
}
