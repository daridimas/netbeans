/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.component;

import java.util.EventListener;

/**
 *
 * @author dimas
 */
public interface CRUDListener extends EventListener {
    
    void onInsert(CRUDEvent event);
    
    void onUpdate(CRUDEvent event);
    
    void onDelete(CRUDEvent event);
    
    void onReload(CRUDEvent event);
    
    
}
