/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.service;

import com.dapproduction.desktop.entity.Kategori;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimas
 */
public class KategoriService {

    KategoriService() {
    }
    private final String INSERT_SQL = "insert into kategori(kode, nama, waktu_dibuat) values (?, ?, ?);";
    private final String UPDATE_SQL = "update kategori set nama = ?, waktu_diubah = ? where kode = ?;";
    private final String DELETE_SQL = "delete from kategori where kode = ?;";
    private final String SELECT_SQL = "select kode, nama, waktu_dibuat, waktu_diubah from kategori limit ?, ?";
    private final String COUNT_SQL = "select count(kode) as total from kategori";
    private final String SELECT_ONE_SQL = "select kode, nama, waktu_dibuat, waktu_diubah from kategori where kode = ?;";

    public void insert(Kategori kategori) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(INSERT_SQL)) {

            statement.setString(1, kategori.getKode());
            statement.setString(2, kategori.getNama());
            statement.setTimestamp(3, new Timestamp(kategori.getWaktuDibuat().getTime()));

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KategoriService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Kategori kategori) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(UPDATE_SQL)) {

            statement.setString(1, kategori.getNama());
            statement.setTimestamp(2, new Timestamp(kategori.getWaktuDiubah().getTime()));
            statement.setString(3, kategori.getKode());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KategoriService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Kategori kategori) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(DELETE_SQL)) {

            statement.setString(1, kategori.getKode());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KategoriService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Kategori> select(int skip, int max) {
        ArrayList<Kategori> list = new ArrayList<>(0);
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(SELECT_SQL);) {

            statement.setInt(1, skip);
            statement.setInt(2, max);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Kategori kategori = new Kategori();
                    kategori.setKode(resultSet.getString("kode"));
                    kategori.setNama(resultSet.getString("nama"));
                    kategori.setWaktuDibuat(resultSet.getTimestamp("waktu_dibuat"));
                    kategori.setWaktuDiubah(resultSet.getTimestamp("waktu_diubah"));
                    list.add(kategori);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(KategoriService.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(KategoriService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return total;
        }
    }

    public Kategori select(String kode) {
        Kategori kategori = null;
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(SELECT_ONE_SQL);) {

            statement.setString(1, kode);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    kategori = new Kategori();
                    kategori.setKode(resultSet.getString("kode"));
                    kategori.setNama(resultSet.getString("nama"));
                    kategori.setWaktuDibuat(resultSet.getTimestamp("waktu_dibuat"));
                    kategori.setWaktuDiubah(resultSet.getTimestamp("waktu_diubah"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(KategoriService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return kategori;
        }
    }
}
