import java.util.List;

public class StudentMarks
{
    private String rn;
    private String y;
    private List<Subjects> sub;
    private int marks;

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public List<Subjects> getSub() {
        return sub;
    }

    public void setSub(List<Subjects> sub) {
        this.sub = sub;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

