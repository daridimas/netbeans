/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stripbandunk.swing.java2d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author dimas
 */
public class PanelKotak extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        Graphics2D gd = (Graphics2D) g.create();
        
        Ellipse2D.Double lingkaran = new Ellipse2D.Double(0, 0, 200, 200);
        
        Rectangle2D.Double kotak = new Rectangle2D.Double(100, 100, 200, 200);
        
        
        gd.setColor(Color.YELLOW);
        gd.fill(lingkaran);
        
        gd.setColor(Color.red);
        gd.fill(kotak);
        
        gd.dispose();
    }
    
}
