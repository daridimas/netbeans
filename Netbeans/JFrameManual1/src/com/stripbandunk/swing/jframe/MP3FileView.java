/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stripbandunk.swing.jframe;

import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;

/**
 *
 * @author dimas
 */
public class MP3FileView extends FileView{
    
    private ImageIcon icon;
    
    public MP3FileView() {
        icon = new ImageIcon(getClass().getResource("/com/stripbandunk/swing/jframe/audio.png"));
    }

    @Override
    public Icon getIcon(File f) {
        
        if (f.getName().endsWith(".mp3")) {
            return icon; //To change body of generated methods, choose Tools | Templates.
        } else {
            return null;
        }
        
    }
    
}
