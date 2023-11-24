public class Employee extends Customer {
    private String jobTitle;
    private String contactNo;


    public Employee(String idNo, String name, String address, String email, String jobTitle, String contactNo) {
        super(idNo, name, address, email);
        this.jobTitle = jobTitle;
        this.contactNo = contactNo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return super.toString() + " Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
