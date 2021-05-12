public class Appointment
{
   private int pat_id;
   private String pat_Fname;
   private String pat_Lname;
   private int tel_no;
   private String doc_name;
   private String date;
   
   Appointment (int pat_id, String pat_Fname, String pat_Lname, int tel_no, String doc_name, String date)
   {
      this.pat_id = pat_id;
      this.pat_Fname = pat_Fname;
      this.pat_Lname = pat_Lname;
      this.tel_no = tel_no;
      this.doc_name = doc_name;
      this.date = date;
   }
   
   public int getPatId()
   {
      return pat_id;
   }
   
   public String getPatFName()
   {
      return pat_Fname;
   }
   
   public String getPatLName()
   {
      return pat_Lname;
   }
   
   public int getTelNo()
   {
      return tel_no;
   }
   
   public String getDocName()
   {
      return doc_name;
   }
   
   public String getDate()
   {
      return date;
   }
   
   public void printAppointments()
   {
     System.out.println("----------------");
     System.out.println("Patient ID:" + this.pat_id);
     System.out.println("Patient Name:" + this.pat_Fname + " " + this.pat_Lname);
     System.out.println("Telephone Number:" + this.tel_no);
     System.out.println("Doctor Name:" + this.doc_name);
     System.out.println("Appointment Date:" + date);
     System.out.println("----------------");
     System.out.println(" ");
   }
}
