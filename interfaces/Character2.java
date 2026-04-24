package interfaces;

public class Character2 {
    private String name;
    private int damage;
    private int health;
    private int maxHP;

    public String getName() {return name;}
    public int getDamage () {return damage;}
    public int getHealth () {return health;}
    public int getMaxHP() {return maxHP;}

    public void setName (String newName) {name = newName;}
    public void setDamage (int newDamage) {damage = newDamage;}
    public void setHealth (int newHealth) {health = newHealth;}
    public void setMaxHP (int newMaxHP) {maxHP = newMaxHP;}

    public Character2(String name, int damage, int health, int maxHP) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.maxHP = maxHP;
    }

    public void takeDamage(int damage) {
        int newHealth = getHealth() - damage;

        if(newHealth < 0){
            setHealth(0);
        } else {
        setHealth(newHealth);
        }
    }
    public void printStats() {
        System.out.println("| Имя - " + this.name + " | Урон: " + this.damage + " | HP: " + this.health);
    }
    public void hit(Character2 target){
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Ошибка паузы!");
        }
        int damage = this.kritDamage();

        System.out.println(this.name + " атаковал " + target.getName() + "! И нанес - " + damage + " урона! ");
        target.takeDamage(damage);
        System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + " HP! ");

    }
    public int kritDamage () {
        if(Math.random() < 0.2) {
            System.out.println("---------------------");
            System.out.println("| Критический удар! |");
            System.out.println("---------------------");
            return getDamage() * 2;
        } else {
            return getDamage();
        }
    }

}
