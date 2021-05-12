public class Medication
{
   private int med_id;
   private String med_name;
   private double med_price;
   
   Medication (int med_id, String med_name, double med_price)
   {
      this.med_id = med_id;
      this.med_name = med_name;
      this.med_price = med_price;
   }
   
   public int getMedId()
   {
      return med_id;
   }
   
   public String getMedName()
   {
      return med_name;
   }
   
   public double getMedPrice()
   {
      return med_price;
   }

   public void printMedications()
   {
     System.out.println("Medication ID:" + this.med_id);
     System.out.println("Medication Name:" + this.med_name);
     System.out.println("Medication Price:" + this.med_price);
   }
}