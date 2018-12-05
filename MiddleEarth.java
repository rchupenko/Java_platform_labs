package middleearth;
import java.util.Random;
public class MiddleEarth {
    public int getPower(int min_power,int max_power){
        Random rnd = new Random();
        return Math.round((float)(rnd.nextDouble() * Math.abs(max_power - min_power) + min_power));   
    }
    public static String getRace(MiddleEarthCitizen citizen){
        String ans = new String();
        if (citizen instanceof Human) ans = "Human";
        if (citizen instanceof Elf) ans = "Elf";
        if (citizen instanceof Woodenelf) ans = "Woodenelf";
        if (citizen instanceof Rohhirim) ans = "Rohhirim";
        if (citizen instanceof Wizard) ans = "Wizard";
        if (citizen instanceof Orc) ans = "Orc";
        if (citizen instanceof UrukHai) ans = "UrukHai";
        if (citizen instanceof Troll) ans = "Troll";
        if (citizen instanceof Goblin) ans = "Goblin";
        return ans;
    }
    public static void strike(MiddleEarthCitizen Citizen1, MiddleEarthCitizen Citizen2){
         if (Citizen1.power > 0) Citizen2.power = Citizen2.power - Citizen1.power;
    } 
    public static int randomCount(int n){
        int cnt;
        if (n <= 0) return 0;
        else {
            Random rnd = new Random();
            cnt = Math.round((float)(rnd.nextDouble() * (n - 1) + 1));
            return cnt;
        } 
    }
    public static MiddleEarthCitizen[] generateLightArmy(int light_Cavalry,int light_Infantry){
        MiddleEarthCitizen[] lightArmy = new MiddleEarthCitizen[light_Cavalry + light_Infantry];
        System.out.println("Светлой кавалерии = " + light_Cavalry);
        System.out.println("Светлой пехоты = " + light_Infantry);
        System.out.println("Итого = "+(light_Cavalry + light_Infantry));
        boolean have_wizard;
        Random rnd = new Random();
        have_wizard = rnd.nextBoolean();
        System.out.println("Наличие волшебника у светлой стороны = "+have_wizard);
        System.out.println("Создание светлой армии");
        if (have_wizard) {
            lightArmy[0] = new Wizard();
            System.out.println("Воин светлой армии ["+0+"] = Wizard "+lightArmy[0].power+" "+lightArmy[0].firststrike);
        }
        else {
            lightArmy[0] = new Rohhirim();
                System.out.println("Воин светлой армии ["+0+"] = Rohhirim "+lightArmy[0].power+" "+lightArmy[0].firststrike);
        }
        for (int i = 1; i <= light_Cavalry - 1; i++) { //Создание кавалерии
            lightArmy[i] = new Rohhirim();System.out.println("Воин светлой армии ["+i+"] = Rohhirim "+lightArmy[i].power+" "+lightArmy[i].firststrike);
        }
        int type_light_warrior;
        for (int i = light_Cavalry; i <= light_Cavalry + light_Infantry - 1; i++) {
            type_light_warrior = randomCount(3);
            switch (type_light_warrior) {
                case 1: lightArmy[i] = new Human();System.out.println("Воин светлой армии ["+i+"] = Human "+lightArmy[i].power+" "+lightArmy[i].firststrike);break;
                case 2: lightArmy[i] = new Elf();System.out.println("Воин светлой армии ["+i+"] = Elf "+lightArmy[i].power+" "+lightArmy[i].firststrike);break;
                case 3: lightArmy[i] = new Woodenelf();System.out.println("Воин светлой армии ["+i+"] = Woodenelf "+lightArmy[i].power+" "+lightArmy[i].firststrike);break; 
            }
        }
        System.out.println("Светлая армия создана");
        return lightArmy;
    }
    public static MiddleEarthCitizen[] generateDarkArmy(int dark_Cavalry,int dark_Infantry){
        MiddleEarthCitizen[] darkArmy = new MiddleEarthCitizen[dark_Cavalry + dark_Infantry];
        System.out.println("Темной кавалерии = " + dark_Cavalry);
        System.out.println("Темной пехоты = " + dark_Infantry);
        System.out.println("Итого = "+(dark_Cavalry + dark_Infantry));
        System.out.println("Создание темной армии");
        for (int i = 0; i <= dark_Cavalry - 1; i++) { //Создание кавалерии
            darkArmy[i] = new Orc();
            System.out.println("Воин темной армии ["+i+"] = Orc "+darkArmy[i].power+" "+darkArmy[i].firststrike);
        }
        int type_dark_warrior;
        for (int i = dark_Cavalry; i <= dark_Cavalry + dark_Infantry - 1; i++) {
            type_dark_warrior = randomCount(3);
            switch (type_dark_warrior) {
                case 1: darkArmy[i] = new UrukHai();System.out.println("Воин темной армии ["+i+"] = UrukHai "+darkArmy[i].power+" "+darkArmy[i].firststrike);break;
                case 2: darkArmy[i] = new Troll();System.out.println("Воин темной армии ["+i+"] = Troll "+darkArmy[i].power+" "+darkArmy[i].firststrike);break;
                case 3: darkArmy[i] = new Goblin();System.out.println("Воин темной армии ["+i+"] = Goblin "+darkArmy[i].power+" "+darkArmy[i].firststrike);break; 
            }
        }
        System.out.println("Темная армия создана");
        return darkArmy;
    }
    public static MiddleEarthCitizen fight(MiddleEarthCitizen Citizen1, MiddleEarthCitizen Citizen2){
        if ((Citizen1.firststrike == true) && (Citizen2.firststrike == true)){
            boolean fs; 
            Random rnd = new Random();
            fs = rnd.nextBoolean();
            if (fs == true) {System.out.println("Первым бъет С1");
                while ((Citizen1.power > 0) && (Citizen2.power > 0)){
                    if (Citizen1.power > 0) {strike(Citizen1,Citizen2);System.out.println("C1 бъет C2. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                    if (Citizen2.power > 0) {strike(Citizen2,Citizen1);System.out.println("C2 бъет C1. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                }
            }    
            else {System.out.println("Первым бъет С2");
                while ((Citizen1.power > 0) && (Citizen2.power > 0)){
                     if (Citizen2.power > 0) {strike(Citizen2,Citizen1);System.out.println("C2 бъет C1. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                     if (Citizen1.power > 0) {strike(Citizen1,Citizen2);System.out.println("C1 бъет C2. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                 }
            }    
        }
        else {
            if(Citizen1.firststrike == true) {System.out.println("Первым бъет С1");
                while ((Citizen1.power > 0) && (Citizen2.power > 0)){
                    if (Citizen1.power > 0) {strike(Citizen1,Citizen2);System.out.println("C1 бъет C2. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                    if (Citizen2.power > 0) {strike(Citizen2,Citizen1);System.out.println("C2 бъет C1. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                }
            }
                
            else { System.out.println("Первым бъет С2");
                while ((Citizen1.power > 0) && (Citizen2.power > 0)){
                     if (Citizen2.power > 0) {strike(Citizen2,Citizen1);System.out.println("C2 бъет C1. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                     if (Citizen1.power > 0) {strike(Citizen1,Citizen2);System.out.println("C1 бъет C2. power С1 = "+Citizen1.power+" power C2 = "+Citizen2.power);}
                 } 
            }   
        }
    if (Citizen1.power < 0) {System.out.println("Победил С2");return Citizen2;}
    else {System.out.println("Победил С1");return Citizen1;}
    }
    public static int countSurvivor(MiddleEarthCitizen[] citizen){
        int count = 0;
        for (int i = 0; i <= citizen.length - 1; i++){
            if (citizen[i].power > 0) count++; 
        }
        return count;
    }
    public static MiddleEarthCitizen random_warrior(MiddleEarthCitizen[] army){
        MiddleEarthCitizen citizen;
        MiddleEarthCitizen[] live = new MiddleEarthCitizen[army.length];
        int j = 0;
        for(int i = 0; i <= army.length - 1; i++){
            if (army[i].power>0 ) {
                live[j]=army[i];
                j++;
            }
        }
        citizen = live[randomCount(j-1)];
        return citizen;
    }
    public static String Battle(MiddleEarthCitizen[] lightArmy,MiddleEarthCitizen[] darkArmy){
        String winner;
        MiddleEarthCitizen win;
        MiddleEarthCitizen lightwarrior,darkwarrior;
        String rl,rd;
        int fght = 1;
        /* battle */
        while ((countSurvivor(lightArmy)>0) && (countSurvivor(darkArmy)>0)){
            lightwarrior = random_warrior(lightArmy);
            darkwarrior = random_warrior(darkArmy);
            rl = getRace(lightwarrior);
            rd = getRace(darkwarrior);
            System.out.println("Схватка # "+fght);
            System.out.println("Бъется "+rl+" - C1 power = "+lightwarrior.power);
            System.out.println("И "+rd+" - C2 power = "+darkwarrior.power);
            win = fight(lightwarrior,darkwarrior);
            fght++;
        }
        if (countSurvivor(lightArmy)>0) winner = "light"; 
        else winner = "dark";
        return winner;
    }
    public static void main(String[] args) {
        MiddleEarthCitizen[] lightArmy;
        MiddleEarthCitizen[] darkArmy;
        lightArmy = generateLightArmy(randomCount(2),randomCount(2));
        darkArmy = generateDarkArmy(randomCount(2),randomCount(2));
        String winner;
        winner = Battle(lightArmy,darkArmy);
        System.out.println("Победила армия "+winner);
    }
}
