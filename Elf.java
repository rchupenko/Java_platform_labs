package middleearth;
public class Elf extends MiddleEarthCitizen {
    static final int min_power = 4;
    static final int max_power = 7;
    public Elf() {
        this.power = getPower(min_power,max_power);
    }
}
