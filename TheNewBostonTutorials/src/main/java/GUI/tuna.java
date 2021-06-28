/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author sydneygoldberg
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
// JFrame gives you all the basic window features.
public class tuna extends JFrame {
    
    private JLabel item1;
    // JLabel is the var type.
    public tuna() {
        super("The title bar");
        // adds title
        setLayout(new FlowLayout());
        // gives us a default layout
        
        item1 = new JLabel("This is a sentence.");
        // A label is essentially text.
        item1.setToolTipText("This is gonna show up on hover.");
        add(item1);
    }
}
