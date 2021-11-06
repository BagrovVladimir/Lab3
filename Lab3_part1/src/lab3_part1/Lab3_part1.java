
package lab3_part1;

public class Lab3_part1 {

    public static void main(String[] args) {
        /*LinkedList AriyaGeneratorZla= new LinkedList();
        
        AriyaGeneratorZla.addFirst("Smotri");
        AriyaGeneratorZla.addLast("Gryaz");
        AriyaGeneratorZla.addLast("Dezertir");
        
        AriyaGeneratorZla.printAll();
        System.out.println(AriyaGeneratorZla.Size());
        System.out.println("");
        
        AriyaGeneratorZla.addLast("Pitka tishinoi");
        AriyaGeneratorZla.addFirst("Begi za solncem");
        
        AriyaGeneratorZla.printAll();
        System.out.println(AriyaGeneratorZla.Size());
        System.out.println("");
        
        AriyaGeneratorZla.getRemoveFromStart();
        AriyaGeneratorZla.getRemoveFromLast();
        
        AriyaGeneratorZla.printAll();
        System.out.println("");
        
        System.out.println(AriyaGeneratorZla.containsValue("Smotri"));
        System.out.println(AriyaGeneratorZla.containsValue("S kem ti"));
        
        System.out.println("");
        
        System.out.println(AriyaGeneratorZla.getRemoveFromLast());
        System.out.println("");
        AriyaGeneratorZla.printAll();
        System.out.println("");
        
        AriyaGeneratorZla.deleteValue("Gryaz");
        
        AriyaGeneratorZla.printAll();
        System.out.println(AriyaGeneratorZla.Size());
        System.out.println("");
        
        
        /*AriyaGeneratorZla.removeFirst();
        AriyaGeneratorZla.removeLast();
        AriyaGeneratorZla.printAll();*/
        
        
        
        DoubleLinkedList dll=new DoubleLinkedList();
        
        dll.addFirst(1111);
        dll.addLast(2222);
        dll.addLast(3333);
        dll.addLast(4444);
        
        dll.printFromStart();
        //dll.printFromEnd();
        System.out.println("size of list: "+dll.Size());
        System.out.println("");
        
        System.out.println(dll.getRemoveFromStart());
        System.out.println(dll.getRemoveFromLast());
        
        System.out.println("");
        
        dll.printFromStart();
        //dll.printFromEnd();
        System.out.println("size of list: "+dll.Size());
        System.out.println("");
        
        /*DoubleLinkedList dll2= new DoubleLinkedList();
        dll2.addFirst(8888);
        dll2.addLast(9999);
        dll.addListFirst(dll2);
        dll.addListLast(dll2);
        //dll2.printFromStart();
        dll.printFromStart();*/
        
        Object[] objects={22, 33, 44};
        
        dll.addArrayFirst(objects);
        dll.printFromStart();
        System.out.println("size of list: "+dll.Size());
        System.out.println("");
        dll.addArrayLast(objects);
        dll.printFromStart();
        System.out.println("size of list: "+dll.Size());
        System.out.println("");
        System.out.println(dll.containsValue(2222));
        System.out.println("");
        dll.deleteValue(2222);
        dll.printFromStart();
        
    }
    
}
