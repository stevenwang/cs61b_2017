public class NBody {

  /**
    @param filepath : path for data file to rad in
    In libary scan file from start to end separete by space

  */
  public static double readRadius(String filepath){

    In in = new In(filepath);
    int i = 1 ;
    while(!in.isEmpty()){
      double radius = in.readDouble() ;
      System.out.println();
      if(i == 2){
        return radius ;
      }
      i  += 1 ;
    }
    return 0.0 ;
  }

  /**

  */
  public static Planet[] readPlanets(String filepath){

    In in = new In(filepath);
    int N = in.readInt() ;
    Planet[] planets = new Planet[N] ; /** array starts from 0 in JAVA*/
    double radius = in.readDouble() ;

    int i = 0 ;
    while(!in.isEmpty()&& i<N){

      planets[i] = new Planet( in.readDouble(), in.readDouble(),in.readDouble(), in.readDouble(), in.readDouble(), "images/"+in.readString()  ) ;
      i += 1;
    }
    return planets ;
  }

  public static void main(String[] args) {
    if(args.length <3){
      System.out.println("you need to give 3 parameters");
      System.out.println("the 0th and 1st command line arguments as doubles named T and dt");
      System.out.println("the 2nd command line argument as a String named filename");
    }
    /** set up parameter and background which should be compatible scale as position of planets or images */

    double T =Double.parseDouble( args[0]);
    double dt =Double.parseDouble( args[1]);
    String filename = args[2] ;

    Planet[] planets = NBody.readPlanets(filename);
    double radius = NBody.readRadius(filename);

    StdDraw.setScale(-1*radius, radius);
    StdDraw.picture(0, 0, "images/starfield.jpg", 2*radius, 2*radius);

    /** animation */
    //StdAudio.play("./audio/2001.mid") ;

    double t  = 0.0;
    while(t <T ){
      Double[] xForces = new Double[planets.length]   ;
      Double[] yForces = new Double[planets.length]   ;

      for(int i = 0; i < planets.length; i = i + 1){
        xForces[i] = 0.0 ;
        yForces[i] = 0.0 ;
        for(int j = 0 ; j < planets.length; j = j + 1){
          xForces[i] += planets[i].calcForceExertedByX(planets[j])  ;
          yForces[i] += planets[i].calcForceExertedByY(planets[j])  ;
        }
      }
      for (int i=0; i < planets.length ; i = i +1 ) {
        planets[i].update(dt, xForces[i], yForces[i]) ;
      }

      StdDraw.setScale(-1*radius, radius); /** set up scale which should be compatible scale as position of planets or images */
      StdDraw.picture(0, 0, "images/starfield.jpg", 2*radius, 2*radius);

      for(Planet p : planets){
        p.draw() ;
      }

      StdDraw.show(10);

      t += dt ;
    }

    /** end of animation print last position of planets */
    System.out.println(planets.length);
    System.out.println(radius);
    for(Planet p: planets){
      System.out.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                p.xxPos, p.yyPos, p.xxVel, p.yyVel, p.mass, p.imgFileName);
    }

  }

}


























/**/
