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
    public double hargaReg(DataPaket paket) {
        List<JenisLayanan> layananList = DataDAO.getTarif();
        double berat = paket.getBeratBarang();
        String tujuan = paket.getKotaTujuan();
        String layanan = paket.getJenisLayanan();
        String insurance = paket.getAsuransi();
        double hargaBarang = paket.getHargaBarang();
        double biaya;
        double total = 0;
        double asuransi = hargaBarang * 0.03;
        for (JenisLayanan jenisLayanan : layananList) {
            if (jenisLayanan.getTujuan().equalsIgnoreCase(tujuan)) {
                if (layanan.equalsIgnoreCase("Reg")) {
                    biaya = jenisLayanan.getReg()* berat;
                    if (insurance.equalsIgnoreCase("Ya")) {
                        total = biaya + asuransi;
                    } 
                    else if (insurance.equalsIgnoreCase("No")) {
                        total = biaya;
                    }
                }

                else if (layanan.equalsIgnoreCase("Ons")) {
                    biaya = jenisLayanan.getOns()* berat;
                    if (insurance.equalsIgnoreCase("Ya")) {
                        total = biaya + asuransi;
                    }
                    else if (insurance.equalsIgnoreCase("No")) {
                        total = biaya;
                    }
                }
                
                else if (layanan.equalsIgnoreCase("Trc")) {
                    biaya = jenisLayanan.getTrc()* berat;
                    if (insurance.equalsIgnoreCase("Ya")) {
                        total = biaya + asuransi;
                    }
                    else if (insurance.equalsIgnoreCase("No")) {
                        total = biaya;
                    }
                }
                
                else if (layanan.equalsIgnoreCase("Hds")) {
                    biaya = jenisLayanan.getHds()* berat;
                    if (insurance.equalsIgnoreCase("Ya")) {
                        total = biaya + asuransi;
                    }
                    else if (insurance.equalsIgnoreCase("No")) {
                        total = biaya;
                    }
                }
                
                else if (layanan.equalsIgnoreCase("Sds")) {
                    biaya = jenisLayanan.getSds()* berat;
                    if (insurance.equalsIgnoreCase("Ya")) {
                        total = biaya + asuransi;
                    }
                    else if (insurance.equalsIgnoreCase("No")) {
                        total = biaya;
                    }
                }
            }
        }
        return total;
    }
}
