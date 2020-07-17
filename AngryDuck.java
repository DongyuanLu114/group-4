/*java.AngryDuck
 * Group 4
 */

public class AngryDuck extends WaterFowl
{
       public AngryDuck(String name, String color)
     {
          super(name, color);
          
     }
     
     public void makeSound()
     {
          System.out.println(name + " says I'm angry");
     }
}