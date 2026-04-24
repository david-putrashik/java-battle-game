package interfaces;

public class Mage extends Character2 implements Attack {

    public Mage (String name, int damage, int health, int maxHP) { super (name, damage, health, maxHP);}
    public void attack() {
        System.out.println("Магическая атака");
    }
    public void specialAttack (Character2 target) {
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Ошибка паузы!");
        }
        int damage = this.kritDamage();
        if (Math.random() < 0.25) {
            int MA = damage * 3;
            System.out.println("|| " + this.getName() + " использует особый навык - \"Водяной залп!\" И нанес - " + MA +
                    " урона! ||");
            target.takeDamage(MA);
            System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + " HP! ");

        } else {
            System.out.println(this.getName() + " атаковал " + target.getName() + "! И нанес - " + damage + " урона! ");
            target.takeDamage(damage);
            System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + " HP! ");
        }
    }
}
