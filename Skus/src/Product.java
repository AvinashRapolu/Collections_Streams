import java.util.List;

public class Product
{
    private String PName;
    private int PId;
    private List<Skus> Sk;


    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }

    public List<Skus> getSk() {
        return Sk;
    }

    public void setSk(List<Skus> sk) {
        Sk = sk;
    }
}
