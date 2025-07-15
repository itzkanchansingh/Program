import java.util.*;

public class Hash{
    public static void main(String[] args) {
        // Hashing                       :: Insertion is not Preserved
        // Default Capacity of HashTable :: 11
        Hashtable ht=new Hashtable<>();
        ht.put(new Temp(5),"K");
        ht.put(new Temp(7),"L");
        ht.put(new Temp(3),"M");
        ht.put(new Temp(6),"N");
        ht.put(new Temp(8),"O");
        System.out.println(ht);//{8 =O, 7 =L, 6 =N, 5 =K, 3 =M}
    }
}
class Temp{
    int i;
    // Parameterized Constructor
    Temp(int i ){
        this.i=i;
    }
    @Override
    public int hashCode(){
    return i;
    }
    @Override
    public String toString(){
        return i+" " ;
    }
}
