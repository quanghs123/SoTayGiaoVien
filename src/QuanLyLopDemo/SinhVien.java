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
public class SinhVien implements Serializable{
    private String maSv, tenSv,hanhKiem,maLop;
    private float diem;
    private int sdt,sdtGd;
    
    public SinhVien() {
    }

    public SinhVien(String maSv, String tenSv, String hanhKiem, String maLop, float diem, int sdt, int sdtGd) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.hanhKiem = hanhKiem;
        this.maLop = maLop;
        this.diem = diem;
        this.sdt = sdt;
        this.sdtGd = sdtGd;
    }
    
    

    public boolean ísLenLop(){
        return diem>=5;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) throws Exception{
        if(maSv == null || maSv.isEmpty()){
            throw new Exception("Mã sinh viên không được để trống!");
        }
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(String hanhKiem) {
        this.hanhKiem = hanhKiem;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getSdtGd() {
        return sdtGd;
    }

    public void setSdtGd(int sdtGd) {
        this.sdtGd = sdtGd;
    }
    
    
}
