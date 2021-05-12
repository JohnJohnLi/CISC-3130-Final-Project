import java.util.*;

public class Doctor
{
   private int doc_id;
   private String doc_Fname;
   private String doc_Lname;
   private String major;
   
   
   Doctor (int doc_id, String doc_Fname, String doc_Lname, String major)
   {
      this.doc_id = doc_id;
      this.doc_Fname = doc_Fname;
      this.doc_Lname = doc_Lname;
      this.major = major;
   }
   
   public int getDoctorId()
   {
      return doc_id;
   }
   
   public String getDoctorFname()
   {
      return doc_Fname;
   }
   
   public String getDoctorLname()
   {
      return doc_Lname;
   }
   
   public String getDoctorMajor()
   {
      return major;
   }
   

   
   
   public void printInfo()
   {
     System.out.println("----------------");
     System.out.println("Doctor ID:" + this.doc_id);
     System.out.println("Doctor Name:" + this.doc_Fname + " " + this.doc_Lname);
     System.out.println("Doctor major:" + this.major);
     System.out.println("----------------");
     System.out.println(" ");
   }
   // Doctor a
   // a.printInfo();
   // Head
   // LList -> printInfo;
   // Head.printInfo();
   // OOP
   // Stack
   // Queue
}
   
   