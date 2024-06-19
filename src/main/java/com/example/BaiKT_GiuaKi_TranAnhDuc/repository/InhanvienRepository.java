package com.example.BaiKT_GiuaKi_TranAnhDuc.repository;

import com.example.BaiKT_GiuaKi_TranAnhDuc.model.nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InhanvienRepository extends JpaRepository<nhanvien, Long> {
}
