package geometrie;

import java.lang.Math;

public class Kreis extends Figur2D 
{

    // Klassenattribut
    final static int DEFAULT_RADIUS = 5;
    
    // Objektattribut
    private int radius;
   
    
    // Konstruktoren
    
    public Kreis(Punkt bezug, int radius) 
    {
        super(bezug);
        this.radius = Math.max(1, radius);
    }
  
    public Kreis(Punkt bezug) 
    {
        super(bezug);
        this.radius = 1;
    }
  
    
    // Getter- und Settermethoden
    public static int getDefaultRadius()
    {
        return DEFAULT_RADIUS;
    }

    
    public int getRadius() 
    {
        return radius;
    }
  
    public void setRadius(int radius) 
    {
        this.radius = Math.max(1, radius);
    }
    
    //Objektmethoden
    public double umfang()
    {
        return 2 * Math.PI * getRadius();
    }
  
    public double flaeche()
    {
        return Math.PI * Math.pow(getRadius(), 2);
    }

   
}
