/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stripbandunk.swing.jframe;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author dimas
 */
public class HobbyRendererBab910 extends DefaultListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label =  (JLabel)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
        
        if (value instanceof HobbyBab99) {
            HobbyBab99 hobby = (HobbyBab99) value;
            
            String data = hobby.getKode()+ " - " + hobby.getNama();
            
            label.setText(data);
        }
        
        return label;
    }
    
}
