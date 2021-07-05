/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

/**
 *
 * @author sydneygoldberg
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

// extending to JFrame, lets us use a program window.
public class tuna extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public tuna() {
        super("The title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);
        // default value of 20 above.
        // They can't change item3.

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        // We want the text fields to "listen"/wait for an event to happen. When that happens I want you to execute certain code.
        thehandler handler = new thehandler();
        // builds actionListener object
        // actionListener takes in an object because "actionPerformed" like "thehandler" can have more than one event.
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    // We are going to build our new class inside this class; it inherits the tuna class.
    private class thehandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String string = "";

            if (e.getSource() == item1) // if they clicked enter on field named item1, then do this:
            {
                string = String.format("field 1: %s", e.getActionCommand());
            } // getActionCommand means get the text from that location.
            else if (e.getSource() == item2) {
                string = String.format("field 2: %s", e.getActionCommand());
            } else if (e.getSource() == item3) {
                string = String.format("field 3: %s", e.getActionCommand());
            } else if (e.getSource() == passwordField) {
                string = String.format("password field is: %s", e.getActionCommand());

                JOptionPane.showMessageDialog(null, string);
            }
        }
    }
}
