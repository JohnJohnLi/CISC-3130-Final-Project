import java.util.*;

public class Clinic
{
   ArrayList<Doctor> d = new ArrayList<Doctor>();
   ArrayList<Patient> p = new ArrayList<Patient>();
   ArrayList<Employee> e = new ArrayList<Employee>();
   
   
   void addDoctor(Doctor i)
   {
      d.add(i);
   }
   void removeDoctor(Doctor i)
   {
      d.remove(i);
   }

   void addPatient(Patient i)
   {
      p.add(i);
   }

   void removePatient(Patient i)
   {
     p.remove(i);
   }
   
   void addEmployee(Employee i)
   {
      e.add(i);
   }
   void removeEmployee(Employee i)
   {
     e.remove(i);
   }
   
   public ArrayList<Doctor> getDoctors()
   {
      return d;
   }
   
   public ArrayList<Patient> getPatients()
   {
      return p;
   }
   
   public ArrayList<Employee> getEmployees()
   {
      return e;
   }

   public void printAllDoctors()
   {
     for(int i = 0; i < d.size(); i++)
     {
       d.get(i).printInfo();
     }
   }
   
   public void printAllPatients()
   {
     for(int i = 0; i < p.size(); i++)
     {
       p.get(i).printInfo();
     }
   }

   public void printAllEmployees()
   {
     for(int i = 0; i < e.size(); i++)
     {
       e.get(i).printInfo();
     }
   }
   

   }

// LList<Medication> med = new LList<Medication>
// Stack