import java.util.Stack;

public class Stck
{
    //stack is basically a last in first out
    public void stk()
    {
        //push = add
        //pop = remove
        Stack stk= new Stack();
        stk.push("i am 1");
        stk.push("i am 2");
        stk.push("i am 3");
        stk.push("i am 4");
        System.out.println(stk);
        System.out.println("First object to go out is : "+ stk.peek());
        stk.pop();
        System.out.println("next object to go out is : "+ stk.peek());
    }
}
