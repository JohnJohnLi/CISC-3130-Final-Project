class NodeT<T>
{
  public T data;
  public NodeT<T> next;

  public NodeT() {
    this.data = null;
    this.next = null;
  }

  public NodeT(T data) {
    this.data = data;
    this.next = null;
  }
}