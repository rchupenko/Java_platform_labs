package middleearth;
public class Wizard extends MiddleEarthCitizen{
    Horse wizardHorse;
    public Wizard(){
        this.wizardHorse = new Horse();
        this.power = 20 + wizardHorse.power;
        this.firststrike = true; 
    }
}
