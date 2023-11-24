public class Cashier extends Employee{
    private double hours;
    private double wage;

    public Cashier(String idNo, String name, String address, String email, String jobTitle, String contactNo, double hours, double wage) {
        super(idNo, name, address, email, jobTitle, contactNo);
        this.hours = hours;
        this.wage = wage;
    }


    // Setters and getters for HourlyEmployee-specific attributes
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0 && hours <= 168) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0) {
            this.wage = wage;
        } else {
            throw new IllegalArgumentException("Wage must be nonnegative");
        }
    }

    // Earnings method
    public double earnings() {
        if (hours <= 40) {
            return hours * wage;
        } else {
            return 40 * wage + (hours - 40) * 1.5 * wage;
        }
    }
//    public void earning(){
//
//    }

    @Override
    public String toString() {
        return super.toString()+"PieceWorkers{" +
                "hours=" + getHours() +
                ", wage=" + getWage() +"Total Salary of Hourly Employee = "+earnings()+" "+hours+" hours worked"+" Wage "+wage+
                '}';
    }
}
