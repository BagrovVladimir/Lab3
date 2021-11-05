
package lab3_part1;

public class Lab3_part1 {

    public static void main(String[] args) {
        SimpleList AriyaGeneratorZla= new SimpleList();
        
        AriyaGeneratorZla.addToHead("Smotri");
        AriyaGeneratorZla.addToTail("Gryaz");
        AriyaGeneratorZla.addToTail("Dezertir");
        
        AriyaGeneratorZla.printAll();
        System.out.println("");
        
        AriyaGeneratorZla.addToTail("Pitka tishinoi");
        AriyaGeneratorZla.addToHead("Begi za solncem");
        
        AriyaGeneratorZla.printAll();
        System.out.println("");
        
        AriyaGeneratorZla.extractFromHeadAndDelete();
        AriyaGeneratorZla.extractFromTailAndDelete();
        
        AriyaGeneratorZla.printAll();
        System.out.println("");
        
        System.out.println(AriyaGeneratorZla.containsValue("Smotri"));
        System.out.println(AriyaGeneratorZla.containsValue("S kem ti"));
        
        System.out.println("");
        
        System.out.println(AriyaGeneratorZla.extractFromTailAndDelete());
        System.out.println("");
        AriyaGeneratorZla.printAll();
        System.out.println("");
        
        AriyaGeneratorZla.deleteValue("Gryaz");
        
        AriyaGeneratorZla.printAll();
        System.out.println("");
    }
    
}
