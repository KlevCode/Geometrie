package geometrie;

/**.
* Klasse Figur3D
*/

public abstract class Figur3D 
{
    // Objektattribute 
    private Figur2D boden;
  
    
    //Konstruktor
    public Figur3D(Figur2D f) 
    {
        this.boden = f;
    }
  
    
    // Getter- und Settermethoden
    public Figur2D getBoden() 
    {
        return boden;
    }
  
    public void setBoden(Figur2D boden) 
    {
        this.boden = boden;
    }

    public abstract double volumen();
 
    public abstract double oberflaeche();
 
}
