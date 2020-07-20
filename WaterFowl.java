/*java.WaterFowl
 * Group 4
 */

public abstract class WaterFowl extends Animal implements Attacker
{
     protected int killCount = 0;
     
     public WaterFowl(String name, String color)
     {
          super(name, color);  
     }
     
     public void fly()
     {
          System.out.println(name +" is flying");
     }
     
     public void swim()
     {
          System.out.println(name + " is swimming");
     }
     
     public void attack(Animal obj)
     {
          if (this.health != 0)
          {
               if (this.getClass() == obj.getClass())
               {
                    System.out.println(this.name + " cannot attack the same team, " + obj.getName());
               }
               else if ((this.getClass() != obj.getClass()) && (obj.health != 0))
               {
                    System.out.println(this.name + " attacked " + obj.getName());
                    obj.hit(); 
                    if (obj.health == 0)
                    {
                         this.killCount++;
                         System.out.println(this.name + " earned 1 kill point");
                    }  
               }
               else
               {
                    System.out.println(this.name + " cannot attack  the dead " + obj.getName());
               }
          }
     }
     
     public void getKillCount() {
          System.out.println(name + " has " + killCount + " kill(s)");
     }
}