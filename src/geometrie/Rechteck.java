package geometrie;

import java.lang.Math;

/**.
* Klasse Rechteck
*/

public class Rechteck extends Figur2D
{

    // Objektattribute
    private int breite = 316;
    private int laenge = 875;
    
    // Konstruktor
  
    public Rechteck(Punkt bezug, int breite, int laenge) 
    {
        super(bezug);
        this.breite = Math.max(1, breite);
        this.laenge = Math.max(1, laenge);
    }

    // Getter und Setter Breite
    
    public int getBreite() 
    {
        return breite;
    }

    public void setBreite(int breite) 
    {
        this.breite = Math.max(1, breite);
    }
    

    // Getter und Setter Länge
    
    public int getLaenge() 
    {
        return laenge;
    }

    public void setLaenge(int laenge) 
    {
        this.laenge = Math.max(1, laenge);
    }
       

    // Objektmethoden
    
    public double diagonalenLaenge() 
    {
        return Math.sqrt(Math.pow(breite, 2) + Math.pow(laenge, 2));
    }
    
    @Override
    public double umfang() 
    {
        // TODO Auto-generated method stub
        return ((breite * 2) + (laenge * 2));
    }

    @Override
    public double flaeche() 
    {
        // TODO Auto-generated method stub
        return breite * laenge;
    }
    
    public boolean flaecheKleinerAls(Figur2D f)
    {
        return this.flaeche() < f.flaeche();
    }
    
    public boolean umfangKleinerAls(Figur2D f)
    {
        return this.umfang() < f.umfang();
    }
}

