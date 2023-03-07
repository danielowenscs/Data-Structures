package LinkedList;
public class Tester {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();  
            list.addFirst("hello");
            list.addFirst("test");
            list.removeFirst();
            list.removeLast();
            list.addFirst(1);
            list.addLast("71");
            list.removeLast();
     
            list.print();
        }
    
}
