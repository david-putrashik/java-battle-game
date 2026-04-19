package inheritance;

public class Warrior extends HeroA {
    private int block;
    public int getBlock() {return block;}
    public void setBlock (int newBlock) {block = newBlock;}

    public Warrior (String name, int damage, int health, int block) {super(name, damage, health);
    this.block = block;
    }
    public void shieldBlock(int damage){
        if(damage < getBlock()) {
            takeDamage(0);
        } else {
            takeDamage(damage - getBlock());
        }
    }
    /*  @Override //пишем его, чтобы заменять в хит на свой метод, пишем перед нужным методом!
    public void  takeDamage(int damage) {
        int getHealth = getHealth() - damage + getBlock();
        if (damage < getBlock()) {
            getHealth = getHealth();
            setHealth(getHealth);
            System.out.println(this.getName() + " блокировал удар и получил: " + damage + " урона!");
        } else {
            System.out.println(this.getName() + " блокировал удар и получил: " + damage + " урона!");
            setHealth(getHealth);
        }
     } */
    @Override
    public void takeDamage(int incommingDamage) {
        int finalDamage = incommingDamage - this.block;
        if(finalDamage < 0) {
            finalDamage = 0;
        }
        this.setHealth(this.getHealth() - finalDamage);
        System.out.println(this.getName() + " блокировал удар и получил: " + finalDamage + " урона!");
    }



}
