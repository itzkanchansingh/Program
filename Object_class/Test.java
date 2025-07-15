interface INotification{
    public void notifyuser();
}
class EmailNotification implements INotification{
    @Override
    public void notifyuser(){
      System.out.println("Email");
    }
}
class SMSNotification implements INotification{
    @Override
    public void notifyuser(){
        System.out.println("SMS");
    }
}
class factory{
    public INotification getInstance (String mode){
        INotification notification =null;
        if(mode.equalsIgnoreCase("SMS"))
           notification=new SMSNotification();
        else if(mode.equalsIgnoreCase("Email"))
           notification=new EmailNotification();
        else if(mode.equalsIgnoreCase("push"))
            notification=new PushNotification();
        else
           throw new RuntimeException("Mode is invaild..");
    
        return notification;
    }
}

class PushNotification implements INotification{
    @Override
    public void notifyuser(){
        System.out.println("push");
    }
}
public class Test{
    public static void main(String[]args){
       factory fac=new factory();
      // loose coupling, abstraction
       INotification obj1= fac.getInstance("sms");
       obj1.notifyuser();
       System.out.println("Notification object is "+obj1.getClass());
       System.out.println();
       INotification obj2= fac.getInstance("sms");
       obj2.notifyuser(); 
       System.out.println("Notification object is"+obj2.getClass());
       System.out.println();
       INotification obj3= fac.getInstance("push");
       obj3.notifyuser(); 
       System.out.println("push object is"+obj3.getClass());
    }
}
