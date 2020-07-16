/*java.Animal
 * Author: Young Lim Ko Park (T00051136)
 */

interface teleport
{

    void getPosition();
    
}


public abstract class Animal implements teleport
{
     protected String name;
     protected String primaryColor;
     protected int health;
     protected static int count = 0;
     protected int xcor=6;
     protected int ycor=4;
     
     public Animal(String name, String color)
     {
          this.name = name;
          primaryColor = color;
          health = 3;
          count ++;
     }
     
     public abstract void makeSound();
     
     public void sleep()
     {
          System.out.println(name + " is Z z z...");
     }
     
     public String getName()
     {
          return name;
     }
     
     public void setName(String newName)
     {
          name = newName;  
     }
     
     public String getColor()
     {
          return primaryColor;
     }
     
     public void setColor(String color)
     {
          primaryColor = color;  
     }
     
     public void getCount()
     {
          System.out.println("You have " + count +  " animals alive");
     }
     
     public  void hit()
     {          
          health -= 1;
          if (health == 0)
          {
               count --;
               System.out.println(name + " got hit and is gone");
          }
          else
               System.out.println(name + " got hit and now has " + health + " health left");
     }  
     
     @Override
     public String toString()
     {
          return (name + " is " + primaryColor);
     }
     
     
     
     public int getXcor()
     {
         return xcor;
     }
     
     public int getYcor()
     {
         return ycor;
     }
     
     @Override
     public void getPosition()
     {
         System.out.println("The x-coordinate is " + getXcor() + " and the y-coordinate is " + getYcor());
     }
}