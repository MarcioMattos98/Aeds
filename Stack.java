
package aeds;


public class Stack {

    
    public class StackRA<Item>{
        private Item[] a;
        private int number;
    
    
    public StackRA(){
        a = (Item[])new Object[2];
        number = 0;
    }
    
    public int Size(){
        return number;
        
    }
    
    public boolean isEmpty(){
        return number == 0;
    }
    
    public void push(Item item){
        if(number == a.length){
            resize (2* a.length);
            a[number++] = item;
        }
    }
    
    public Item pop(int n){
        Item item = a[number--];
        if(number > 0 && number == a.length/4);
               resize(a.length/2);
               return item;
        
    }

        private void resize(int max) {
            Item[] aux;
            aux = (Item[])new Object[max];
            for (int i = 0; i < max; i++) {
                aux[i] = a[i];
                a = aux;
            }
        }
    
    
    }    
    
    
    public static void main(String[] args) {
        
    }
    
}
