import java.util.*;

class  My implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;

        return 0;//return only root node which is 10
       // return -i2.compareTo(i1);//Asending Order
       // return -i1.compareTo(i2);//Desending Order
       // return i2.compareTo(i1);//Descending Order
       // return i1.compareTo(i2);//Ascending Order
        //return +1;//Insetion Order preserved
        //return -1;//Reverse of Insertion Order
    }
    
}

public class Compare {
    public static void main(String[] args)
    {
        // TreeSet[balanced Tree]->Comparable::DNS
        // public int compareto(Object  obj)
        TreeSet st=new TreeSet();
        st.add(10);
        st.add(0);
        st.add(15);
        st.add(5);
        st.add(20);
        System.out.println(st);
        System.out.println();

         // TreeSet[balanced Tree]->Comparable::CSO
        //  public abstract int compare(Object obj1,Object obj2);
        // public abstract boolean equals(java.lang.Object);

        TreeSet st1=new TreeSet(new My());
        st1.add(10);
        st1.add(0);
        st1.add(15);
        st1.add(5);
        st1.add(20);
        st1.add(20);
        System.out.println(st1);
       

    }
}
