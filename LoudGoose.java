/*java.LoudGoose
 Group 4
 */

public class LoudGoose extends WaterFowl
{
     public LoudGoose(String name, String color)
     {
          super(name, color);
     }
     
     public void makeSound()
     {
          System.out.println(name + " says I'm loud");
     }
     
}