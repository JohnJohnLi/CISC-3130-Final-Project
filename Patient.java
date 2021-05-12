import java.util.*;

public class Patient
{
   private int pat_id;
   private String pat_Fname;
   private String pat_Lname;
   private String pat_gender;
   private int pat_age;
   private String disease;
   private String asign;
   private LinkedList<Medication> medList;
   
   
   Patient (int pat_id, String pat_Fname, String pat_Lname, String pat_gender, int pat_age, String disease, String asign)
   {
      this.pat_id = pat_id;
      this.pat_Fname = pat_Fname;
      this.pat_Lname = pat_Lname;
      this.pat_gender = pat_gender;
      this.pat_age = pat_age;
      this.disease = disease;
      this.asign = asign;
      this.medList = new LinkedList<Medication>();
   }

   public int getPatientId()
   {
      return pat_id;
   }

   public String getPatientFname()
   {
      return pat_Fname;
   }
   
   public String getPatientLname()
   {
      return pat_Lname;
   }

   public String getPatientGender()
   {
      return pat_gender;
   }

   public int getPatientAge()
   {
      return pat_age;
   }

   public String getDisease()
   {
      return disease;
   }

   public String getAsign()
   {
      return asign;
   }
   
   public void addMedication(Medication med)
   {
     this.medList.insert(med);
   }
   /*
   public String getMedication()
   {
      return medication;
   }
   public String toSring()
   {
      return (pat_id+", "+pat_Fname+" "+pat_Lname+", "+pat_gender+", "+pat_age+", "+disease +", "+medication );
   }
   */
   public void printInfo()
   {
     System.out.println("----------------");
     System.out.println("Patient ID:" + this.pat_id);
     System.out.println("Patient Name:" + this.pat_Fname + " " + this.pat_Lname);
     System.out.println("Gender:" + this.pat_gender);
     System.out.println("Age:" + this.pat_age);
     System.out.println("Disease:" + disease);
     System.out.println("Asigned Doctor:" + asign);
     try{
       medList.printList();
     }catch(Exception e)
     {
       System.out.println(e);
     }
     System.out.println("----------------");
     System.out.println(" ");

   }

   
}