public class Planet{
  public double xxPos ;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass ;
  public String imgFilename;


  public Planet(double xP, double yP, double xV,
                double yV, double m, String img){
    xxPos = xP ;
    yyPos = yP ;
    xxVel = xV ;
    yyVel = yV ;
    mass  = m  ;
    imgFilename = img;
  }

  public Planet Planet_Copy(Planet p){
    xxPos = p.xxPos ;
    yyPos = p.yyPos ;
    xxVel = p.xxVel ;
    yyVel = p.yyVel ;
    mass  = p.mass  ;
    imgFilename = p.imgFilename;
    return this ;
  }

  /** distrance from a planet*/
  public double calcDistance(Planet p){
    return Math.sqrt(  Math.pow(this.xxPos - p.xxPos , 2 ) + Math.pow(this.yyPos - p.yyPos , 2 )   ) ;

  }

  public Boolean equalPlanet(Planet p){
    if(  this.xxPos == p.xxPos && this.yyPos == p.yyPos){
      return true ;
    }
    else{
      return false ;
    }
  }

  public double calcForceExerted(Planet p){
    if(this.equalPlanet(p)){
      return 0 ;
    }
    else{
      return 6.67*Math.pow( 10, -11  )*this.mass*p.mass/Math.pow(this.calcDistance(p) ,2 ) ;
    }
  }

  public double calcForceExertedByX(Planet p){
    if(this.equalPlanet(p)){
      return 0 ;
    }
    else{
      return 6.67*Math.pow( 10, -11  )*this.mass*p.mass/Math.pow(this.calcDistance(p) ,2 )*( p.xxPos - this.xxPos  )/this.calcDistance(p) ;
    }
  }

  public double calcForceExertedByY(Planet p){
    if(this.equalPlanet(p)){
      return 0 ;
    }
    else{
      return 6.67*Math.pow( 10, -11  )*this.mass*p.mass/Math.pow(this.calcDistance(p) ,2 )*( p.yyPos - this.yyPos )/this.calcDistance(p) ;
    }
  }

  public Planet update( double dt , double fX , double fY ){
    double ax = fX/this.mass ;
    double ay = fY/this.mass;
    this.xxVel += dt*ax ;
    this.yyVel += dt*ay ;
    this.xxPos += dt*this.xxVel ;
    this.yyPos += dt*this.yyVel ;
    return this ;
  }

}
