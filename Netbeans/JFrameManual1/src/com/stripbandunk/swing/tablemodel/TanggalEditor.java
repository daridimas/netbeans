/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stripbandunk.swing.tablemodel;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author dimas
 */
public class TanggalEditor extends AbstractCellEditor implements TableCellEditor, ActionListener{

    private JFormattedTextField textField;

    public TanggalEditor(JFormattedTextField textField) {
        this.textField = textField;
        this.textField.addActionListener(this);
    }

    @Override
    public boolean isCellEditable(EventObject e) {
        if (e instanceof MouseEvent) {
            MouseEvent mouseEvent = (MouseEvent) e;
            return mouseEvent.getClickCount() >= 2;
        }
        return super.isCellEditable(e); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public Object getCellEditorValue() {
        return textField.getValue();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        textField.setValue(value);
        return textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stopCellEditing();
    }
    
}
