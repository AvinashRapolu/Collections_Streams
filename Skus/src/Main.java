import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        PriceSize pz1 =new PriceSize();
        pz1.setSize("XS");
        pz1.setPrice(500);

        PriceSize pz2 =new PriceSize();
        pz2.setSize("S");
        pz2.setPrice(650);

        PriceSize pz3 =new PriceSize();
        pz3.setSize("L");
        pz3.setPrice(800);

        PriceSize pz4 =new PriceSize();
        pz4.setSize("XL");
        pz4.setPrice(900);

        PriceSize pz5 =new PriceSize();
        pz5.setSize("XXL");
        pz5.setPrice(1000);


        Skus sku1= new Skus();
        sku1.setSkuC("White");
        sku1.setPS(Arrays.asList(pz1,pz2,pz4,pz5));

        Skus sku2= new Skus();
        sku2.setSkuC("Orange");
        sku2.setPS(Arrays.asList(pz2,pz4,pz5));

        Skus sku3= new Skus();
        sku3.setSkuC("Black");
        sku3.setPS(Arrays.asList(pz1,pz2,pz4));

        Skus sku4= new Skus();
        sku4.setSkuC("Rogue Green");
        sku4.setPS(Arrays.asList(pz1,pz2,pz3,pz4,pz5));


        Product pro1 = new Product();
        pro1.setPId(1);
        pro1.setPName("Nike");
        pro1.setSk(Arrays.asList(sku1,sku2,sku3));

        Product pro2 = new Product();
        pro2.setPId(1);
        pro2.setPName("Puma");
        pro2.setSk(Arrays.asList(sku1,sku3));

        Product pro3 = new Product();
        pro3.setPId(1);
        pro3.setPName("Woodland");
        pro3.setSk(Arrays.asList(sku4));

        Product pro4 = new Product();
        pro4.setPId(1);
        pro4.setPName("UCB");
        pro4.setSk(Arrays.asList(sku1,sku2,sku3,sku4));



        List<Product> Prod = new ArrayList<>();
        Prod.add(pro1);
        Prod.add(pro2);
        Prod.add(pro3);
        Prod.add(pro4);

List newlist=new ArrayList();
        for (Product Products: Prod)
        {
            System.out.println("Product id : "+ Products.getPId()+"   " +"Brand : "+Products.getPName());
            for (Skus su: Products.getSk())
            {
                System.out.println("Colour : "+ su.getSkuC());
                for (PriceSize prS: su.getPS())
                {
                    System.out.println("Size : " + prS.getSize()+"Price : "+ prS.getPrice());
                }
            }
        }

    }
}