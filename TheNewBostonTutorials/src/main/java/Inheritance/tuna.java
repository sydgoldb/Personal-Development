/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author sydneygoldberg
 */
public class tuna extends food {

    // subclass
    // only public methods can be inherited.
    // Inheritance enables you to have only one method you need to maintain versus many.
    // extends allows us to inherit EVERYTHING from the food class.
    // if tuna extends potpie and potpie extends food, tuna inherits everything from food and potpie.
    // below I overrid the original method located in the food class.
    public void eat() {
        System.out.println("I am new method of tuna.");
    }

}
