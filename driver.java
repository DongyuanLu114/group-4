/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work PC
 */
public class driver {
    public static void main (String[] args)
    {
        CuriousBunny bunny = new CuriousBunny("Bugs", "Grey");
        AngryDuck duck = new AngryDuck("Donald", "White");
        AngryDuck duck2 = new AngryDuck("Daffy", "Blue");
        LoudGoose goose = new LoudGoose("Canada", "Black");
        HappyPig pig = new HappyPig ("Wilbur", "Pink");

        
        System.out.println("Testing the Teleporting and the location methods");
        bunny.teleBunny();
        duck.teleDuck();
        duck.getPosition();
        bunny.getPosition();
        System.out.println("");

        bunny.teleBunny();
        duck.teleDuck();
        duck.getPosition();
        bunny.getPosition();
        System.out.println("");
        
        
        System.out.println("Testing the attack methods for the animals:");
        duck.attack(bunny);
        duck.attack(pig);
        duck.attack(bunny);
        duck.attack(bunny);
        duck.attack(bunny);

        System.out.println("\nTrying to attack the same team:");
        duck.attack(duck);
        goose.attack(goose);
        duck.attack(duck2);
        
        System.out.println("");
        goose.attack(duck);
        goose.attack(duck);
        goose.attack(duck);


        System.out.println("\nTrying to teleport a bunny and the duck after dying:");
        bunny.teleBunny();
        duck.teleDuck();

        System.out.println("\nTesting the killcount methods:");
        goose.getKillCount();
        duck.getKillCount();

        

        



        

       



    }
}
