import java.util.*;

class My implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        String s1=(String)o1;
        String s2=o2.toString();
        //return -s1.compareTo(s2); // Descending Order
        //return s1.compareTo(s2); //Ascending order
        return 0;//first data Kanchan 
    }
}

public class Stringtree {
    public static void main(String[] args){
       TreeSet st=new TreeSet<>();
       st.add("Kanchan");
       st.add("kanchan");
       st.add("Kiran");
       st.add("Abhishek");
       st.add("Aditya");

       //System.out.println(st);//print in natural alphabetical Order
       System.out.println();

       TreeSet st1=new TreeSet(new My());
       st1.add("Kanchan");
       st1.add("kanchan");
       st1.add("Kiran");
       st1.add("Abhishek");
       st1.add("Aditya");
       System.out.println(st1);
    }
}
