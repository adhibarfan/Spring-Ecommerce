/**
 * Author:  AdhibArfan <adhib.arfan@gmail.com>
 * Created: Feb 16, 2017
 */

INSERT INTO tb_barang (id_barang, nama_barang, jenis_barang, jumlah_barang, harga_barang, gambar_barang)
    VALUES ('b001', 'rinso', 'padat', 50, 1000, 'rinso.jpg');

INSERT INTO tb_user (username, is_active, password) 
    VALUES ('adhib',true,'$2a$06$//TbG9egZOafz4BjqGdRI.7phgFCgrue4K0tAsXBJOpobLufdpEGG');

INSERT INTO tb_user_role (user_role_id, role, username) 
    VALUES ('U001','ROLE_ADMIN','adhib');