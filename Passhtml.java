/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author activ
 */
public class Passhtml extends Applet {
int x,y,w,h;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        x=Integer.parseInt(getParameter(" xValue"));
        y=Integer.parseInt(getParameter(" yValue"));
        w=Integer.parseInt(getParameter(" wValue"));
        h=Integer.parseInt(getParameter(" wValue"));    
        // TODO start asynchronous download of heavy resources
    }
 public void paint(Graphics g)
 {
     g.drawRect(x, y, w, h);
 }
    // TODO overwrite start(), stop() and destroy() methods
}
