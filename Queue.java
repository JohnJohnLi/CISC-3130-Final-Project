class Queue<Q extends Appointment> 
{
  public NodeQ<Q> top;
  public NodeQ<Q> bottom;
  public NodeQ<Q> next;

  public Queue() 
  { 
     this.top = null;
     this.bottom = null;
  } 
  
  void enqueue(Q data) 
  { 
      NodeQ<Q> temp = new NodeQ<Q>(data);
       
      if (this.bottom == null) 
      { 
         this.top = temp;
         this.bottom = temp;
         return; 
      } 
      this.bottom.next = temp; 
      this.bottom = temp;
  } 
  
  void dequeue() 
    {
        
        if (this.top == null) 
            return; 
  
        NodeQ<Q> temp = this.top; 
        this.top = this.top.next; 
  
        if (this.top == null) 
            this.bottom = null; 
    } 
  
  
  void printQueue()
  {
     NodeQ<Q> c = this.top;
     
     
     while(c != null)
     {
       c.data.printAppointments();
       c=c.next;
     }
  }
} 