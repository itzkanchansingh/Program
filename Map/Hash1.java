import java.util.*;

public class Hash1{
public static void main(String[] args) {
    //Underlying DS   :: HashTable
    //Insertion Order :: not preserved[uses Hashing Technique]
    //Duplicates      :: Key no, but value can be duplicate
    //null            :: key allowed only once, but value any no of times
    HashMap map=new HashMap<>();
    map.put(1,"Aman");
    map.put(18,"Virat");
    map.put(7,"Dhoni");
    map.put(45,"Rohit");
    map.put(5,"Surya");
    System.out.println(map);//{1=Aman, 18=Virat, 5=Surya, 7=Dhoni, 45=Rohit}

    Set keys=map.keySet();
    System.out.println(keys);//[1, 18, 5, 7, 45]

    Collection val=map.values();
    System.out.println(val);//[Aman, Virat, Surya, Dhoni, Rohit]

    Set set=map.entrySet();
    System.out.println(set);//[1=Aman, 18=Virat, 5=Surya, 7=Dhoni, 45=Rohit]
    
    Iterator i= set.iterator();
     while(i.hasNext()){
        Map.Entry m=(Map.Entry)i.next();
        System.out.println("key is :: "+m.getKey());
        System.out.println("Value is :: "+m.getValue());
        if((Integer)m.getKey()==18)//m.getKey() = return type is object
          m.setValue("Virat Kohli");
     }
     System.out.println(map); //{1=Aman, 18=Virat Kohli, 5=Surya, 7=Dhoni, 45=Rohit}


     map.put(null,null);
     System.out.println(map);

     System.out.println();
     System.out.println("*********HASHTABLE**********");

     Hashtable ht=new Hashtable<>();
     ht.put(null,null);
     System.out.println(ht);
}
}