package geometrie;

/**.
* Klasse Quader
*/

public class Zylinder extends Figur3D 
{
    // Objektattribute
    private int hoehe;
  
    
    // Konstruktor
    public Zylinder(Kreis k, int hoehe) 
    {
        super(k);
        this.hoehe = Math.max(1, hoehe);
    }
  
    
    // Getter- und Settermethoden
    public int getHoehe() 
    {
        return hoehe;
    }
  
    public void setHoehe(int hoehe) 
    {
        this.hoehe = Math.max(1, hoehe);
    }
    
    public Kreis getBoden()
    {
        return (Kreis) super.getBoden();
    }
    
    public void setBoden(Kreis boden)
    {
        super.setBoden(boden);
    }

    // Objektmethoden
    public double volumen() 
    {
    // TODO Auto-generated method stub
        return Math.PI * getBoden().getRadius() * getBoden().getRadius() * hoehe;
    }

    @Override
    public double oberflaeche() 
    {
    // TODO Auto-generated method stub
        return 2 * Math.PI * getBoden().getRadius() * getBoden().getRadius() + 2 *  Math.PI * getBoden().getRadius() * hoehe;
    }
}
