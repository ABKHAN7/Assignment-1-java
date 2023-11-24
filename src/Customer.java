public class Customer {
    private String IdNo;
    private String name;
    private String Address;
    private String email;

    public Customer(String idNo, String name, String address, String email) {
        this.IdNo = idNo;
        this.name = name;
        this.Address = address;
        this.email = email;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String idNo) {
        IdNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "IdNo='" + IdNo + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
