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
 * @author user
 */
public class perhitunganDao {
    private DataPaket paket = new DataPaket();
    private double totalBayar=0.0;
    private double totalCost=0.0;
    private String kota;
    private double berat;
    
     List<JenisLayanan> layananList = DataDAO.getTarif();
    
    public double calculateBiaya(){
        for (JenisLayanan jenisLayanan : layananList) {
            if (paket.getKotaTujuan().equalsIgnoreCase(jenisLayanan.getTujuan())) {
                if (paket.getJenisLayanan().equalsIgnoreCase("Reg")){
                    totalCost =jenisLayanan.getReg()*paket.getBeratBarang();
                    //if (paket.getAsuransi().equalsIgnoreCase("Yes")) {
                    //    totalBayar = totalCost*paket.getHargaBarang();
                    //}
                    //else if (paket.getAsuransi().equalsIgnoreCase("No")) {
                    //    totalBayar = totalCost;
                    //}
                }
                
                else if (paket.getJenisLayanan().equalsIgnoreCase("Ons")){
                    //if (paket.getAsuransi().equalsIgnoreCase("Yes")) {
                        //totalBayar = totalCost*paket.getHargaBarang();
//                    }
//                    else if (paket.getAsuransi().equalsIgnoreCase("No")) {
                        totalBayar = jenisLayanan.getOns()*paket.getBeratBarang();
                    //}
                }
                
                else if (paket.getJenisLayanan().equalsIgnoreCase("Trc")){
//                    if (paket.getAsuransi().equalsIgnoreCase("Yes")) {
//                        totalBayar = jenisLayanan.getTrc()*paket.getBeratBarang()*paket.getHargaBarang();
//                    }
//                    else if (paket.getAsuransi().equalsIgnoreCase("No")) {
                        totalBayar = jenisLayanan.getTrc()*paket.getBeratBarang();
                    //}
                }
                
                else if (paket.getJenisLayanan().equalsIgnoreCase("Hds")){
//                    if (paket.getAsuransi().equalsIgnoreCase("Yes")) {
//                        totalBayar = jenisLayanan.getHds()*paket.getBeratBarang()*paket.getHargaBarang();
//                    }
//                    else if (paket.getAsuransi().equalsIgnoreCase("No")) {
                        totalBayar = jenisLayanan.getHds()*paket.getBeratBarang();
                    //}
                }
                
                else if (paket.getJenisLayanan().equalsIgnoreCase("Sds")){
//                    if (paket.getAsuransi().equalsIgnoreCase("Yes")) {
//                        totalBayar = jenisLayanan.getSds()*paket.getBeratBarang()*paket.getHargaBarang();
//                    }
//                    else if (paket.getAsuransi().equalsIgnoreCase("No")) {
                        totalBayar = jenisLayanan.getSds()*paket.getBeratBarang();
                    //}
                }
            }
        }
        return totalBayar;
    }
}
