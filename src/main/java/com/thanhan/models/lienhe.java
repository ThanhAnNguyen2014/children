package com.thanhan.models;

import javax.persistence.*;

/**
 * Created by ThanhAnNguyen on 12/8/2016.
 */
@Entity
@Table(name = "lienhe")
public class lienhe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ten_kh;
    private String diachi;
    private String sdt;
    private String email;
    private boolean status;

    public lienhe() {
    }

    @Override
    public String toString() {
        return "lienhe{" +
                "id=" + id +
                ", ten_kh='" + ten_kh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen_kh() {
        return ten_kh;
    }

    public void setTen_kh(String ten_kh) {
        this.ten_kh = ten_kh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public lienhe(String ten_kh, String diachi, String sdt, String email, boolean status) {

        this.ten_kh = ten_kh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.status = status;
    }
}
