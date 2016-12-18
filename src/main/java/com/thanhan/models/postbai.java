package com.thanhan.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ThanhAnNguyen on 12/8/2016.
 */
@Entity
@Table(name = "postbai")
public class postbai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String tenbaiviet;
    private String url;
    private Long luocxem;
    private String image;
    @Lob @Column(nullable = false)
    private String noidung;
    private Date ngaytao;
    private boolean status;
    private boolean moi;
    @ManyToOne
    private chude id_chude;

    public postbai(String tenbaiviet, String url, Long luocxem, String image, String noidung, Date ngaytao, boolean status, boolean moi, chude id_chude) {
        this.tenbaiviet = tenbaiviet;
        this.url = url;
        this.luocxem = luocxem;
        this.image = image;
        this.noidung = noidung;
        this.ngaytao = ngaytao;
        this.status = status;
        this.moi = moi;
        this.id_chude = id_chude;
    }

    public postbai() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenbaiviet() {
        return tenbaiviet;
    }

    public void setTenbaiviet(String tenbaiviet) {
        this.tenbaiviet = tenbaiviet;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getLuocxem() {
        return luocxem;
    }

    public void setLuocxem(Long luocxem) {
        this.luocxem = luocxem;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isMoi() {
        return moi;
    }

    public void setMoi(boolean moi) {
        this.moi = moi;
    }

    public chude getId_chude() {
        return id_chude;
    }

    public void setId_chude(chude id_chude) {
        this.id_chude = id_chude;
    }
}
