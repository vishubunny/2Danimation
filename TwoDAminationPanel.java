/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodanimation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoDAminationPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH =500;
    final int PANEL_HEIGHT =500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 5;
    int x = 0;
    int y = 0;

    public TwoDAminationPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);

        enemy = new ImageIcon("enemy.png").getImage();
        backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g); // this will paint background
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage ,0,0,null);
        g2D.drawImage(enemy,x,y,null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH-enemy.getWidth(null)|| x<0){ // shows the touch left and right border
            xVelocity = xVelocity* -1;

        }
        x = x+xVelocity;
        if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y+yVelocity;

        repaint();




    }
}
