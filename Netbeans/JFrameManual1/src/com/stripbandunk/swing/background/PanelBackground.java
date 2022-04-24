/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stripbandunk.swing.background;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author dimas
 */
public class PanelBackground extends JPanel{
    
    private Image image;
    
    public PanelBackground() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/stripbandunk/swing/background/background.jpg"));
        
        image = icon.getImage();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        Graphics2D gd = (Graphics2D) g.create();
        
        gd.drawImage(image, 0, 0, null);
        
        gd.dispose();
    }
    
}
