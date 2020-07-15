/*java.AngryDuck
 * Author: Young Lim Ko Park (T00051136)
 */

public class AngryDuck extends WaterFowl
{
       public AngryDuck(String name, String color, boolean flying)
     {
          super(name, color);
          this.flying = flying;
     }
     
     public void makeSound()
     {
          System.out.println(name + " says I'm angry");
     }
}