package com.thanhan.models;

import javax.persistence.*;

/**
 * Created by ThanhAnNguyen on 12/8/2016.
 */
@Entity
@Table(name = "binhchon")
public class binhchon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private postbai id_post;
    @ManyToOne
    private video id_video;
    private Long muc_sao;

}
