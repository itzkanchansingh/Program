import java.util.*;

public class ARRAY_list {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add("k");
        a.add("a");
        a.add("n");
        a.add("c");
        a.add("h");
        a.add("a");
        a.add("n");
        System.out.println( "Before Sorting :"+a);
        Collections.sort(a);
        System.out.println( "After Sorting :"+a);
    }
}
