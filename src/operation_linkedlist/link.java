package operation_linkedlist;

public class link {
    private int element;
    private link next;
    public link(int element){
        this.element=element;
    }
    
    public link(int element,link next){
        this.element=element;
        this.next=next;
    }
    public link(link next){
        this.next=next;
    }
    public int getElement(){
        return element;
    
    }
    public void setElement(int element){
        this.element=element;
    
    }
    public link getNext(){
        return next;
    
    }
    public void setNext(link next){
        this.next=next;
    
    }
    

}
