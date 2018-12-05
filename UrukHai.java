package middleearth;
public class UrukHai extends Orc{
    static final int min_power = 10;
    static final int max_power = 12;
    public UrukHai(){
        this.power = getPower(min_power,max_power);
    }   
}
