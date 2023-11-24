public class ManagerialStaff extends Employee {
    private double TotalSalary;

    public ManagerialStaff(String idNo, String name, String address, String email, String jobTitle, String contactNo, double totalSalary) {
        super(idNo, name, address, email, jobTitle, contactNo);
        this.TotalSalary = totalSalary;
    }


    public double getTotalSalary() {
        return TotalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        TotalSalary = totalSalary;
    }


    public double earnings() {
        return TotalSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" +
                "TotalSalary=" + TotalSalary +
                '}';
    }
}
