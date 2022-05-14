package geometrie;

/**.
* Random Javadoc-Kommentar
*/

public class Gerade 
{
    // Objektattribute
    
    private Punkt startPos;
    private Punkt endPos; 

    
    // Konstruktor
    
      
    public Gerade(Punkt start, Punkt ende) 
    {
  
        this.startPos = start;
        this.endPos = ende;
    }
     
    // Getter- und Settermethoden
    
    public Punkt getStartPos()
    {
        return startPos;
    }
    
    public void setStartPos(Punkt startPos)
    {
        this.startPos = startPos;
    }
    
    public Punkt getEndPos()
    {
        return endPos;
    }
    
    public void setEndPos(Punkt endPos)
    {
        this.endPos = endPos;
    }

    
    // Objektmethoden
    
    public double laenge() 
    {
        return Math.sqrt(Math.pow((startPos.getX()-startPos.getY()), 2) + Math.pow((endPos.getX() - endPos.getY()), 2));
    }

    public boolean istLaengerAls(Gerade g2) 
    {
        return (this.laenge() > g2.laenge());
    }

    public boolean equals(Gerade g2) 
    {
        return (g2.getStartPos().equals(this.startPos) && g2.endPos.equals(this.endPos) || (g2.getStartPos().equals(this.endPos) && g2.getEndPos().equals(this.startPos)));
    }
}
