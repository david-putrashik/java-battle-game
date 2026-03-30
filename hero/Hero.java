package hero;

public class Hero {
    String name = "David";
    int health = 100;
    int damage = 15;

       void attack (Hero enemy) {
           enemy.health -= damage;

           System.out.println(name + " атакует " + enemy.name + "! Осталось HP: " + enemy.health);
       }
       boolean isAlive() {
           return health > 0;
       }
       void printStats () {
           System.out.println("Имя: " + name + " | HP: " + health + " | Урон: " + damage);
       }
}
