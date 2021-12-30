import java.util.HashSet;
import java.util.Set;

public class Sett
{
    public void settt()
    {
        //set is a particular type of collection in which the object is stored in a random way
        //set cannot add duplicate objects
        Set st=new HashSet();
        st.add(90);
        st.add(78);
        st.add(87);
        st.add(56);
        st.add(45);
        System.out.println("this is set : "+st);
        System.out.println(st.contains(67));
        String t = String.valueOf(st.hashCode());
        System.out.println(t);
    }
    public void lset()
    {

    }
}
