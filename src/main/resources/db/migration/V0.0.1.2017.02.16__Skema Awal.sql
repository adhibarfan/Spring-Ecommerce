/**
 * Author:  AdhibArfan <adhib.arfan@gmail.com>
 * Created: Feb 16, 2017
 */

CREATE TABLE tb_barang(
    id_barang VARCHAR(36) NOT NULL PRIMARY KEY,
    nama_barang VARCHAR(50) NOT NULL,
    jenis_barang CHAR(6) NOT NULL,
    jumlah_barang INT(5) NOT NULL,
    harga_barang DECIMAL NOT NULL,
    gambar_barang VARCHAR(40) NOT NULL
)ENGINE=INNODB;

CREATE TABLE tb_user (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    is_active BIT(1) NOT NULL,
    password VARCHAR(100) NOT NULL
)ENGINE=INNODB;

CREATE TABLE tb_user_role (
    user_role_id VARCHAR(36) NOT NULL PRIMARY KEY,
    role VARCHAR(15) NOT NULL,
    username VARCHAR(50) NOT NULL,
    CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES tb_user (username)
)ENGINE=INNODB;

CREATE TABLE tb_cart(
    id_cart VARCHAR(36) NOT NULL PRIMARY KEY,
    jumlah_barang INT(5) NOT NULL,
    id_barang VARCHAR(36) NOT NULL,
    username VARCHAR(50) NOT NULL,
    CONSTRAINT fk_id_barang FOREIGN KEY (id_barang) REFERENCES tb_barang (id_barang),
    CONSTRAINT fk_cart_username FOREIGN KEY (username) REFERENCES tb_user (username)
)ENGINE=INNODB;
