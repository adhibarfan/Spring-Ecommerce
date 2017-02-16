package com.arfan.adhib.ecommerce.controller;

import com.arfan.adhib.ecommerce.domain.Barang;
import com.arfan.adhib.ecommerce.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 10:55:05 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.controller
 *
 */
@RestController
@RequestMapping(value = "/api")
public class BarangController {

    @Autowired
    private BarangService barangService;

    @Secured({"ROLE_ADMIN"})
    @GetMapping(value = "/barangs")
    public Page<Barang> getBarangs(Pageable pageable) {
        return barangService.getBarang(pageable);
    }
}
