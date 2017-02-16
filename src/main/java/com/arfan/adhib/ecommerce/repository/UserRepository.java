package com.arfan.adhib.ecommerce.repository;

import com.arfan.adhib.ecommerce.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 10:29:15 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.repository
 *
 */
public interface UserRepository extends PagingAndSortingRepository<User, String>{
    
    //ambil data user
    @Query("select u from User u left join fetch u.userRoles pd where u.username = :username")
    User LoginUser(@Param("username") String username);
}
