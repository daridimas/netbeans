/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.service;

import com.dapproduction.desktop.entity.Pengguna;
import java.sql.Date;
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
public class PenggunaService {

    PenggunaService() {
    }
    private final String INSERT_SQL = "insert into pengguna(kode, nama, sandi, tanggal_lahir, telepon, alamat, waktu_dibuat) values (?, ?, password(?), ?, ?, ?, ?);";
    private final String UPDATE_SQL = "update pengguna set nama = ?, sandi=password(?), tanggal_lahir=?, telepon=?, alamat=?, waktu_diubah = ? where kode = ?;";
    private final String DELETE_SQL = "delete from pengguna where kode = ?;";
    private final String SELECT_SQL = "select kode, nama, sandi, tanggal_lahir, telepon, alamat, waktu_dibuat, waktu_diubah from pengguna limit ?, ?";
    private final String COUNT_SQL = "select count(kode) as total from pengguna";
    private final String SELECT_ONE_SQL = "select kode, nama, sandi, tanggal_lahir, telepon, alamat, waktu_dibuat, waktu_diubah from pengguna where kode = ?;";
    private final String SELECT_ONE_LOGIN_SQL = "select kode, nama, sandi, tanggal_lahir, telepon, alamat, waktu_dibuat, waktu_diubah from pengguna where kode = ? and sandi = password(?);";

    public void insert(Pengguna pengguna) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(INSERT_SQL)) {

            statement.setString(1, pengguna.getKode());
            statement.setString(2, pengguna.getNama());
            statement.setString(3, pengguna.getSandi());
            statement.setDate(4, new Date(pengguna.getTanggalLahir().getTime()));
            statement.setString(5, pengguna.getTelepon());
            statement.setString(6, pengguna.getAlamat());
            statement.setTimestamp(7, new Timestamp(pengguna.getWaktuDibuat().getTime()));

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PenggunaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Pengguna pengguna) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(UPDATE_SQL)) {

            statement.setString(1, pengguna.getNama());
            statement.setString(2, pengguna.getSandi());
            statement.setDate(3, new Date(pengguna.getTanggalLahir().getTime()));
            statement.setString(4, pengguna.getTelepon());
            statement.setString(5, pengguna.getAlamat());
            statement.setTimestamp(6, new Timestamp(pengguna.getWaktuDiubah().getTime()));
            statement.setString(7, pengguna.getKode());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PenggunaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Pengguna pengguna) {
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(DELETE_SQL)) {

            statement.setString(1, pengguna.getKode());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PenggunaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Pengguna> select(int skip, int max) {
        ArrayList<Pengguna> list = new ArrayList<>(max);
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(SELECT_SQL);) {

            statement.setInt(1, skip);
            statement.setInt(2, max);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Pengguna pengguna = new Pengguna();
                    pengguna.setKode(resultSet.getString("kode"));
                    pengguna.setNama(resultSet.getString("nama"));
                    pengguna.setSandi(resultSet.getString("sandi"));
                    pengguna.setTanggalLahir(resultSet.getDate("tanggal_lahir"));
                    pengguna.setTelepon(resultSet.getString("telepon"));
                    pengguna.setAlamat(resultSet.getString("alamat"));
                    pengguna.setWaktuDibuat(resultSet.getTimestamp("waktu_dibuat"));
                    pengguna.setWaktuDiubah(resultSet.getTimestamp("waktu_diubah"));
                    list.add(pengguna);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PenggunaService.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PenggunaService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return total;
        }
    }

    public Pengguna select(String kode) {
        Pengguna pengguna = null;
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(SELECT_ONE_SQL);) {

            statement.setString(1, kode);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    pengguna = new Pengguna();
                    pengguna.setKode(resultSet.getString("kode"));
                    pengguna.setNama(resultSet.getString("nama"));
                    pengguna.setSandi(resultSet.getString("sandi"));
                    pengguna.setTanggalLahir(resultSet.getDate("tanggal_lahir"));
                    pengguna.setTelepon(resultSet.getString("telepon"));
                    pengguna.setAlamat(resultSet.getString("alamat"));
                    pengguna.setWaktuDibuat(resultSet.getTimestamp("waktu_dibuat"));
                    pengguna.setWaktuDiubah(resultSet.getTimestamp("waktu_diubah"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PenggunaService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return pengguna;
        }
    }

    public Pengguna login(String kode, String sandi) {
        Pengguna pengguna = null;
        try (PreparedStatement statement = DatabaseHelper.getConnection().prepareStatement(SELECT_ONE_LOGIN_SQL);) {

            statement.setString(1, kode);
            statement.setString(2, sandi);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    pengguna = new Pengguna();
                    pengguna.setKode(resultSet.getString("kode"));
                    pengguna.setNama(resultSet.getString("nama"));
                    pengguna.setSandi(resultSet.getString("sandi"));
                    pengguna.setTanggalLahir(resultSet.getDate("tanggal_lahir"));
                    pengguna.setTelepon(resultSet.getString("telepon"));
                    pengguna.setAlamat(resultSet.getString("alamat"));
                    pengguna.setWaktuDibuat(resultSet.getTimestamp("waktu_dibuat"));
                    pengguna.setWaktuDiubah(resultSet.getTimestamp("waktu_diubah"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PenggunaService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return pengguna;
        }
    }
}
