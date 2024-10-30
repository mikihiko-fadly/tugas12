package com.tugas12.apotek.models;
import jakarta.persistence.*;

@Entity
public class Obat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String namaObat;
    private Long price;
    private String description;

   
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNamaObat() { return namaObat; }
    public void setNamaObat(String namaObat) { this.namaObat = namaObat; }
    public Long getPrice() { return price; }
    public void setPrice(Long price) { this.price = price; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
