/*java.WaterFowl
 * Group 4
 */

public abstract class WaterFowl extends Animal implements Attacker
{
     protected int killCount;
     
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
          if (this.name.compareTo(obj.getName()) != 0 && this.health != 0)
          {
               System.out.println(this.name + " attacked " + obj.getName());
               obj.hit(); 
               if (obj.health == 0)
               {
                    this.killCount++;
               }
          }
          else
          { 
               System.out.println();
          }
     }
     
     public int getKillCount()
     {
          return killCount;
     }
}