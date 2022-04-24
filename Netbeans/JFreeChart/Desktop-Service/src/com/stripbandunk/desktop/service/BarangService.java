/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.desktop.service;

/**
 *
 * @author dimas
 */
public class BarangService {
    BarangService() {
    }
    private final String INSERT_SQL = "insert into barang(kode, nama, harga, stok, kategori, waktu_dibuat) values (?, ?, ?, ?, ?, ?);";
    private final String UPDATE_SQL = "update barang set nama = ?, harga = ?, stok = ?, kategori = ?, waktu_diubah = ? where kode = ?;";
    private final String DELETE_SQL = "delete from barang where kode = ?;";
    private final String SELECT_SQL = "select kode, nama, harga, stok, kategori, waktu_dibuat, waktu_diubah from barang limit ?, ?";
    private final String COUNT_SQL = "select count(kode) as total from barang";
    private final String SELECT_ONE_SQL = "select kode, nama, harga, stok, kategori, waktu_dibuat, waktu_diubah from barang where kode = ?;";

    public void insert(Barang barang) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(INSERT_SQL)) {

            statement.setString(1, barang.getKode());
            statement.setString(2, barang.getNama());
            statement.setLong(3, barang.getHarga());
            statement.setInt(4, barang.getStok());
            statement.setString(5, barang.getKategori().getKode());
            statement.setTimestamp(6, new Timestamp(barang.getWaktuDibuat().getTime()));

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BarangService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Barang barang) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(UPDATE_SQL)) {

            statement.setString(1, barang.getNama());
            statement.setLong(2, barang.getHarga());
            statement.setInt(3, barang.getStok());
            statement.setString(4, barang.getKategori().getKode());
            statement.setTimestamp(5, new Timestamp(barang.getWaktuDiubah().getTime()));
            statement.setString(6, barang.getKode());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BarangService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Barang barang) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(DELETE_SQL)) {

            statement.setString(1, barang.getKode());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BarangService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Barang> select(int skip, int max) {
        ArrayList<Barang> list = new ArrayList<>(max);
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(SELECT_SQL);) {

            statement.setInt(1, skip);
            statement.setInt(2, max);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Barang barang = new Barang();
                    barang.setKode(resultSet.getString("kode"));
                    barang.setNama(resultSet.getString("nama"));
                    barang.setHarga(resultSet.getLong("harga"));
                    barang.setStok(resultSet.getInt("stok"));

                    String kodeKategori = resultSet.getString("kategori");
                    Kategori kategori = DatabaseHelper.getKategoriService().select(kodeKategori);
                    barang.setKategori(kategori);

                    barang.setWaktuDibuat(resultSet.getTimestamp("waktu_dibuat"));
                    barang.setWaktuDiubah(resultSet.getTimestamp("waktu_diubah"));
                    list.add(barang);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(BarangService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return list;
        }
    }

    public Long count() {
        Long total = 0L;
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(COUNT_SQL);
                ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                total = resultSet.getLong("total");
            }

        } catch (SQLException ex) {
            Logger.getLogger(BarangService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return total;
        }
    }

    public Barang select(String kode) {
        Barang barang = null;
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(SELECT_ONE_SQL);) {

            statement.setString(1, kode);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    barang = new Barang();
                    barang.setKode(resultSet.getString("kode"));
                    barang.setNama(resultSet.getString("nama"));
                    barang.setHarga(resultSet.getLong("harga"));
                    barang.setStok(resultSet.getInt("stok"));

                    String kodeKategori = resultSet.getString("kategori");
                    Kategori kategori = DatabaseHelper.getKategoriService().select(kodeKategori);
                    barang.setKategori(kategori);

                    barang.setWaktuDibuat(resultSet.getTimestamp("waktu_dibuat"));
                    barang.setWaktuDiubah(resultSet.getTimestamp("waktu_diubah"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(KategoriService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return barang;
        }
    }
}
