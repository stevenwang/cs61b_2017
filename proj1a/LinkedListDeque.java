/**
  PROJECT 0: D LIST (DOUBLE LINKED LIST) - Array
*/

public class LinkedListDeque<Item>{
  public class StuffNode{
    public Item  item ;
    public StuffNode pre ;
    public StuffNode next ;
    public StuffNode(Item i, StuffNode p, StuffNode n ){
      item = i ;
      pre = p  ;
      next = n  ;
    }
  }

  private StuffNode sentHead ; /** sentHead points to first item */
  private StuffNode sentTail  ; /** sentTail points to last item */
  private int size ;
/** create an empty D-list
*/
  public LinkedListDeque(){
    size = 0 ;
  }

  public void addFirst(Item x){
    StuffNode tmp = new StuffNode(x , null, sentHead ) ;
    if(sentHead!=null){
      sentHead.pre = tmp ;
    }
    sentHead = tmp ;
    if(sentTail==null) sentTail = tmp ;
    size += 1 ;
    System.out.println("at front adding: "+ x );
  }

  public void addLast(Item x){
    StuffNode tmp = new StuffNode(x , sentTail, null ) ;
    if(sentTail!=null){
      sentTail.next = tmp ;
    }
    sentTail = tmp ;
    if(sentHead==null) sentHead = tmp ;
    size += 1 ;
    System.out.println("at tail adding: "+ x );
  }

  public int size(){
    return size ;
  }

  public boolean isEmpty(){
    if(size == 0){
      return true ;
    }
    else{
      return false ;
    }
  }

  public void printDeque(){
    if(size == 0) System.out.println("empty list - nothing to print");

    int cnt = 1;
    StuffNode ptr = sentHead ;
    while(cnt<=size){
      System.out.print(ptr.item) ;
      System.out.print(" ");
      ptr = ptr.next ;
      cnt = cnt + 1 ;
    }
    System.out.println("...end of print queue") ;
  }

  public StuffNode removeFirst(){
    if(size == 0){
      return null ;
    }
    else{
      StuffNode oldFirst  = sentHead;
      sentHead = sentHead.next ;
      if(sentHead!=null) sentHead.pre = null ;
      size = size - 1 ;
      System.out.println("at front remove" + oldFirst.item);
      return  oldFirst;
    }
  }

  public StuffNode removeLast(){
    if(size == 0){
      return null ;
    }
    else{
      StuffNode oldLast  = sentTail;
      sentTail = sentTail.pre ;
      if(sentTail!=null) sentTail.next = null ;
      size = size - 1 ;
      System.out.println("at tail remove" + oldLast.item);
      return oldLast;
    }
  }
/**  get item index x
*/
  public StuffNode get(int x){
    if(x > size-1){
      System.out.println("x is larger than size");
      return null ;
    }
    int cnt = 0 ;
    StuffNode ptr = sentHead ;
    while(cnt < x){
      ptr = ptr.next ;
      cnt += 1 ;
    }
    return ptr  ;
  }

}
