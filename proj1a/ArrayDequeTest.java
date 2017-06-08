public class ArrayDequeTest{

  public static void operationTest(){
    System.out.println("operation test started ...");
    ArrayDeque L = new ArrayDeque() ;
    L.printDeque() ;
    L.addFirst(1) ;
    L.addFirst(2) ;
    L.addLast(10) ;
    L.addLast(11) ;
    L.addLast(12) ;
    L.insertDest(-1, 2) ;
    L.printDeque() ;
    System.out.printf("\ntest swap\n");
    L.swap(0,2);
    L.printDeque() ;
    System.out.printf("\ntest reverse\n");
    L.reverseDest() ;
    L.printDeque() ;
    System.out.printf("\nget 2nd item of the list: %d \n", L.get(2));
    L.removeFirst() ;
    L.removeLast() ;
    L.printDeque() ;
  }

  public static void speedTest(){
    System.out.println("speed test started");
    int totSize = 100000 ;
    ArrayDeque L = new ArrayDeque() ;
    for(int i = 0 ; i < totSize ; i = i + 1){
      L.addLast(i) ;
    }
  }

  public static void xifyTest(){
    System.out.println("xify test started ...");
    int[] a  ;
    int[] b = new int[]{1,2,3} ;
    a = ArrayDeque.xify(  b ) ;
    for(int i = 0  ; i < a.length ; i = i + 1){
      System.out.printf("%d ", a[i]);
    }
  }

  public static void main(String[] args) {
    //operationTest() ;
    //speedTest() ;
    xifyTest() ;

  }



}
