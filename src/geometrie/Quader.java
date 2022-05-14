package geometrie;

import java.io.ObjectInputStream.GetField;
import java.lang.Math;

/**.
* Klasse Quader
*/

public class Quader extends Figur3D 
{
    // Objektattribute
    private int hoehe;
  
    // Konstruktor
    public Quader(Rechteck r, int hoehe) 
    {
        super(r);
        this.setHoehe(hoehe);
    }
  
    // Getter- und Settermethoden
    
    // Getter- und Setter für Breite und Länge
    public Rechteck getBoden()
    {
        Figur2D myBoden = super.getBoden();
        return (Rechteck) myBoden;
    }
    
    public void setBoden(Rechteck boden) 
    {
        super.setBoden(boden);
    }
  
    
    public int getHoehe() 
    {
        return this.hoehe;
    }
  
    /**
     * Sets the height, at least 1
     * 
     * @param hoehe
     */
    public void setHoehe(int hoehe) 
    {
        this.hoehe = Math.max(1, hoehe);
    }
  
    
    public double laengeRaumdiagonale() 
    {
        return Math.sqrt(Math.pow(getBoden().getBreite(), 2) + Math.pow(getBoden().getLaenge(), 2) + Math.pow(hoehe, 2));
    }
 
  
    public static boolean istWuerfel(Object o) 
    {
        if (o instanceof Quader) 
        {
            Quader that = (Quader) o;
            return that.getHoehe() == that.getBoden().getLaenge() && that.getHoehe() == that.getBoden().getBreite();
        }
        
        return false;
    }
  
    public boolean equals(Figur3D f) 
    {
        return true;
    }

    @Override
    public double volumen() 
    {
    // TODO Auto-generated method stub
        return getBoden().getLaenge() * getBoden().getBreite() * hoehe;
    }

    @Override
    public double oberflaeche() 
    {
    // TODO Auto-generated method stub
        return 2 * (getBoden().getBreite() * getBoden().getLaenge() + getBoden().getBreite() * hoehe + getBoden().getLaenge() * hoehe);
    }
}
