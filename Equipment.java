import java.util.*;

public class Equipment
{
   private int equip_id;
   private String equip_name;
   private double price;
   private String supplier;
   private String email; 

   Equipment (int equip_id, String equip_name, double price, String supplier, String email)
   {
      this.equip_id = equip_id;
      this.equip_name = equip_name;
      this.price = price;
      this.supplier = supplier;
      this.email = email;
   }
   
   public int getEquipId()
   {
      return equip_id;
   }
   
   public String getEquipName()
   {
      return equip_name;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public String getSupplier()
   {
      return supplier;
   }
   
   public String getEmail()
   {
      return email;
   }
   
   public void printEquipments()
   {
     System.out.println("----------------");
     System.out.println("Equipment ID:" + this.equip_id);
     System.out.println("Equipment Name:" + this.equip_name);
     System.out.println("Equipment Price:" + this.price);
     System.out.println("Equipment Supplier" + this.supplier);
     System.out.println("Supplier Email:" + email);
     System.out.println("----------------");
     System.out.println(" ");
   }
}
