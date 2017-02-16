package com.arfan.adhib.ecommerce.service;

import com.arfan.adhib.ecommerce.domain.Barang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 10:50:38 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.service
 *
 */
public interface BarangService {
    
    Page<Barang> getBarang(Pageable pageable);

}
