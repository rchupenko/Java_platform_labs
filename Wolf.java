package middleearth;
public class Wolf extends MiddleEarth{
    int power;
    static final int min_power = 4;
    static final int max_power = 7;
    public Wolf(){
        this.power = getPower(min_power,max_power);
    }
}
