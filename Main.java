import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //create ArrayList to store contact details of employee
        List<String> contactDetails = new ArrayList<>();
        contactDetails.add("1234567890");
        contactDetails.add("abc12@gmail.com");
        //create an employee object
        EmployeeSO employeeSO       = new EmployeeSO();
        //set employee details to the employee object
        employeeSO.setId(100L);
        employeeSO.setEmployeeName("Jack Watson");
        employeeSO.setAddress("135/A , WashingtonStreet");
        employeeSO.setContactDetails(contactDetails);
        //Print employee details
        System.out.println("Employee Details : -> \n" + employeeSO.getEmployeeName() + "\n" + employeeSO.getAddress());
        contactDetails.forEach(System.out::println);
    }
}