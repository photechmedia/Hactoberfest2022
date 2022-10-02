import java.util.*;

class LinkedList1
{
  public static void main(String args[])
  {
    LinkedList ls=new LinkedList<>();
    ls.add(10);
    ls.add(20);
    ls.add("hello");
    ls.add(1,45);
    System.out.println(ls);
    System.out.println(ls.isEmpty());
    System.out.println(ls.size());
    System.out.println(ls.get(0));
    ls.set(0,50);
    System.out.println(ls);
    
    
  }
}