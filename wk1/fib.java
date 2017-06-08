public class fib{
  public static long fib(long n){
    if(n == 1){
      return 0 ;
    }
    else if(n==2){
      return 1 ;
    }
    else{
      long pre1 = 1 ;
      long pre2 = 0 ;
      long cur  = 0 ;
      for(int i = 3; i <= n; i = i + 1){
        cur = pre1 + pre2 ;
        System.out.printf("fib(%d) = %d \n", i, cur);
        pre2 = pre1 ;
        pre1 = cur ;

      }
      return cur ;
    }
  }

  public static long fib2(long n){
    long f0 = 0 ;
    long f1 = 1 ;
    while(n> 0){
      long temp = f1 ;
      f1 = f0 + f1 ;
      f0 = f1 ;
      n -= 1 ;
    }
    return f0 ;
  }

  public static long fib3(long n , long k, long f0, long f1){
    return n == k ? f0 : fib3( n, k+1 ,f1 ,  f0 + f1) ; /** quick way to make a choice and do recursion*/
  }

  public static void main(String[] args) {
    if(args.length < 1){
      System.out.println("please enter a positive interger n");
      System.exit(0) ;
    }
    int n = Integer.parseInt(  args[0] );
    System.out.printf("fib(%d) is %d\n", n , fib3(n, 1, 0, 1));
    System.out.printf("fib(%d) is %d\n", n , fib(n));
  }

}
