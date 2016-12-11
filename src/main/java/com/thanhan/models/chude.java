package com.thanhan.models;

import javax.persistence.*;

/**
 * Created by ThanhAnNguyen on 12/7/2016.
 */
@Entity
@Table(name = "chude")
public class chude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 300)
    private String tenchude;

    public chude(String tenchude, String url, boolean status) {
        this.tenchude = tenchude;
        this.url = url;
        this.status = status;
    }

    private String url;
    private boolean status;

    @Override
    public String toString() {
        return "chude{" +
                "id=" + id +
                ", tenchude='" + tenchude + '\'' +
                ", url='" + url + '\'' +
                ", status=" + status +
                '}';
    }

    public chude() {
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenchude() {
        return tenchude;
    }

    public void setTenchude(String tenchude) {
        this.tenchude = tenchude;
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
}
