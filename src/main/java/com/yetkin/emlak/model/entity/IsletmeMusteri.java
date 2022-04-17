package com.yetkin.emlak.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "isletme_musteri",uniqueConstraints = @UniqueConstraint(name = DbConstant.ISLETME_MUSTERI_UNIQUE, columnNames = {"isletme_id", "musteri_id"}))
public class IsletmeMusteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "isletme_id", nullable = false)
    private Isletme isletme;

    @ManyToOne
    @JoinColumn(name = "musteri_id", nullable = false)
    private Musteri musteri;
}
