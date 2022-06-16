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
public class Lop implements Serializable{
    private String maLop,tenlop,nganh,maGiaoVien;
    private int khoa,soSinhVien;
    public Lop() {
    }

    public Lop(String maLop, String tenlop, String nganh, int khoa, int soSinhVien,String maGiaoVien) {
        this.maLop = maLop;
        this.tenlop = tenlop;
        this.nganh = nganh;
        this.khoa = khoa;
        this.soSinhVien = soSinhVien;
        this.maGiaoVien = maGiaoVien;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) throws Exception{
        if(maLop == null || maLop.isEmpty()){
            throw new Exception("Mã lớp không được để trống!");
        }
        this.maLop = maLop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public void setSoSinhVien(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }
    
    
}
