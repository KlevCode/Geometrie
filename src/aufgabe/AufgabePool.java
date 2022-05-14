package aufgabe;

import geometrie.Figur2D;
import geometrie.Figur3D;
import geometrie.Gerade;
import geometrie.Kreis;
import geometrie.Punkt;
import geometrie.Quader;
import geometrie.Rechteck;
import geometrie.Zylinder;

public class AufgabePool 
{
    private Quader q;
    private Zylinder z1;
    private Zylinder z2;
    private Zylinder z3;
    private Rechteck r;
    
    
    private int k1Durchmesser = r.getBreite();
    private int k2Durchmesser = (r.getBreite() - 20) / 2;
    private int k3Durchmesser = k2Durchmesser;
    private double linkeSeite = k2Durchmesser + 20;
    
    
    
    public AufgabePool()
    {
       
    }
    
    
    public double poolVolumen()
    {
        int tiefe = 2;
        return linkeSeite * r.getLaenge() * tiefe;
    }
    
    public double poolUmfang()
    {
        return q.volumen() + ((Math.PI * k1Durchmesser) / 2) + linkeSeite;
    }
    
    public double poolInnererMantel()
    {
        return q.volumen() - r.flaeche();
    }
    
    public double poolWasserOberflaeche()
    {
        return r.flaeche() + (k1Durchmesser / 2) +  (k2Durchmesser / 2) * 2;
    }
    
    public double kostenZaun(double preisProStueck)
    {
        return r.umfang() * preisProStueck;
    }
    
    public Quader getQ()
    {
        return this.q;
    }
    
    public Zylinder getZ1()
    {
        return z1;
    }
    
    public Zylinder getZ2()
    {
        return z2;
    }
    
    public Zylinder getZ3()
    {
        return z3;
    }
}


