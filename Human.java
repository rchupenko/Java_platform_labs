package middleearth;
public class Human extends MiddleEarthCitizen {
    static final int min_power = 7;
    static final int max_power = 8;
    public Human() {
        this.power = getPower(min_power,max_power);
    }   
}
