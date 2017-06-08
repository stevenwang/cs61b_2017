public class IntList{
  public int first ;  /** a value of the list */
  public IntList rest ; /** store where the list to linked to next*/

  public IntList(int f , IntList r){
    first = f ;
    rest = r  ;
  }

  public int size(){
    if(this.rest == null){
      return 1 ;
    }
    else{
      return 1 + this.rest.size() ;
    }
  }

  public int IterativeSize(){
    int totalSize = 0 ;
    IntList p = this;
    while(p!= null ){
      totalSize += 1 ;
      p = p.rest ;
    }
    return totalSize ;
  }

  public int get(int n){
    int i =  0;
    IntList p = this;
    while(i<n){
      p = p.rest ;
      i+=1 ;
    }
    return p.first ;
  }


  public static void main(String[] args) {
    IntList L = new IntList( 5, null ) ;
    L = new IntList(10, L) ;
    L = new IntList(15, L) ;

    int i = 0 ;
    while( i < L.size()){
      System.out.println( L.get(i) );
      i += 1 ;
    }
  }






}
