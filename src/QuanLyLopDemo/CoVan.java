/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyLopDemo;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class CoVan implements Serializable{
    private String maCv,noiDung,maGv,maLop;

    public CoVan() {
    }

    public CoVan(String maCv, String noiDung, String maGv, String maLop) {
        this.maCv = maCv;
        this.noiDung = noiDung;
        this.maGv = maGv;
        this.maLop = maLop;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) throws Exception{
        if(maCv == null || maCv.isEmpty()){
            throw new Exception("Mã báo thi không được để trống!");
        }
        this.maCv = maCv;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    
    
}
