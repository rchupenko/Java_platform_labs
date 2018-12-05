package middleearth;
public class Orc extends MiddleEarthCitizen {
    static final int min_power = 8;
    static final int max_power = 10;
    private Wolf orcsWolf;
    public Orc() {
        this.orcsWolf = new Wolf();
        this.power = getPower(min_power,max_power) + orcsWolf.power;
        this.firststrike = true; 
    }
}
