package com.tugas12.apotek.services;

import com.tugas12.apotek.models.Obat;
import com.tugas12.apotek.repositories.ObatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObatService {
    @Autowired
    private ObatRepository obatRepository;

    public List<Obat> getAllObat() {
        return obatRepository.findAll();
    }

    public void addObat(Obat obat) {
        obatRepository.save(obat);
    }

    public void deleteObatById(Integer id) {
        obatRepository.deleteById(id);
    }
}
