package com.tugas12.apotek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tugas12.apotek.models.Obat;
public interface ObatRepository extends JpaRepository<Obat, Integer> {
}