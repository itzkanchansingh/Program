import java.util.*;
class Student{
    
    String name;
    int Roll;
    Student(String name,int roll ){
        this.name=name;
        this.Roll=roll;
    }
   
}
class TOSTRING{
    public static void main(String args[]){
      Student s1=new Student("Rohan",10);
      Student s2=new Student("Sachin",20);
      System.out.println(s1);//Student@4517d9a3:-Since we haven't overridden toString(),in Student 
                             //class , it prints the default format:-ClassName@hashCode 
      System.out.println(s2);//Student@372f7a8d
      System.out.println();

      System . out .println(s1.toString());//Student@4517d9a3
      System . out .println(s2.toString());//Student@372f7a8d
      
    }
}
