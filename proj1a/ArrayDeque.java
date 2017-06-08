/** Array based list.
 *  @author Steven Wang
 */

public class ArrayDeque {
    private int[] items ;
    private int size ;
    /** Creates an empty list. */
    public ArrayDeque() {
      size = 0 ;
      items = new int[3] ;
    }

    /** add x to front of list */
    public void addFirst(int x) {
      if(items.length == size){
        resize(size*2) ;
      }
      for(int i= size; i >0; i=i-1){
        items[i] = items[i-1] ;
      }
      items[0] = x ;
      size += 1 ;
    }

    /** add x to end of list */
    public void addLast(int x) {
      if(items.length == size){
        resize(size*2) ;
      }
      items[size] = x;
      size += 1 ;
    }

    /** return size of list */
    public int size(){
      return size ;
    }

    /** check if list is empty*/
    public boolean isEmpty(){
      if(size == 0){
        return true ;
      }
      else{
        return false ;
      }
    }

    /** remove first item of list
        returns delted item
    */
    public int removeFirst() {
      if(size == 0){
        System.out.println("empty list -nothing to remove");
      }
      int first = items[0]  ;
      for(int i = 0; i < size-1 ; i=i + 1 ){
        items[i] = items[i+1] ;
      }
      size = size - 1;
      System.out.printf("remove %d from front of list\n", first);
      return first;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
      if(size == 0){System.out.println("empty list -nothing to remove");}
      size = size - 1;
      System.out.printf("remove %d from end of list\n", items[size -1 ]);
      return items[size-1];
    }

    public int get(int x){
      if(x > size-1){
        System.out.println("index out of list range");
        return 0 ;
      }
      else{
        return items[x] ;
      }
    }

    public void resize(int capacity ){
      int[] a = new int[capacity] ;
      System.arraycopy(items, 0, a, 0, size) ;
      items = a ;
      //System.out.printf("\nresize list capacity to %d \n", capacity);
    }

    /** insert x in position  - destructively*/
    public void insertDest(int x , int pos){
      if(pos < 0 || pos > size ){
        System.out.println("position out of range");
      }

      if(items.length == size){
        resize(size*2) ;
      }

      for(int i = size ; i > pos ; i = i - 1){
        items[i] = items[i -1 ] ;
      }
      items[pos] = x ;
      System.out.printf("\n%d added at position %d\n", x, pos);
      size += 1 ;
    }

    /** reverse list destructively - swap ( i, size-1 -i)*/
    public void reverseDest(){
      if(size > 1){
        for( int i = 0 ; i < size/2 ; i=i+ 1){
          swap(i, size-1-i) ;
        }
      }
    }

    public void swap(int j, int k){
      if(j!=k){
        int tmp  = items[j] ;
        items[j] = items[k] ;
        items[k] = tmp ;
      }
    }

    /**xify:
    * replaces the number at index i with x[i]
      copies of itself
    */
    public static int[] xify( int[] x ){
      int tot  = 0  ;
      for(int i = 0 ; i < x.length; i = i + 1){
        tot += x[i] ;
      }
      int[] a = new int[tot] ;
      int pos = 0 ;
      for( int i = 0 ; i < x.length ; i = i + 1){
        for(int j = 0; j < x[i]; j=j+1){
          a[pos] = x[i] ;
          pos += 1 ;
        }
      }
      return a  ;
    }

    public void printDeque(){
      if(size ==0 ) System.out.println("empty list - nothing to print");
      for(int i= 0; i < size ; i = i + 1){
        System.out.printf("%d ", items[i]);
      }
    }


}
