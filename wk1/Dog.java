public class Dog{
  public int  weightInPounds ; /** can define an instance variable, varying by instance */
  public String static bioname = "dog family name"; /** can define a static variable */

  public Dog(int startweightInPounds){
    weightInPounds = startweightInPounds ;
  }
  /** static method is something invoked by class , should access using class name.method*/
  public static Dog maxDog(Dog d1, Dog d2) {
    if (d1.weightInPounds > d2.weightInPounds) {
        return d1;
    }
    return d2;
  }
 /** non-static method is an instance method, sth invoked by an instance of the class, should access using instance.method*/
  public Dog maxDog2(Dog d2) {
      if (this.weightInPounds > d2.weightInPounds) {
          return this;
      }
      return d2;
  }

  public Dog maxDog3(Dog d1, Dog d2) {
    /** when declared as instance method, a parameter like weightInPounds refers to the instance
     we can use weightInPounds or this.weightInPounds */
      if (weightInPounds > d2.weightInPounds) {
          System.out.println(weightInPounds) ;
          return this;
      }
      return d2;
  }

  public void make_noice(){
    if(weightInPounds < 10){
      System.out.println("wooooooooof!") ;
    }
    else if(weightInPounds < 50){
      System.out.println("wahooooo!") ;
    }
    else{
      System.out.println("Ahoooooooo!") ;
    }

  }

}
