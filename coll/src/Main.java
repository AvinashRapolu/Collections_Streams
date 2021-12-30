import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        Cars car1 = new Cars();
        car1.setModel("Civic");
        car1.setPrice(150000);
        car1.setQuantity(30);

        Cars car2 = new Cars();
        car2.setModel("City");
        car2.setPrice(120000);
        car2.setQuantity(6);


        Cars car3 = new Cars();
        car3.setModel("swift");
        car3.setPrice(160000);
        car3.setQuantity(7);

        Dealer dealerDetails1 = new Dealer();
        dealerDetails1.setName("Honda Gachibowli");
        dealerDetails1.setArea("Gachibowli");
        dealerDetails1.setNumber(9121341);
        dealerDetails1.setCars(Arrays.asList(car1, car2));

        Dealer dealerDetails2 = new Dealer();
        dealerDetails2.setName("Sundaram Honda");
        dealerDetails2.setArea("Vijayawada");
        dealerDetails2.setNumber(88888);
        dealerDetails2.setCars(Arrays.asList(car3, car2));

        List<Dealer> dealers = new ArrayList<>();
        dealers.add(dealerDetails1);
        dealers.add(dealerDetails2);


        for (Dealer dealer: dealers) {
            System.out.println("Dealer name: " + dealer.getName() +
                    " address: " + dealer.getArea() +
                    " phoneNo:" + dealer.getNumber());
            for (Cars car: dealer.getCars()) {
                System.out.println("Car name: " + car.getModel() +
                        " quantity:" + car.getQuantity() +
                        " price:" + car.getPrice());
            }
        }
    }
}