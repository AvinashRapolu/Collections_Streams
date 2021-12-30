import java.util.ArrayDeque;

public class ArreyList
{
    public void arl()
    {
        java.util.ArrayList Names= new java.util.ArrayList();
        Names.add("Avinash");
        Names.add("Krishna");
        Names.add("Sai");
        Names.add("Tabu");
        Names.add("Ravi");
        Names.add("Kavya");
        Names.add("Chandana");
        System.out.println(Names);
        Names.add(10);
        Names.add(0,1);
        System.out.println(Names);
        Names.remove(String.valueOf("Chandana"));
        System.out.println(Names);
        java.util.ArrayList New=new java.util.ArrayList();
        New.add("Subhra");
        New.add("chandana");
        Names.addAll(New);
        System.out.println(Names);
        New.set(0,"Subra");
        System.out.println(New);
        System.out.println(Names.contains("Krishna"));
        for (Object element:Names)
        {
            System.out.println("Elements: "+element);
        }
    }
    public void Arydeq()
    {
        //array deque is from which we can add objects from beginning ending and delete from beginning and ending
        //we can add from both sides by adding first and last to the end of the operation as shown below
        ArrayDeque adq= new ArrayDeque();
        adq.offer(44);
        adq.offerFirst(66);
        adq.offerLast(34);
        adq.offer(89);
        System.out.println("this is array deque : "+adq);
    }
}