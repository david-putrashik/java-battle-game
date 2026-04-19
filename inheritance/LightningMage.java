package inheritance;

public class LightningMage extends HeroA {
    private int lightning;
    public int getLightning(){return lightning;}
    public void setLightning(int newL) { lightning = newL;}

    public LightningMage (String name, int damage, int health, int lightning) {super(name, damage, health);
        this.lightning = lightning;
    }
    public void specMagAtk(Character target) {
        target.takeDamage(getLightning());
        System.out.println(this.getName() + " использщвал особый навык !\n" + "И нанес " + target.getName() + " - " +
                getLightning() + " урона!");
        System.out.println(" У " + target.getName() + " осталось - " + target.getHealth() + "HP! ");
    }
}
