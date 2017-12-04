/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nico.dao;

import com.nico.model.DataPaket;
import com.nico.model.DataPenerima;
import com.nico.model.JenisLayanan;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryuuki
 */
public class DataDAO {
    public static List<DataPaket> getDataPaket(){
        List<DataPaket> paketList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("C:/Java/Latihan/dataKotadanProvinsi.txt"));
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                DataPaket kotaTujuan = new DataPaket();
                kotaTujuan.setKotaTujuan(data[0]);
                
                
                paketList.add(kotaTujuan);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paketList;
    }
    
    public static List<DataPenerima> getDataPenerima(){
        List<DataPenerima> penerimaList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("C:/Java/Latihan/dataKotadanProvinsi.txt"));
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                DataPenerima kotaDanProvinsi = new DataPenerima();
                kotaDanProvinsi.setProvinsi(data[1]);
                
                penerimaList.add(kotaDanProvinsi);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return penerimaList;
    }
    
    public static List<JenisLayanan> getTarif(){
        List<JenisLayanan> layananList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("C:/Java/Latihan/dataKotadanProvinsi.txt"));
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String[]data = line.split(",");
                
                JenisLayanan layanan = new JenisLayanan();
                layanan.setTujuan(data[0]);
                layanan.setProvinsi(data[1]);
                layanan.setReg(Double.parseDouble(data[2]));
                layanan.setOns(Double.parseDouble(data[3]));
                layanan.setTrc(Double.parseDouble(data[4]));
                layanan.setHds(Double.parseDouble(data[5]));
                layanan.setSds(Double.parseDouble(data[6]));
                
                layananList.add(layanan);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return layananList;
    }
    
    
}
