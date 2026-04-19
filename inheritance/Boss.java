package inheritance;

public class Boss extends EnemyA {
    private int bossAttack;
    public int getBossAttack(){return bossAttack;}
    public void setBossAttack(int newBossAtk) {bossAttack = newBossAtk;}
    public Boss (String name, int damage, int health, int bossAttack) {super(name, damage, health);
        this.bossAttack = bossAttack;
    }
    public void specialAttack (Character target) {
        int ult = getDamage() * 2;
        setBossAttack(ult);

        int bossdamage = this.getBossAttack();
        target.takeDamage(bossdamage);
        System.out.println(this.getName() + " использовал спец атаку, и нанес " + target.getName() + " - "+ ult +
                " урона!");
        System.out.println("У " + target.getName() + " осталось - " + target.getHealth() + " HP!");

    }
    /*вариант полегче:
    public void specialAttack (Character target {
       target.takeDamage(getDamage() * 2)
    }
    */
}
