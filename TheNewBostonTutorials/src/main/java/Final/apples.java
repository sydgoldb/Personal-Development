/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author sydneygoldberg
 */
public class apples {

    public static void main(String[] args) {
        tuna tunaObject = new tuna(10);
        // We add 10 to sum.
        for(int i=0; i<5; i++) {
            tunaObject.add();
            System.out.printf("%s", tunaObject);
        }
    }
    
}
