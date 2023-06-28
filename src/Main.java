import com.amk.db.DataBaseConnection;
import com.amk.model.Employee;
import com.amk.service.EmployeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection con = null;
        PreparedStatement ps = null;
        con = dataBaseConnection.dbConnection();

        try{
            System.out.println("DB conected");

            String query = "INSERT INTO employee VALUES (2, 'Atif', 3000)";

            ps = con.prepareStatement(query);

            ps.execute();

        }catch (Exception e){
            e.printStackTrace();
        }


        EmployeeManagement employeeManagement = new EmployeeManagement();
        Employee employee = new Employee("John", 1, 5000);
        Employee employee1 = new Employee("Doe", 10, 4000);
        employeeManagement.addEmployee(employee);
        employeeManagement.addEmployee(employee1);

        double sal = employeeManagement.calculateSalary(10);
        System.out.println(sal);

        Employee e = employeeManagement.getEmployee(1);
        System.out.println(e.toString());

    }
}