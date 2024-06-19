package com.example.BaiKT_GiuaKi_TranAnhDuc.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "nhanvien")
public class nhanvien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "MaNV")
    private String MaNV;
    @Column(name = "TenNV")
    private String TenNV ;
    @Column(name = "Phai")
    private String Phai ;
    @Column(name = "NoiSinh")
    private String NoiSinh ;
    @Column(name = "Luong")
    private int Luong ;
    @ManyToOne
    @JoinColumn(name = "phongban_id")
    private phongban phongban;
}
