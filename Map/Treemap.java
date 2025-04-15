import java.util.*;
class My implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;
       // return -i1.compareTo(i2);//{15=120, 14=null, 13=YYY, 11=XXX, 10=ZZZ}
       // return i1.compareTo(i2);//{10=ZZZ, 11=XXX, 13=YYY, 14=null, 15=120}
        //return i2.compareTo(-i1);//{10=ZZZ, 13=YYY, 11=XXX, 15=120, 14=null}
        return -i2.compareTo(i1);//{10=ZZZ, 11=XXX, 13=YYY, 14=null, 15=120}
    }
}
public class Treemap {

    public static void main(String[] args) {
        //Underlying DS :: RedBlack Tree
        //Comparable    :: DNS(Asending Order )
        TreeMap mp=new TreeMap();
        mp.put(10,"ZZZ");
        mp.put(13,"YYY");
        mp.put(11,"XXX");
        mp.put(15,"120");
        mp.put(14,null);
       // mp.put("FFF","106");//CCE
        //mp.put(null,107);//NPE

        System.out.println(mp);//{10=ZZZ, 11=XXX, 13=YYY, 14=null, 15=120}
        System.out.println();

        TreeMap mp2=new TreeMap<>(new My());
        mp2.put(10,"ZZZ");
        mp2.put(13,"YYY");
        mp2.put(11,"XXX");
        mp2.put(15,"120");
        mp2.put(14,null);
        System.out.println(mp2);// {15=120, 14=null, 13=YYY, 11=XXX, 10=ZZZ}

    }
}
