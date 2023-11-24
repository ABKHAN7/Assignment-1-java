public class Product {
    private String P_Name;
    private String P_Id;
    private int P_quantity;
    private double P_price;
    private boolean isEdible;

    public Product(String p_Name, String p_Id, int p_quantity, double p_price, boolean isEdible) {
        P_Name = p_Name;
        P_Id = p_Id;
        P_quantity = p_quantity;
        P_price = p_price;
        this.isEdible = isEdible;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String p_Name) {
        P_Name = p_Name;
    }

    public String getP_Id() {
        return P_Id;
    }

    public void setP_Id(String p_Id) {
        P_Id = p_Id;
    }

    public int getP_quantity() {
        return P_quantity;
    }

    public void setP_quantity() {
        P_quantity = 0;
    }

    public double getP_price() {
        return P_price;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = true;
    }

    public void setP_price(double p_price) {
        P_price = p_price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "P_Name='" + P_Name + '\'' +
                ", P_Id='" + P_Id + '\'' +
                ", P_quantity=" + P_quantity +
                ", P_price=" + P_price + "isEdible " + isEdible +
                '}';
    }
}
