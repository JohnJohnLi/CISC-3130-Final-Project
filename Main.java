import java.util.*;

public class Main
{
   public static void main(String args[])
   {
      Clinic c = new Clinic();
      
      int choice = 0;

      Doctor d1 = new Doctor(1, "Jianhong", "Li", "Ears");
      Doctor d2 = new Doctor(2, "Papa", "Sito", "Nose");
      Doctor d3 = new Doctor(3, "Mama", "Cita", "Throat");
      c.addDoctor(d1);
      c.addDoctor(d2);
      c.addDoctor(d3);

      Patient p1 = new Patient(101, "Chris", "Hemsworth", "Male", 37, "Throat Pain", "Jianhong Li");
      p1.addMedication(new Medication(1, "Wonderful Throat Drops", 44.89));
      c.addPatient(p1);

      Employee e1 = new Employee(10001, "Sam", "Smith", "Male", 2110.05, "Nurse", "Sat-Sun");
      c.addEmployee(e1);
      

      while (choice != 9)
      {
      
        System.out.println("******************************************");
        System.out.println("Welcome to Li's ENT Clinic");
        System.out.println("1, Show Doctors");
        System.out.println("2, Show Patients");
        System.out.println("3, Show Employees");
        System.out.println("4, update doctors");
        System.out.println("5, update patients");
        System.out.println("6, update employee");
        System.out.println("7, Appointments");
        System.out.println("8, Equipments");
        System.out.println("9, Exit");
        System.out.println("******************************************");
        System.out.print("Your Choice is : ");
        
        Scanner s = new Scanner(System.in);
        
        choice = s.nextInt();
        
        switch (choice)
        {
          
          case 1: {
                    c.printAllDoctors(); 
                  }
                  break; 
                  
          case 2: {
                    c.printAllPatients(); 
                  }
                  break;
                  
          case 3: {   
                    c.printAllEmployees();
                  }
                  break;
                  
          case 4: {
                    Doctor d4 = new Doctor(4, "Handsome", "Man", "Ears");
                    Doctor d5 = new Doctor(5, "Pretty", "Lady", "Nose");
                    
                    c.addDoctor(d4);
                    c.addDoctor(d5);
                    //c.removeDoctor(d3);
                    c.printAllDoctors(); 
                  }
                  break;
                  
          case 5: {
                    Patient p2 = new Patient(102, "Emma", "Stone", "Female", 32, "Ears Pain", "Papa Sito");
                    Patient p3 = new Patient(103, "Leonardo", "DiCaprio", "Male", 46, "Nose Itchy", "Mama Cita");
                    p2.addMedication(new Medication(2, "Magical Ears Drops", 59.99));
                    p3.addMedication(new Medication(3, "Powerful Nose Drops", 79.99));
                    c.addPatient(p2);
                    c.addPatient(p3);
                    //c.removePatient(p1);
                    c.printAllPatients();
                  }
                  break;
                  
          case 6: {
                    Employee e2 = new Employee(10002, "Taylor", "Swift", "Female", 4500.77, "Nurse", "Mon-Fri");
                    Employee e3 = new Employee(10003, "Ariana", "Grande", "Female", 4329.22, "Nurse", "Mon-Fri");
                    Employee e4 = new Employee(10004, "Dua", "Lipa", "Female", 3642.38, "Reception", "Mon-Fri");
                    Employee e5 = new Employee(10005, "Ed", "Sheeran", "Male", 3642.38, "Reception", "Mon-Fri");
                    Employee e6 = new Employee(10006, "Donald", "Trump", "Male", 2982.37, "Cleaner", "Mon-Sun");
                    
                    c.addEmployee(e2);
                    c.addEmployee(e3);
                    c.addEmployee(e4);
                    c.addEmployee(e5);
                    c.addEmployee(e6);
                    //c.removeEmployee(e2);
                    c.printAllEmployees();
                  }
                  break;
          case 7: {
                    Queue<Appointment> q1 = new Queue<Appointment>();

                    
                    q1.enqueue(new Appointment(111, "Miley", "Cyrus", 6462220, "Jianhong Li", "5/1/2021, 8:00")); 
                    q1.enqueue(new Appointment(112, "Lady", "Gaga", 6465550, "Mama Cita", "5/2/2021, 14:00"));
                    q1.enqueue(new Appointment(113, "Lady", "Gaga", 2255501, "Papa Sito", "5/3/2021, 10:00"));
                    q1.enqueue(new Appointment(114, "Lady", "Gaga", 6222550, "Jianhong Li", "5/4/2021, 12:00"));
                    
                    q1.printQueue();
                    //q1.dequeue();
                    //here to call out the function dequeue();  -- the way to delete the first Queue
                    
                  }
          
          case 8: {
                   Stack<Equipment> equip = new Stack<Equipment>();
                   

                   equip.push(new Equipment(555, "Equipment A", 542.35, "Supplier T", "supplierT@gmail.com"));
                   equip.push(new Equipment(666, "Equipment B", 1456.32, "Supplier M", "supplierM@gmail.com"));
                   equip.push(new Equipment(777, "Equipment C", 700.35, "Supplier O", "supplierO@gmail.com"));

                   equip.printStack();

                   //equip.pop();

                  }
                  
                     
                    
                     
        }
      }
    }
}