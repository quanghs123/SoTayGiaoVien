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
public class GiaoVien implements Serializable{
    private String maGv, tenGv,gioiTinh,bacHoc,taiKhoan,matKhau;

    public GiaoVien() {
    }

    public GiaoVien(String maGv, String tenGv, String gioiTinh, String bacHoc, String taiKhoan, String matKhau) {
        this.maGv = maGv;
        this.tenGv = tenGv;
        this.gioiTinh = gioiTinh;
        this.bacHoc = bacHoc;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getTenGv() {
        return tenGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getBacHoc() {
        return bacHoc;
    }

    public void setBacHoc(String bacHoc) {
        this.bacHoc = bacHoc;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
}
