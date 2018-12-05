package middleearth;
public class Goblin extends MiddleEarthCitizen{
    static final int min_power = 2;
    static final int max_power = 5;
    public Goblin(){
        this.power = getPower(min_power,max_power);
    }
}
