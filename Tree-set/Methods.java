import java.util.TreeSet;

public class Methods{
    public static void main(String args[]){
        TreeSet t=new TreeSet<>();
        t.add(100);
        t.add(200);
        t.add(300);
        t.add(400);
        t.add(500);
        t.add(600);
        System.out.println(t);
        System.out.println("Ceiling value::"+t.ceiling(300));
        System.out.println("Higer value::"+t.higher(300));
        System.out.println("Lower value::"+t.lower(300));
        System.out.println("Floor value::"+t.floor(300));
        System.out.println("Poll first::"+t.pollFirst());//remove first element
        System.out.println("Poll Last::"+t.pollLast());//remove last element 
        System.out.println("Desending Set::"+t.descendingSet());
    }
}