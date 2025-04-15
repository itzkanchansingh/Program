// program of tree set in java 

import java.util.TreeSet;

public class Tree{
    public static void main(String[] args)
    {
    //  Impentattion class object of SortedSet, Navigableset
    // Insertion Order ::  not preserve,based on some sorting
    // Duplicates      ::  not allowed
    // Interfaces      ::  Serializable, Cloneable
    // Types of object ::  Homogeneous
    // Comparable      ::  Wrapper Class, String, String buffer, String builder
        TreeSet st=new TreeSet();
        st.add("K");
        st.add("a");
        st.add("n");

        // by adding 10 it gives an error because java comapare k with 10 so 10 is an integer
        // thats why error comes and first humne string enter kiye fir integer to isliye error ayega
        // error ko solve krne ke liye ya to hume tree set datatype define kr dena chahiye 
      //  st.add(10);//class cast exception
       // st.add(null);//null pointer exception

        // it sorted this data in natural order
        System.out.println(st);
    }
}