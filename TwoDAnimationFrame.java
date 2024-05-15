/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodanimation;

import javax.swing.*;

public class TwoDAnimationFrame extends JFrame {
    TwoDAminationPanel panel;

    public TwoDAnimationFrame(){
        panel = new TwoDAminationPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }


}