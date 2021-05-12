class LinkedList<T extends Medication>
{
  private NodeT<T> head;
  private NodeT<T> tail;
  
  public LinkedList() 
  {
    this.head = null;
    this.tail = null;
  }
  
  public void insert(T t)
  {
    NodeT<T> temp = new NodeT<T>(t);    
    if (head == null && tail == null)
    {
      this.head = temp;
      this.tail = temp;
    }
    else
    {
      NodeT<T> c = this.head;
      // traverse(c);
      while(c.next != null)
      {
        c = c.next;
      }
      c.next = temp;
      this.tail = c.next;
    }
  }
  
  public void printList()
  {
     NodeT<T> c = this.head;
      // med1 -> med2
     while(c != null)
     {

       c.data.printMedications();
       c=c.next;
     }
     //System.out.println("Medication ID:" + this.med_id);
     //System.out.println("Medication Name:" + this.med_name);
     //System.out.println("Medication Price:" + this.med_price);
     
      //System.out.println("\n--------------------------");
      //System.out.println("HEAD : " + this.head.data);
      //System.out.println("TAIL : " + this.tail.data);

  }

}