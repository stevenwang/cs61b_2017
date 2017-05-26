public class LeapYear{
  /**
    if a year is divisable by 4 but not divisable by 100 except those
    are divisable by 400 are leap years
  */
  public static boolean isLeapYear(int year){
    if(year%4 != 0){
      return false ;
    }
    else if(year%100 != 0){
      return true ;
    }
    else if(year%400 == 0){
      return true ;
    }
    else{
      return false ;
    }
  }

  public static void main(String[] args) {
      if (args.length < 1) {
          System.out.println("Please enter command line arguments.");
          System.out.println("e.g. java Year 2000");
      }
      for (int i = 0; i < args.length; i++) {
          try {
              int year = Integer.parseInt(args[i]);
              if(isLeapYear(year)){
                System.out.println(year + "is a leap year");
              }
              else{
                System.out.println(year + "is not a leap year");
              }
          } catch (NumberFormatException e) {
              System.out.printf("%s is not a valid number.\n", args[i]);
          }
      }
  }


}
