
package lab3_part1;

import java.util.Arrays;

public class MainDoubleLinkedList {
    
    public static void main(String[] args) {
        DoubleLinkedList dll=new DoubleLinkedList();
        
        System.out.println("Create list dll and print it");
        dll.addFirst(1111);
        dll.addLast(2222);
        dll.addLast(3333);
        dll.addLast(4444);
        
        System.out.println("from start: ");
        dll.printFromStart();
        System.out.println("from end: ");
        dll.printFromEnd();
        System.out.println("size of list: "+dll.Size());
        System.out.println("");
        
        
        System.out.println("First element: "+dll.getRemoveFromStart()+". Need to delete it");
        System.out.println("Last element: "+dll.getRemoveFromLast()+". Need to delete it");
        
        System.out.println("");
        
        System.out.println("Now list dll looked:");
        dll.printFromStart();
        System.out.println("size of list: "+dll.Size());
        System.out.println("");
        
        System.out.println("Create new list dll2: ");
        DoubleLinkedList dll2= new DoubleLinkedList();
        dll2.addFirst(8888);
        dll2.addLast(9999);
        dll2.printFromStart();
        
        System.out.println("");
        
        System.out.println("Create new list dll3: ");
        DoubleLinkedList dll3= new DoubleLinkedList();
        dll3.addFirst(7777);
        dll3.addLast(5555);
        dll3.printFromStart();
        
        System.out.println("");
        
        System.out.println("Add dll2 to head of dll:");
        dll.addListFirst(dll2);
        dll.printFromStart();
        
        System.out.println("");
        
        System.out.println("Add dll3 to tail of dll:");
        dll.addListLast(dll3);
        System.out.println("");
        dll.printFromStart();
        
        System.out.println("");
        
        
        Object[] objects={22, 33, 44};
        System.out.println("Create array: "+Arrays.toString(objects));
        
        System.out.println("");
        
        System.out.println("Add array to head of dll:");
        dll.addArrayFirst(objects);
        dll.printFromStart();
        System.out.println("size of list: "+dll.Size());
       
        System.out.println("");
        
        System.out.println("Have list value of 2222?");
        System.out.println("Answer: "+dll.containsValue(2222));
        System.out.println("");
    }
    
}
