package practick;

public class Weapon {

    private String nameW;
    private int damageW;

    public Weapon (String nameW, int damageW){
        this.nameW = nameW;
        this.damageW = damageW;
    }
    public int getDamageW(){
        return damageW;
    }     //возвращаем значение
    public String getNameW() {return nameW;}

}
