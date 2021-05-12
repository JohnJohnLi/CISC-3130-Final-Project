class Stack<S extends Equipment> 
{
  private NodeS<S> top;
  private NodeS<S> next;
  

  public Stack() 
  {
    this.top = null;
    this.next = null;
  }
  
  public void push(S s)
  {
      NodeS<S> temp = new NodeS<S>();
 
        if (temp == null) 
        {
            System.out.println("The Stack is full");
            return;
        }
        temp.data = s;
        temp.next = top;
        top = temp;
  }
  
  public boolean isEmpty()
  {
      return top == null;
  }

  public S peek()
  {
     if (!isEmpty()) 
     {
         return top.data;
     }
     else 
     {
         System.out.println("Stack is empty");
         return null;
     }
  }
 
  public void pop()
  {
      if (top == null) 
      {
         System.out.println("Stack is not full");
         return;
      }
        top = (top).next;
  }
  
  public void printStack()
  {
      if (top == null) 
      {
         System.out.println("There is no Equiment information");
      }
      else 
      {
         NodeS<S> temp = top;
         
         while (temp != null) 
         {
            temp.data.printEquipments();
            temp = temp.next;
         }
      }
  }
}