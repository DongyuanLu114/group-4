/*java.LoudGoose
 * Author: Young Lim Ko Park (T00051136)
 */

public class LoudGoose extends WaterFowl
{
     public LoudGoose(String name, String color, boolean flying)
     {
          super(name, color);
          this.flying = flying;
     }
     
    public void makeSound()
     {
          System.out.println(name + " says I'm loud");
     }
     
}