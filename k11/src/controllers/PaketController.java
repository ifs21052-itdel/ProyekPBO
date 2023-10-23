package controllers;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import models.DaftarPaket;
import models.User;
import utils.DatabaseUtil;
        

public class PaketController {
    private DatabaseUtil koneksi;
    private ResultSet rs;
    private PreparedStatement pre;
    
    public PaketController(){
        koneksi = new DatabaseUtil();
    }
    
    public DaftarPaket getById(int tag){
        ArrayList<String> data = new ArrayList<String>();
        data.add(String.valueOf(tag));
        DaftarPaket paket = null;
        
        rs = koneksi.executeSelect("SELECT * FROM paket WHERE Tag = ?", data);
        if(rs != null){
            try{
                while(rs.next()){
                    Timestamp timestamp = rs.getTimestamp(3);
                    paket = new DaftarPaket(
                                rs.getString(1),
                                rs.getString(2),
                                rs.getString(4),
                                rs.getString(5),
                                timestamp.toLocalDateTime(),
                                rs.getString(6)
                    );
                    break;
                }
            } catch(Exception ex){
            
            }
        }
        return paket;
    }
    
    public ArrayList<DaftarPaket> getAll(){
        ArrayList<DaftarPaket> result = new ArrayList<DaftarPaket>();
        rs = koneksi.executeSelect("Select * FROM paket");
        if (rs != null){
            try {
                while (rs.next()){
                    DaftarPaket dp = new DaftarPaket(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getTimestamp(3).toLocalDateTime(),
                    rs.getString(6));
                    result.add(dp);
                    
                }
            }
            catch (Exception ex){
                
            }
        }return result;
    }
    public boolean insert(DaftarPaket dp){
        ArrayList<String> data = new ArrayList<String>();
        data.add(dp.getTag());
        data.add(dp.getNama());
        data.add(dp.toString());
        data.add(dp.getPengirim());
        data.add(dp.getDeskripsi());
        data.add(dp.getstatusPaket());
        
        String query = "INSERT INTO paket(Tag, `Nama`, `Pengirim`, `Deskripsi`, `Status Paket`)VALUES(\""
                  + dp.getTag() + "\",\""
                  + dp.getNama() + "\",\""
                  + dp.getPengirim() + "\",\""
                  + dp.getDeskripsi() + "\",\""
                  + dp.getstatusPaket()
                  + "\")";
        
        if(koneksi.execute(query)){
            return true;
        } else {
            return false;
        }
    }
//    public ArrayList<DaftarPaket> getAll() {
//        ArrayList<DaftarPaket> result = new ArrayList<DaftarPaket>();
//        rs = koneksi.executeSelect("SELECT * FROM paket");
//        if (rs != null) {
//            try {
//                while (rs.next()) {
//                    DaftarPaket paket = new DaftarPaket(
//                            rs.getString(1),
//                            rs.getString(2),
//                            rs.getString(3),
//                            rs.getString(4),
//                            rs.getTimestamp(5).toLocalDateTime(),
//                            rs.getString(6));
//                    result.add(paket);
//                }
//
//            } catch (Exception e) {
//
//            }
//        }
//        return result;
//    }
    public boolean delete(String Tag){
        ArrayList<String> data = new ArrayList<String>();
        data.add(Tag);
        if(koneksi.execute("Delete from paket WHERE Tag= ?",data)){
            return true;     
        }else{
            return false;
        }
}
    
    public boolean update (DaftarPaket p){
        ArrayList<String> data = new ArrayList<String>();
        data.add(p.getNama());
        data.add(p.getPengirim());
        data.add(p.getDeskripsi());
        data.add(p.getstatusPaket());
        data.add(p.getTag());
        if(koneksi.execute("UPDATE paket SET Nama = ?, Pengirim = ?, Deskripsi = ?, `Status Paket` = ? WHERE Tag = ?",data)){
            return true;
        }else{
            return false;
        }
    }

}
