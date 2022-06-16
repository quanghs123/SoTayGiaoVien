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
public class TBRutHocPhan implements Serializable{
    private String maTb,noiDung,maGv,maSv;

    public TBRutHocPhan() {
    }

    public TBRutHocPhan(String maTb, String noiDung, String maGv, String maSv) {
        this.maTb = maTb;
        this.noiDung = noiDung;
        this.maGv = maGv;
        this.maSv = maSv;
    }

    public String getMaTb() {
        return maTb;
    }

    public void setMaTb(String maTb) throws Exception{
        if(maTb == null || maTb.isEmpty()){
            throw new Exception("Mã thông báo không được để trống!");
        }
        this.maTb = maTb;
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
