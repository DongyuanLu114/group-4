/*java.HappyPig
 * Author: Young Lim Ko Park (T00051136)
 */

public class HappyPig extends Animal
{
     public HappyPig(String name, String color)
     {
          super(name, color);
     }
     
     public void roll()
     {
          System.out.println(name + " is rolling");
     }
     
     public void makeSound()
     {
          System.out.println(name + " says I'm happy");
     }
     
}