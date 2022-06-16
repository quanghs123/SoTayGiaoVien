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
public class BaoThi implements Serializable{
    private String maBt,noiDung,maGv,maSv;

    public BaoThi() {
    }

    public BaoThi(String maBt, String noiDung, String maGv, String maSv) {
        this.maBt = maBt;
        this.noiDung = noiDung;
        this.maGv = maGv;
        this.maSv = maSv;
    }

    public String getMaBt() {
        return maBt;
    }

    public void setMaBt(String maBt) throws Exception{
        if(maBt == null || maBt.isEmpty()){
            throw new Exception("Mã báo thi không được để trống!");
        }
        this.maBt = maBt;
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

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    
    
}
