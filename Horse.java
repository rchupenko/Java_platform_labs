package middleearth;
public class Horse extends MiddleEarth {
    int power;
    static final int min_power = 4;
    static final int max_power = 5;
    public Horse() {
        this.power = getPower(min_power,max_power);
    }
}
