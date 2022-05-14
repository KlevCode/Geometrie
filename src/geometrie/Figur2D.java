package geometrie;

/**.
* Klasse Figur2D
*/

public abstract class Figur2D 
{
    // Objektattribute
    private Punkt bezug;
        
    //Konstruktoren

    public Figur2D(Punkt bezug) 
    {
        this.bezug = bezug;
    }
    
  
    public Figur2D(int bezugX, int bezugY) 
    {
        this.bezug = new Punkt(bezugX, bezugY);
    }
    
    
    // Getter- und Settermethoden
    
    public Punkt getBezug()
    {
        return bezug;
    }
    
    public void setBezug(Punkt bezug)
    {
        this.bezug = bezug;
    }
    
    
    // Abstrakte Methoden
    
    public abstract double umfang();
  
    public abstract double flaeche();
}