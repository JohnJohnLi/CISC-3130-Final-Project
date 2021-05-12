import java.util.*;

public class Employee
{
   private int emp_id;
   private String emp_Fname;
   private String emp_Lname;
   private String emp_gender;
   private double salary;
   private String worktype;
   private String workday;
   
   Employee (int emp_id, String emp_Fname, String emp_Lname, String emp_gender, double salary, String worktype, String workday)
   {
      this.emp_id = emp_id;
      this.emp_Fname = emp_Fname;
      this.emp_Lname = emp_Lname;
      this.emp_gender = emp_gender;
      this.salary = salary;
      this.worktype = worktype;
      this.workday = workday;
   }
   
   public int getEmployeeId()
   {
      return emp_id;
   }
   
   public String getEmployeeFname()
   {
      return emp_Fname;
   }
   
   public String getEmployeeLname()
   {
      return emp_Lname;
   }
   
   public String getEmployeeGender()
   {
      return emp_gender;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public String getWorktype()
   {
      return worktype;
   }
   
   public String getWorkday()
   {
      return workday;
   }

  
   public void printInfo()
   {
     System.out.println("----------------");
     System.out.println("Patient ID:" + this.emp_id);
     System.out.println("Doctor Name:" + this.emp_Fname + " " + this.emp_Lname);
     System.out.println("Gender:" + this.emp_gender);
     System.out.println("Salary:" + this.salary);
     System.out.println("Work Type:" + this.worktype);
     System.out.println("Work Day:" + this.workday);
     System.out.println("----------------");
     System.out.println(" ");
   }
}