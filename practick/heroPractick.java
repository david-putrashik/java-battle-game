package practick;

public class heroPractick {
                                                             //private - закрывает данные приватными
       private String name = "Max";
       private int health = 170;
       private int damage = 20;
       private int armor = 5;
       private Weapon weapon;

       public String getName () {return name;}              //объявляем метод
       public int getHealth () {return health;}
       public int getArmor() {return armor;}
       public Weapon getWeapon (){return weapon;}
       public int getDamage () {
              if (this.weapon == null){
                     return this.damage; //оружия нет, бьем только своими руками
              } else {
              return this.damage + this.weapon.getDamageW(); //складываем силы
              }
       }
       public void setName(String newName) {name = newName;} //меняем значения.
       public void setHealth(int newHealth) {
              if (newHealth < 0) {
              this.health = 0;
              } else {
              this.health = newHealth;
              }
       }
       public void setDamage(int newDamage) {damage = newDamage;}
       public void setArmor(int newArmor) {armor = newArmor;}
       public void takeDamage(int incomingDamage) {
              //вычесляем броню из урона
              int finalDamage = incomingDamage - this.armor;
              // Если броня слишком крутая, урон может стать отрицательным (лечение).
              // Не даем этому случиться: минимум 1 единица урона всегда должна проходить.
              if (finalDamage < 1) {
                     finalDamage = 1;
              }
              this.setHealth(this.getHealth() - finalDamage);
              System.out.println(this.name + " поглотил часть урона броней! Чистый урон: " + finalDamage);
       }

public heroPractick (String name, int damage, int health, int armor) { //конструктор
       this.name = name;
       this.damage = damage;
       this.health = health;
       this.weapon = null;
       this.armor = armor;
       }
public void setWeapon (Weapon weapon) {
       this.weapon = weapon;

}
public void hit(heroPractick target) {     // метод для удара
       try{                                // попытайся, система против ошибок
              Thread.sleep(1900);    //делаем паузу на 1.9 сек
       } catch (InterruptedException e){   // catch - ловим ошибки
              System.out.println("Ошибка паузы!");
       }

       int damage = this.getDamage();      // получаем значение
       if(Math.random() < 0.15) {          // добавили рандом
              damage = damage * 2;         // умножаем на 2 урон в случае крита

              target.takeDamage(damage);  //меняем хп у цели
              System.out.println(this.name + " атаковал " + target.getName() + " и нанес " + damage + " урона! ");
              System.out.println("_____________________\n| КРИТИЧЕСКИЙ УДАР! |\n_____________________");
              System.out.println("У " + target.getName() + " осталось: " + target.getHealth() + " HP! ");
       } else {
       target.takeDamage(damage);  //меняем хп у цели
       System.out.println(this.name + " атаковал " + target.getName() + " и нанес " + damage + " урона! ");
       System.out.println("У " + target.getName() + " осталось: " + target.getHealth() + " HP! ");}
}
}