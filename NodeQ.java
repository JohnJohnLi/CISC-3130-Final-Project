class NodeQ<Q> 
{
   public Q data;
   public NodeQ<Q> next;
   
   public NodeQ() 
   {
    this.data = null;
    this.next = null;
   }
   
   public NodeQ(Q data) 
   { 
     this.data = data; 
     this.next = null; 
   } 
}