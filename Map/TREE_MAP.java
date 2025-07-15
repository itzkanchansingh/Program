import java.util.*;
public class TREE_MAP {
    public static void main(String args[]){
        TreeMap t=new TreeMap();
        t.put(1,"karan");
        t.put(2,"Aman");
        t.put(3,"Chaman");
        System.out.println(t);
        System.out.println("Ceiling Key::"+t.ceilingKey(10));
        System.out.println("Floor Key::"+t.floorKey(10));
        System.out.println("Lower Key::"+t.lowerKey(10));
        System.out.println("Higher Key::"+t.higherKey(10));
        System.out.println("Poll First::"+t.pollFirstEntry());
        System.out.println("Poll last::"+t.pollLastEntry());
          System.out.println(t);


    }
}
