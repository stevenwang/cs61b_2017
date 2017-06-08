public class TestPlanetConstructor{

  public static void main(String[] args) {
    Planet p1 = new Planet(Math.pow(10, 12), 2.0*Math.pow( 10, 11 ), 10.2,
                    2.2, 2.0*Math.pow(10, 30)  , "Sun.jpg") ;

    Planet p2 = new Planet(2.3*Math.pow(10, 12), 9.5*Math.pow( 10, 11 ),  .4,
                    0.2, 6.0*Math.pow(10, 26)  ,  "Saturn.jpg") ;

    System.out.printf("Distance between p1  (%.3f, %.3f) and p2 (%.3f, %.3f): %.4f%n "  , p1.xxPos, p1.yyPos, p2.xxPos, p2.yyPos, p1.calcDistance(p2) );
    System.out.printf("Force exerted by p2 on p1: : %.10f%n"  ,  p1.calcForceExerted(p2) );
    System.out.printf("Force exerted by p2 on p1 by X: : %.10f%n"  ,  p1.calcForceExertedByX(p2) );
    System.out.printf("Force exerted by p2 on p1 by Y: : %.10f%n"  ,  p1.calcForceExertedByY(p2) );
    System.out.printf("Force exerted by p1on p1  : : %.10f%n"  ,  p1.calcForceExerted(p1) );

    Planet p3 = new Planet(0, 0, 3,5, 1, "sample.jpg") ;
    System.out.printf("current p3 position (%.3f, %.3f)"  , p3.xxPos, p3.yyPos );
    p3 = p3.update(1, -5,-2)  ;
    System.out.printf("new p3 position (%.3f, %.3f)"  , p3.xxPos, p3.yyPos );

  }
}
