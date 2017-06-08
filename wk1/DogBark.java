public class DogBark{


  public static void main(String[] args){
    /**
      Dog is a public class therefore can be used in a seperate file
    */
    Dog[] dogs = new Dog[2] ;
    dogs[0] = new Dog(151) ;
    dogs[1] = new Dog(16) ;

    Dog heavy_dog  ;
    //heavy_dog = maxDog(dogs[0] ,dogs[1]) ;
    heavy_dog = dogs[0].maxDog3(dogs[0],dogs[1]) ;
    heavy_dog.make_noice();

  }

}
