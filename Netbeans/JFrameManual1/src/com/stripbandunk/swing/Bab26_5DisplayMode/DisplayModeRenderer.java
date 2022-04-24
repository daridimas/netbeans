/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.Bab26_5DisplayMode;

import java.awt.Component;
import java.awt.DisplayMode;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author dimas
 */
public class DisplayModeRenderer extends DefaultListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel jLabel = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
        
        if (value instanceof DisplayMode) {
            DisplayMode displayMode = (DisplayMode) value;
            jLabel.setText(displayMode.getWidth() + " X " + displayMode.getHeight() +
                    " " + displayMode.getRefreshRate() + " Hz");
        }
        
        return jLabel;
    }
}
