import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String Order_Id;
    private Date Date_Of_Order;
    private ArrayList<Product> product;
    static int count = 0;

    public Order(String order_Id, Date date_Of_Order) {
        this.Order_Id = order_Id;
        this.Date_Of_Order = date_Of_Order;
        this.product = new ArrayList<>();

        count++;


    }


    public int addProduct(Product prod) {
        for (Product p : product) {
            if (p.getP_Id().equals(prod.getP_Id())) {

                return p.getP_quantity() + prod.getP_quantity();
            }
        }
        product.add(prod);
        return 0;
    }

    public void removeProduct(String productId) {
        product.removeIf(p -> p.getP_Id().equals(productId));
    }

    public void displayProducts() {
        for (Product p : product) {
            System.out.println(p.toString());
        }
    }

    public void calculateTotalPrice() {
        double totalPrice = 0;
        for (Product p : product) {
            double productPrice = p.getP_price() * p.getP_quantity();
            if (!p.isEdible()) {
                productPrice *= 1.17;
            }
            totalPrice += productPrice;
        }
    }

    public String getOrder_Id() {
        return Order_Id;
    }

    public void setOrder_Id(String order_Id) {
        Order_Id = order_Id;
    }

    public Date getDate_Of_Order() {
        return Date_Of_Order;
    }

    public void setDate_Of_Order(Date date_Of_Order) {
        Date_Of_Order = date_Of_Order;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }


    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Order_Id='" + Order_Id + '\'' +
                ", Date_Of_Order=" + Date_Of_Order +
                ", product=" + product +
                '}';
    }
}
