package geometrie;

import java.lang.Math;

/**.
* Random Javadoc-Kommentar
*/

public class Punkt 
{
    // Objektattribute
    private int x;
    private int y;
    
    
    // Konstruktoren
    public Punkt(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    // Konstruktor Punkt-Instanz mit default-Werten
    public Punkt(Punkt p2)
    {
        this.x = p2.getX();
        this.y = p2.getY();
    }

    
    // Getter- und Settermethoden
    
    public int getX() 
    {
        return this.x;
    }

    public int getY() 
    {
        return this.y;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public void setY(int y) 
    {
        this.y = y;
    }

    
    // Objektmethoden
    
    public double abstand(Punkt p) 
    {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void verschieben(int deltaX, int deltaY) 
    {
        x += deltaX;
        y += deltaY;
    }
  
  /**.
  * Random Javadoc-Kommentar
  */
  
    public boolean equals(Punkt p2) 
    {
        return (p2.getX() == this.x && p2.getY() == this.y);
    }
}


