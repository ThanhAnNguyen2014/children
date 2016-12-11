package com.thanhan.models;


import javax.persistence.*;

/**
 * Created by ThanhAnNguyen on 12/7/2016.
 */
@Entity
@Table(name = "videos")
public class video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 300)
    private String tieude;
    @Lob @Column(nullable = false)
    private String noidung;
    @Column(nullable = false)
    private String url;
    @Column(nullable = false)
    private boolean status;
    @ManyToOne
    private chude id_cd;


    public video(String tieude, String noidung, String url, boolean status, chude id_cd) {
        this.tieude = tieude;
        this.noidung = noidung;
        this.url = url;
        this.status = status;
        this.id_cd = id_cd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public chude getId_cd() {
        return id_cd;
    }

    public void setId_cd(chude id_cd) {
        this.id_cd = id_cd;
    }
}
