import java.util.PriorityQueue;

public class Peeek {
    public static void main(String[] args) {
    PriorityQueue p=new PriorityQueue<>();
        System.out.println(p);
        for(int i=1;i<=10;i++){
            p.add(i);
        }
        System.out.println(p);
        System.out.println(p.peek());// give first element of queue
         System.out.println(p);
         System.out.println(p.poll());//remove first element from queue 
         System.out.println(p);
    }

}
