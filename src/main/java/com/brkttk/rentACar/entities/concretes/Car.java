package com.brkttk.rentACar.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "otomobil_fiyatlari")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "marka")
    private String marka;

    @Column(name = "model")
    private String model;

    @Column(name = "donanim")
    private String donanim;

    @Column(name = "motor")
    private String motor;

    @Column(name = "yakit")
    private String yakit;

    @Column(name = "vites")
    private String vites;

    @Column(name = "fiyat")
    private int fiyat;

    @Column(name = "websitesi")
    private String websitesi;

}
