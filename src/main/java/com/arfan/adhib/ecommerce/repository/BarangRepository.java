package com.arfan.adhib.ecommerce.repository;

import com.arfan.adhib.ecommerce.domain.Barang;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 10:34:42 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.repository
 *
 */
public interface BarangRepository extends PagingAndSortingRepository<Barang, String>{

}
