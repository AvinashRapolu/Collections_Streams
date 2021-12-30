import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams
{
    public static void main(String[] args)
    {

        List<String> al2 = new ArrayList<>();
        al2.add("Blue");
        al2.add("Green");
        al2.add("Pink");
        al2.add("Red");

//         for (String s: al2) {
//            System.out.println(s);
//        }

//        al2.forEach(value -> System.out.println(value));

        al2.forEach(value -> {
//            System.out.println(value);
            if (value.equals("Pink")) {
//                System.out.println("Color");
            }
        });

        List al3 = new ArrayList();
        al3.add(10);
        al3.forEach(value -> {
//            System.out.println(value);
            Integer al = (Integer) value;
            al++;
        });

        List<String> square = al2.stream().map(x -> x + " Color")
                .collect(Collectors.toList());
        // toSet()
//        System.out.println(al2);
//        System.out.println(square);

        List<String> phones =
                Arrays.asList("IPhone 12", "IPhone 11", "Samsung Galaxy S10", "OnePlus Nord", "Samsung galaxy S20", "Nokia 1100");
        phones.stream().filter(x -> x.startsWith("I")||x.startsWith("S")||x.startsWith("N")).forEach(System.out::println);
        List<String> result = phones.stream()
                .filter(s->s.startsWith("S") || s.startsWith("I"))
                .map(x -> {
                    if (x.startsWith("S") || x.startsWith("I")) {
                                        System.out.println("Exists");
                    }
                    return x;
                }).collect(Collectors.toList());
        System.out.println(result);

        List<String> sortedList = phones.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        // https://www.geeksforgeeks.org/stream-sorted-in-java/


        List<EmployeeModel> employees = new ArrayList<>();
        EmployeeModel employee1 = new EmployeeModel("E101", "Avi", 10000f);
        EmployeeModel employee2 = new EmployeeModel("E102", "Ravi", 20000f);

        employees.add(employee1);
        employees.add(employee2);

        employees.forEach(employee -> {
            System.out.println(employee.getEmployeeNo() + ": name:" + employee.getEmployeeName() + ": Salary:" + employee.getSalary());
        });

        employees.stream().map(employeeModel -> {
                    employeeModel.setEmployeeName(employeeModel.getEmployeeName() + ": Dummy Name");
                    return employeeModel;
                })
                .forEach(employee -> {
                    System.out.println(employee.getEmployeeNo() + ": name:" + employee.getEmployeeName() + ": Salary:" + employee.getSalary());
                });

        for (EmployeeModel employee : employees) {
            System.out.println(employee.getEmployeeNo() + " : " + employee.getEmployeeName());

        }

        // List of products (productId, productName)
        // skus - skuId, skuSize, price
//
//        SkuModel sku1 = new SkuModel("sku1", "M", 200f);
//        SkuModel sku2 = new SkuModel("sku2", "L", 210f);
//        SkuModel sku3 = new SkuModel("sku3", "S", 190f);
//        SkuModel sku4 = new SkuModel("sku4", "M", 300f);
//
//        List<SkuModel> skus1 = new ArrayList<>();
//        skus1.add(sku1);
//        skus1.add(sku2);
//        skus1.add(sku3);
//        List<SkuModel> skus2 = new ArrayList<>();
//        skus2.add(sku4);
//        skus2.add(sku2);
//        ProductsModel product1 = new ProductsModel("product1", "pName1", skus1);
//        ProductsModel product2 = new ProductsModel("product2", "pName2", skus2);
//
//        List<ProductsModel> products = new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//
//        products.forEach(product -> {
//            System.out.println("\nProductName: " + product.getProductName());
//            product.getSkus().forEach(sku -> {
//                System.out.println("\nsku: " + sku.getSkuId());
//            });
//        });

    }

}