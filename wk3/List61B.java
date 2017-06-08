public interface List61B<Item>{
  public void addLast(Item x) ;
  //public void addFirst(Item x) ;
  //public Item getFirst() ;
  public Item getLast() ;
 // public Item removeFirst() ;
  public Item removeLast() ;
  public int size() ;
  //public void insert(Item x , int position) ;
  public Item get(int x) ;

  default public void print(){
    for(int i = 0 ; i < size(); i=i+ 1){
        System.out.print(get(i) +" ");
    }
  }
}
