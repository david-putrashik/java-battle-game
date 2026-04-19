package inheritance;

public class Character {

    private String name;
    private int damage;
    private int health;

    boolean isAlive() {return health > 0;}

    public String getName() {return name;}
    public int getDamage () {return damage;}
    public int getHealth () {return health;}

    public void setName(String newName) {name = newName;}
    public void setDamage(int newDamage) {damage = newDamage;}
    public void setHealth(int newHealth) {health = newHealth;}

    public Character (String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }
    public void takeDamage(int damage) {
        int getHealth = getHealth() - damage;
        setHealth(getHealth);
    }
    public void hit (Character target) {
        try {
            Thread.sleep(1000);            //поуза в выводе на 1 сек.
        } catch (InterruptedException e ) {
            System.out.println("Ошибка паузы!");
        }
        int damage = this.getDamage();

        System.out.println(this.name + " атаковал " + target.getName() + " и нанес - " + damage + " урона!");
        target.takeDamage(damage);
        System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + "HP!");

    }
    public void printStats() {
        System.out.println("Имя - " + this.getName() + " | Урон:" + this.getDamage() + " | HP: " + this.getHealth());
    }
}
