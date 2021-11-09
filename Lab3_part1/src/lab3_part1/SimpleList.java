
package lab3_part1;

public class SimpleList {
    private Node head;
    private Node tail;
    
    public void addToHead(Object value){
        if (head!=null) {
            Node newNode= new Node(value);
            newNode.next=head;
            head=newNode;
        } else {head=tail= new Node(value);}
    }
    
    public Object extractFromHead(){
        if (head==null) {return null;} 
        else {return head.value;}
    }
    
    public Object extractFromHeadAndDelete(){
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
    
    public void addToTail(Object value){
        if (tail!=null) {
            //Node newNode= new Node(value);
            tail.next=new Node(value);
            tail=tail.next;
        } else {head=tail= new Node(value);}
    }
    
    public Object extractFromTail(){
        if (tail==null) {return null;} 
        else {return tail.value;}
    }
    
    public Object extractFromTailAndDelete(){
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
            extractFromHeadAndDelete();
        return;}
        
        Node prev = head;
        Node n = head.next;
        while(n!=null){
            if(n.checkValue(value)){
                if(n==tail)
                    extractFromTailAndDelete();
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
