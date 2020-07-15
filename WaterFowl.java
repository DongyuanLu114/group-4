/*java.WaterFowl
 * Author: Young Lim Ko Park (T00051136)
 */

public abstract class WaterFowl extends Animal
{
     protected boolean flying;
     
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
     
     public boolean isFlying()
     {
          return flying;
     }
}