package interfaces;

public class Vampire extends Character2 implements Attack {
    public Vampire(String name, int damage, int health, int maxHP) {super(name, damage, health, maxHP);}
    public void attack () {
        System.out.println("Атака!");
    }
    public void vampirism (Character2 target) {
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Ошибка паузы!");
        }
        int damage = kritDamage();
        int heal = damage / 2;
        if (Math.random() < 0.25) {
            if (this.getHealth() + heal > this.getMaxHP()) {
                int d = this.getMaxHP() - this.getHealth();
                this.setHealth(this.getMaxHP());

                target.takeDamage(damage);
                System.out.println(this.getName() + " атаковал " + target.getName() + " и нанес - " + damage +
                        " урона! \n|| А также по средствам вампиризма, востановил себе - " + d + " HP! ||");
                System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + "HP!");
            } else {
                this.setHealth(this.getHealth() + heal);
                target.takeDamage(damage);
                System.out.println(this.getName() + " атаковал " + target.getName() + " и нанес - " + damage +
                        " урона! \n|| А также по средствам вампиризма, востановил себе - " + heal + " HP! ||");
                System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + "HP!");
            }
        } else {
            System.out.println(this.getName() + " атаковал " + target.getName() + " и нанес - " + damage + " урона!");
            target.takeDamage(damage);
            System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + "HP!");
        }

    }
}
