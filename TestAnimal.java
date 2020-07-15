/*java.TestAnimal
 * Author: Young Lim Ko Park (T00051136)
 */

public class TestAnimal
{
     public static void main(String[] args)
     {          
          // new object duck1
          AngryDuck duck1 = new AngryDuck("Quacky", "black", true);
          
          System.out.println("------------About duck--------------");
          System.out.println("// testing toString() in Animal class");
          System.out.println( duck1);
          System.out.println();
          
          duck1.setColor("yellow");
          
          System.out.println("// testing getColor() in Animal class");
          System.out.println(duck1.name + " has a new color : " + duck1.getColor());
          System.out.println();
          
          System.out.println("// testing toString() in Animal class");
          System.out.println( duck1);
          System.out.println();
          
          System.out.println("// testing makeSound() in AngryDuck class");
          duck1.makeSound();
          System.out.println();
          
          System.out.println("// testing fly() in WaterFowl class"); 
          duck1.fly();
          System.out.println();
          
          System.out.println("// testing isFlying() in WaterFowl class");
          System.out.println( duck1.name + " is flying: " + duck1.isFlying());
          System.out.println();
                    
          System.out.println("// testing hit() in Animal class");
          duck1.hit();
          System.out.println();
          
          // new object goose1
          LoudGoose goose1 = new LoudGoose(" ", "brown", false);
          
          System.out.println("------------About goose--------------");

          goose1.setName("Honky");
          
          System.out.println("// testing getName() in Animal class");
          System.out.println("Now goose has a name: " + goose1.getName());
          System.out.println();
          
          System.out.println("// testing toString() in Animal class");
          System.out.println( goose1);
          System.out.println();
          
          System.out.println("// testing makeSound() in LoudGoose class");
          goose1.makeSound();
          System.out.println();
          
          System.out.println("// testing swim() in WaterFowl class");
          goose1.swim(); 
          System.out.println();
          
          System.out.println("// testing isFlying() in WaterFowl class");
          System.out.println( goose1.name + " is flying: " + goose1.isFlying());
          System.out.println();
          
          System.out.println("//testing hit() in Animal class 1 time");
          goose1.hit();
          System.out.println();
          
          System.out.println("// testing hit() in Animal class two times");
          goose1.hit();
          goose1.hit();
          System.out.println();
          
          System.out.println("// testing getCount() in Animal class");
          goose1.getCount();
          System.out.println();
          
          // new object bunny1
          CuriousBunny bunny1 = new CuriousBunny("Hoppy", "brown");
          
          System.out.println("------------About bunny--------------");

          bunny1.setColor("white");
          
          System.out.println("// testing toString() in Animal class");
          System.out.println( bunny1);
          System.out.println();
          
          System.out.println("// testing makeSound() in CuriousBunny class");
          bunny1.makeSound();
          System.out.println();
          
          System.out.println("// testing hop() in CuriousBunny class");
          bunny1.hop();
          System.out.println();
          
          System.out.println("// testing hit() in Animal class");
          bunny1.hit();
          System.out.println();
          
          System.out.println("// testing sleep() in Animal class");
          bunny1.sleep();
          System.out.println();
          
          System.out.println("// testing getCount() in Animal class");
          bunny1.getCount();
          System.out.println();
          
          // new object pig1
          HappyPig pig1 = new HappyPig("Oinky", "pink");
          
          System.out.println("------------About pig--------------");
          System.out.println("// testing toString() in Animal class");
          System.out.println( pig1);
          System.out.println();
          
          System.out.println("// testing makeSound() in HappyPig class");
          pig1.makeSound();
          System.out.println();
          
          System.out.println("// testing hit() in Animal class");
          pig1.roll();
          System.out.println();
          
          System.out.println("// testing sleep() in Animal class");
          pig1.sleep();
          System.out.println();
          
          System.out.println("// testing getCount() in Animal class");
          pig1.getCount();
          System.out.println();
          
          System.out.println("// testing hit() in Animal class 3 times");
          pig1.hit();
          pig1.hit();
          pig1.hit();
          System.out.println();
          
          System.out.println("// testing getCount() in Animal class");
          pig1.getCount();        
     }
}