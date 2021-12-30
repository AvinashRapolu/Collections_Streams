import org.apache.groovy.json.internal.Value;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;

public class Prac
{
public static void main(String[] args)
{

    List<Integer> list= new ArrayList<>();
//types of loops
    //type 1 normal for loop
   for (int i = 1; i <=13 ; i++)
    {
        list.add(i);
    }
   list.add(234);
    //type 2 iterator loop
  /*  Iterator<Integer> val= list.iterator();
   while (val.hasNext())
   {
       System.out.print(val.next()+"|");

   } */
    System.out.println("****************************************************");
    //type 3 enhanced for loop
    /*for(int i: list)
    {
        System.out.println(i);
    } */
    // type 4 forEach
    list.forEach(j -> System.out.print(j));
    System.out.println("");
    System.out.println("****************************************************");
// type 5 forEach call by method
    list.forEach(System.out::print);
    System.out.println();
    System.out.println("****************************************************");
    System.out.println("Addition *3 : "+list.stream().map(i ->i*3).reduce(0,((c, j) -> c+j)));
    System.out.println("****************************************************");
    // practice
    list.forEach(Value -> {if(Value %3 == 0) {System.out.println("dividable by 3: "+Value);}});
    System.out.println("****************************************************");
    list.forEach(Value -> {if(Value %3 == 0) {System.out.println("Squares of 3 multiple: "+Value*Value);}});
    System.out.println("****************************************************");
    list.forEach(Value -> {if(Value %5 == 0) {System.out.println("Squares of 5 multiple: "+Value*Value);}});
    System.out.println("****************************************************");
    int result = list.stream().reduce(0, Integer::sum); System.out.println("sum : "+result);
    System.out.println("****************************************************");
    List<String> listString = list.stream().map(Object::toString).filter(Value -> Value.contains("3")).collect(Collectors.toList());
    System.out.println(listString);
    System.out.println("****************************************************");
    int m= list.stream().reduce(1,Integer::max).;
    System.out.println(m);
    System.out.println("****************************************************");
    String res=list.stream().map(Object::toString).reduce("",String::concat);
    System.out.println(res);
    System.out.println("****************************************************");
    List<Integer> li= list.stream().filter(Value -> Value%2 != 0).collect(Collectors.toList());
    System.out.println("Odd numbers :"+li);
    System.out.println("****************************************************");
    List<Integer> lie= list.stream().filter(i -> (i%2 == 0)||(i%2 != 0))
                                    .collect(Collectors.toList());
    System.out.println("even numbers :"+lie);
    System.out.println("****************************************************");

    System.out.println("****************************************************");

    System.out.println("****************************************************");

    System.out.println("****************************************************");
}
}
