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

        System.out.println("Testing the teleport on the Bunny");
        bunny.teleBunny();
        System.out.println("Testing the location beacon inside the bunny");
        bunny.getPosition();

        AngryDuck duck = new AngryDuck("Donald", "White");

        System.out.println("Testing the Teleport method of the duck");
        duck.teleDuck();
        System.out.println("Testing the The location beacon inside the duck");
        duck.getPosition();
        System.out.println("Testing the attack method");
        duck.attack(bunny);
        duck.attack(bunny);
        duck.attack(bunny);
        duck.attack(bunny);
        bunny.teleBunny();


    }
}
