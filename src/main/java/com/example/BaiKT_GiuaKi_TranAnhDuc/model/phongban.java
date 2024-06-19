package com.example.BaiKT_GiuaKi_TranAnhDuc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "phongban")
public class phongban {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "MaPhong")
    private String MaPhong;
    @Column(name = "TenPhong")
    private String TenPhong ;
    @OneToMany(mappedBy = "phongban", cascade = CascadeType.ALL)
    private List<nhanvien> nhanviens;
}
