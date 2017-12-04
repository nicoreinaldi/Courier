/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nico.dao;

import com.nico.model.DataPaket;
import com.nico.model.JenisLayanan;
import java.util.List;

/**
 *
 * @author Ryuuki
 */
public class ResiGenerator {
    public String generateResiNumber(){
        String noResi = "";
        
        int code = (int) (Math.ceil(Math.random() * 1000000000) * 1);
        noResi += code;
        return noResi;
    }
}
