
package lab3_part1;

public class LinkedList {
    private Node head;
    private Node tail;
    
    public void addFirst(Object value){
        if (head!=null) {
            Node newNode= new Node(value);
            newNode.next=head;
            head=newNode;
        } else {head=tail= new Node(value);}
    }
    
    public Object getFirst(){
        if (head==null) {return null;} 
        else {return head.value;}
    }
    
    public Object getRemoveFromStart(){
      if (head==null) {return null;}
        if(head!=tail){
        Object znach=head.value;
        head=head.next;
        return znach;}
        else{
        Object znach=head.value;
        head=tail=null;
        return znach;
        }
    }
    
    public void removeFirst(){
        if(head==null){return;}
        
            if(head!=tail){
            head=head.next;}
            else {head=tail=null;}
    }
    
    public void addLast(Object value){
        if (tail!=null) {
            //Node newNode= new Node(value);
            tail.next=new Node(value);
            tail=tail.next;
        } else {head=tail= new Node(value);}
    }
    
    public Object getLast(){
        if (tail==null) {return null;} 
        else {return tail.value;}
    }
    
    
    public Object getRemoveFromLast(){
      if (tail==null) {return null;}
        if(head!=tail){
        Object znach=tail.value;
        Node n=head;
            while (n.next!=tail) {
                n=n.next;}
            tail=n;
            tail.next=null;
            
        return znach;}
        else{
        Object znach=tail.value;
        head=tail=null;
        return znach;
        }
    }
    
    public void removeLast(){
        if(tail==null){return;}
          if(head!=tail){
        Node n=head;
            while (n.next!=tail) {
                n=n.next;}
            tail=n;
            tail.next=null; 
        return;}
        else{       
        head=tail=null;
        return;
        }
    }
    
    public boolean containsValue(Object value){
        Node n=head;
        while(n!=null){
            if(n.value==null && value==null || value!=null && value.equals(n.value))
            {return true;}
            else{n=n.next;}
        }
        return false;
    }
    
    public boolean isEmty(){
        return head == null;
    }
    
    public int Size(){
        int i;
        if(head==null) {return i=0;}
       
        if(head!=tail){
        Node n=head;
            i=2;
            while (n.next!=tail) {
                n=n.next;
                i=i+1;}
            //tail=n;
            //tail.next=null; 
        return i;}
        else{       
        return i=1;
        }
    }
   
    public void printAll(){
        Node n=head;
        while(n!=null){
            System.out.println(n.value);
            n=n.next;
        }
    }
    
    public void deleteValue(Object value){
        if(head==null) return;
        
        if(head.checkValue(value)){
            removeFirst();
            //getRemoveFromStart();
        return;}
        
        Node prev = head;
        Node n = head.next;
        while(n!=null){
            if(n.checkValue(value)){
                if(n==tail)
                    removeLast();
                    //getRemoveFromLast();
                else
                    prev.next=n.next;
            return;    
            }
            prev=n;
            n=n.next;
        }
      }
    
    
    private static class Node{
        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
        
        boolean checkValue(Object value){
            return value==null && this.value==null  ||  value!=null && value.equals(this.value);
        }
    }  
}
