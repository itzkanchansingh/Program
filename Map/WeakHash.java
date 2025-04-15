import java.util.*;

public class WeakHash {
    public static void main(String arg[]){
         Integer i1=new Integer(10);
         Integer i2=new Integer(10);
          System.out.println("****HashMap****");

          HashMap hmap=new HashMap<>();
          hmap.put(i1,"Sachin");
          hmap.put(i2,"Tendulkar");

          System.out.println(hmap); //{10=Tendulkar}   JVM :: i1.equals(i2)=True

          System.out.println();

          System.out.println("*******WeakHashMap********");
           WeakHashMap wmap=new WeakHashMap();
           wmap.put(i1,"Sachin");
           wmap.put(i2,"Tendulkar");
           System.out.println(wmap);//{10=Tendulkar}

    }
}
