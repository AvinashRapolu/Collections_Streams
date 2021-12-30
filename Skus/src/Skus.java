import java.util.List;

public class Skus
{
    private String SkuC;
    private List<PriceSize> PS;

    public String getSkuC() {
        return SkuC;
    }

    public void setSkuC(String skuC) {
        SkuC = skuC;
    }

    public List<PriceSize> getPS()
    {
        return PS;
    }

    public void setPS(List<PriceSize> PS) {
        this.PS = PS;
    }
}
