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
public class tuna {

    private int sum;
    private final int NUMBER;
    // You can only set NUMBER once.
    // NUMBER is a constant.

    public tuna(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("sum = %d\n", sum);
        // %d specifies the single variable is a decimal integer.
    }

}
