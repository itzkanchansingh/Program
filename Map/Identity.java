import java.util.*;


public class Identity {
     public static void main(String arg[]){
         Integer i1=new Integer(10);
         Integer i2=new Integer(10);
          System.out.println("****HashMap****");

          HashMap hmap=new HashMap<>();
          hmap.put(i1,"Sachin");
          hmap.put(i2,"Tendulkar");

          System.out.println(hmap); //{10=Tendulkar}   JVM :: i1.equals(i2)=True

          System.out.println();

          System.out.println("*******IdentityHashMap********");
           IdentityHashMap imap=new IdentityHashMap<>();
           imap.put(i1,"Sachin");
           imap.put(i2,"Tendulkar");
           System.out.println(imap);//{10=Tendulkar, 10=Sachin}  JVM :: I1==I2::FALSE

    }
}
