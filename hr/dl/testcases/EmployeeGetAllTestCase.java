import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.text.*;
import java.math.*;
import java.util.*;
public class EmployeeGetAllTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
Set<EmployeeDTOInterface> employees;
employees=employeeDAO.getAll();
SimpleDateFormat simpleDateFprmat=new SimpleDateFormat("dd/MM/yyyy");
for(EmployeeDTOInterface employeeDTO:employees)
{
System.out.println("Employee Id:"+employeeDTO.getEmployeeId());
System.out.println("Name:"+employeeDTO.getName());
System.out.println("Designation code:"+employeeDTO.getDesignationCode());
System.out.println("Date of Birth:"+employeeDTO.getDateOfBirth());
System.out.println("Gender:"+employeeDTO.getGender());
System.out.println("Is Indian:"+employeeDTO.getIsIndian());
System.out.println("Basic Salary:"+employeeDTO.getBasicSalary().toPlainString());
System.out.println("PAN Number:"+employeeDTO.getPANNumber());
System.out.println("Aadhar Card Number:"+employeeDTO.getAadharCardNumber());
System.out.println("----#----#----#----#----#----#----#----#----");
}
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}
