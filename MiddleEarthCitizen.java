package middleearth;
public class MiddleEarthCitizen extends MiddleEarth {
    int power;
    boolean firststrike;
    boolean living_status;
    int min_power;
    int max_power;
    /*public void MiddleEarthCitizen(int pwr) {
        this.living_status = true;
        this.power = pwr;
        this.firststrike = false;
    } */
    public void MiddleEarthCitizen() {
        this.living_status = true;
        this.power = getPower(min_power,max_power);
        this.firststrike = false;
    }   
}
