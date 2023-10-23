/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author Lenovo
 */
public class DaftarPaket {
    private String tag;
    private String nama;
    private LocalDateTime tanggalDatang;
    private String pengirim;
    private String deskripsi;
    private String statusPaket;
    
    public DaftarPaket(String tag, String nama, String pengirim, String deskripsi, LocalDateTime tanggalDatang, String statusPaket){
        this.tag = tag;
        this.nama = nama;
        this.tanggalDatang = tanggalDatang;
        this.pengirim = pengirim;
        this.deskripsi = deskripsi;
        this.statusPaket= statusPaket;
    }
    public String getTag(){
        return tag;
    }
    public void setTag(String tag){
        this.tag = tag;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
    this.nama = nama;
    }
    
    public LocalDateTime getTanggalDatang(){
        return tanggalDatang;
    }
    public void setTanggalDatang(LocalDateTime tanggalDatang){
        this.tanggalDatang = tanggalDatang;
    }
    
    public String getPengirim(){
        return pengirim;
    }
    public void setPengirim(String pengirim){
        this.pengirim = pengirim;
    }
    
    public String getDeskripsi(){
        return deskripsi;
    }
    public void setDeskripsi(){
        this.deskripsi = deskripsi;
    }
    
    public String getstatusPaket(){
        return statusPaket;
    }
    public void setstatusPaket(String statusPaket){
        this.statusPaket = statusPaket;
    }
    
    @Override
    public String toString(){
        return String.format("Tag: %s, Nama: %s, TanggalKedatangan: %s, Pengirim: %s, Deskripsi Paket: %s, Status Paket: %s",
                getTag(),
                getNama(),
                getTanggalDatang(),
                getPengirim(),
                getDeskripsi(),
                getstatusPaket()
        );
    }
}


