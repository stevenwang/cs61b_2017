/**
  PROJECT 0: D LIST (DOUBLE LINKED LIST)
*/

public class LinkedListDeque{
  public static class IntNode{
    public int  item ;
    public IntNode pre ;
    public IntNode next ;
    public IntNode(int i, IntNode p, IntNode n ){
      item = i ;
      pre = p  ;
      next = n  ;
    }
  }

  private IntNode sentHead ;
  private IntNode sentTail  ;
  private int size ;
/** create an empty D-list
*/
  public LinkedListDeque(){
    size = 0 ;
    sentHead = new IntNode(-85, null, null) ;
    sentTail = new IntNode( 85, null, null) ;
    sentHead.next = sentTail ;
    sentTail.pre  = sentHead ;
  }

  public void addFirst(int x){
    IntNode tmp ;
    tmp = sentHead.next ;
    sentHead.next = new IntNode(x, sentHead, sentHead.next) ;
    tmp.pre = sentHead.next  ;
    size = size + 1 ;
  }

  public void addLast(int x){
    IntNode tmp ;
    tmp = sentTail.pre ;
    sentTail.pre = new IntNode(x, sentTail.pre, sentTail) ;
    tmp.next = sentTail.pre   ;
    size = size + 1 ;
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
    if(size == 0) System.out.printf("\n empty list - nothing to print\n");

    int cnt = 1;
    IntNode ptr = sentHead.next ;
    while(cnt<=size){
      System.out.printf("%d ", ptr.item) ;
      ptr = ptr.next ;
      cnt = cnt + 1 ;
    }
    System.out.printf(".... end of print queue\n") ;
  }

  public IntNode removeFirst(){
    if(size == 0){
      return null ;
    }
    else{
      IntNode first  = sentHead.next;
      sentHead.next = sentHead.next.next ;
      sentHead.next.pre = sentHead  ;
      size = size - 1 ;
      return first ;
    }
  }

  public IntNode removeLast(){
    if(size == 0){
      return null ;
    }
    else{
      IntNode last  = sentTail.pre;
      sentTail.pre = sentTail.pre.pre ;
      sentTail.pre.next = sentTail  ;
      size = size - 1 ;
      return last;
    }
  }

  public IntNode get(int x){
    if(x > size-1){
      System.out.println("x is larger than size");
      return null ;
    }
    int cnt = 0 ;
    IntNode ptr = sentHead.next ;
    while(cnt < x){
      ptr = ptr.next ;
      cnt += 1 ;
    }
    return ptr ;
  }

}
