package com.arfan.adhib.ecommerce.service.impl;

import com.arfan.adhib.ecommerce.domain.Barang;
import com.arfan.adhib.ecommerce.repository.BarangRepository;
import com.arfan.adhib.ecommerce.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 10:52:30 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.service.impl
 *
 */
@Service
@Transactional(readOnly = true)
public class BarangServiceImpl implements BarangService{

    @Autowired
    private BarangRepository barangRepository;
    
    @Override
    public Page<Barang> getBarang(Pageable pageable) {
        return barangRepository.findAll(pageable);
    }
    
    

}
