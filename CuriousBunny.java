/*java.CuriousBunny
 * Author: Young Lim Ko Park (T00051136)
 */

public class CuriousBunny extends Animal
{
     public CuriousBunny(String name, String color)
     {
          super(name, color);
     }
     
    public void hop()
    {
         System.out.println(name + " is hopping");
    }
    
     public void makeSound()
     {
          System.out.println(name + " says I'am curious ");
     }
}