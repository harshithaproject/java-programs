/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author activ
 */
public class NewApplet extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Button b1,b2,b3;
    int type=-1;
    public void init() {
       setLayout(null);
       b1=new Button("Line");
       b2=new Button("Rectangle");
       b3=new Button("Oval");
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b1.setBounds(10, 20, 100, 50);
       b2.setBounds(120, 20, 100, 50);
       b3.setBounds(230, 20, 100, 50);
       b1.setForeground(new Color(255,10,25));
       b2.setForeground(new Color(0,255,25));
       b3.setForeground(new Color(55,10,25));
       b1.setFont(new Font("Times New Roman",Font.BOLD,16));
       b2.setFont(new Font("Times New Roman",Font.BOLD,16));
       b3.setFont(new Font("Times New Roman",Font.BOLD,16));
// TODO start asynchronous download of heavy resources
add(b1);
add(b2);
add(b3);
    }
    public void actionPerFormed(ActionEvent er){
    Button ref;
    ref=(Button)er.getSource();
    if(ref==b1)
        type=1;
    else if(ref==b2)
        type=2;
    else 
        type=3;
    repaint();
}
    public void paint(Graphics g){
        g.drawString("Hello World", 90, 80);
        g.drawString("This is my first simple program in java using applets", 200, 150);
        g.drawString("This is the paint method used for drawing the graphics inside the applet", 450, 200);
        if(type==1){
           g.drawLine(100,65,90,150);
        }else if(type==2){
       g.drawRect(100,65,90,150);
        }
        else{
            g.drawOval(100, 65,90,175);
        }
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
