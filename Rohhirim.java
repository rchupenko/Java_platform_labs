package middleearth;
public class Rohhirim extends Human {
    static final int min_power = 7;
    static final int max_power = 8;
    Horse hisHorse;
    public Rohhirim(){
        this.hisHorse = new Horse(); 
        this.power = getPower(min_power,max_power) + hisHorse.power;
        this.firststrike = true; 
    }
}
