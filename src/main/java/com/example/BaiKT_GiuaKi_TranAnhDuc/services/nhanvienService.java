package com.example.BaiKT_GiuaKi_TranAnhDuc.services;

import com.example.BaiKT_GiuaKi_TranAnhDuc.model.nhanvien;
import com.example.BaiKT_GiuaKi_TranAnhDuc.repository.InhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class nhanvienService {

    @Autowired
    private InhanvienRepository nhanvienRepository;

    public List<nhanvien> getAllnhanvien() {
        return nhanvienRepository.findAll();
    }

    public nhanvien getnhanvienById(Long id) {
        return nhanvienRepository.findById(id).orElse(null);
    }

    public void addnhanvien(nhanvien nv) {
        nhanvienRepository.save(nv);
    }

    public void deletenhanvien(Long id) { nhanvienRepository.deleteById(id); }

    public void updatenhanvien(nhanvien nhanvien) { nhanvienRepository.save(nhanvien); }
}
