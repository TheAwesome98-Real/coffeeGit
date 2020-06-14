package gd.rf.ta98.coffeeGit;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {

  public static void main(String[] args) {

    JFrame win = new JFrame("coffeeGit");
    win.setSize(480, 720);
    win.setLocation(0,0);
    final JButton button = new JButton("Log in");
    win.getContentPane().add(BorderLayout.SOUTH, button);
    button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // login duh

        }
    });

    win.setVisible(true);

  }

}