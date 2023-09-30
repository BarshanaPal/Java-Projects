import java.util.List;

public class EmployeeSO {

    private Long id;
    private String employeeName;
    private String address;
    private List<String> contactDetails ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<String> contactDetails) {
        this.contactDetails = contactDetails;
    }
}
