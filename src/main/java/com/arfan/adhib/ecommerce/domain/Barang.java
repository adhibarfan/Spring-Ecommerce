package com.arfan.adhib.ecommerce.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 10:09:51 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.domain
 *
 */
@Entity
@Table(name = "tb_barang")
public class Barang implements Serializable{
    
    @Id
    @Column(name = "id_barang")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String idBarang;
    
    @Getter
    @Setter
    @Column(name = "nama_barang", length = 50, nullable = false)
    private String namaBarang;
    
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "jenis_barang", length = 6, nullable = false)
    private JenisBarang jenisBarang;
    
    @Getter
    @Setter
    @Column(name = "jumlah_barang", length = 5, nullable = false)
    private Integer jumlahBarang;
    
    @Getter
    @Setter
    @Column(name = "harga_barang", nullable = false)
    private BigDecimal hargaBarang;
    
    @Getter
    @Setter
    @Column(name = "gambar_barang", length = 40, nullable = false)
    private String gambarBarang;
    
   
    
    

}
