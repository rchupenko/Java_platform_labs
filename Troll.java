package middleearth;
public class Troll extends MiddleEarthCitizen {
    static final int min_power = 11;
    static final int max_power = 15;
    public Troll(){
        this.power = getPower(min_power,max_power);
    }
}
