package com.arfan.adhib.ecommerce.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 10:22:16 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.domain
 *
 */
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @Column(name = "username", length = 50, nullable = false)
    private String username;


    @Column(name = "password", length = 100, nullable = false)
    private String password;


    @Column(name = "is_active", nullable = false)
    private Boolean isActive;


    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "user")
    private Set<UserRole> userRoles = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    
    
}