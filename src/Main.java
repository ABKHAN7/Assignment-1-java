import java.util.Calendar;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Date date = new Date(2023, Calendar.SEPTEMBER, 1);
        Cashier cashier = new Cashier("CSF02","ABKHAN","Kohat","a.basit1023@gmail.com","Cashier","0316",46,34);
        System.out.println(cashier.toString());
        System.out.println();
        cashier.earnings();

        ManagerialStaff managerialStaff = new ManagerialStaff("CSF02","ABKHAN","Kohat","a.basit1023@gmail.com","Cashier","0316",44000);
//        Customer customer =new Customer("CSF02","ABKHAN","Kohat","a.basit1023@gmail.com");
//        System.out.println(customer.toString());
//        Employee employee = new Employee("CSF02","ABKHAN","Kohat","a.basit1023@gmail.com","SaleMan","0316");
//        System.out.println(employee.toString());
        Product product = new Product("Pamper", "122312", 1, 5000, true);
        Product product1 = new Product("Pamper", "122312", 4, 5000, true);
        System.out.println(product);
        Product[] products = new Product[3];
        Order order = new Order("2112", date);
        order.addProduct(product);
        order.addProduct(product1);
        order.displayProducts();
        order.removeProduct(product1.toString());
        System.out.println();
        order.displayProducts();
        order.calculateTotalPrice();


//        System.out.println(order.toString());


    }
}