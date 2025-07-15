import java.util.*;
class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1,Object obj2){
        String s1=(String)obj1;
        String s2=(String)obj2;
        return s1.compareTo(s2);
    }
}
public class Offer{
    public static void main(String[] args) {
        PriorityQueue ob=new PriorityQueue<>(new MyComparator());
        System.out.println(ob);
        ob.offer("N");
        ob.offer("I");
        ob.offer("D");
        ob.offer("H");
        ob.offer("I");
        System.out.println(ob);
    }
}