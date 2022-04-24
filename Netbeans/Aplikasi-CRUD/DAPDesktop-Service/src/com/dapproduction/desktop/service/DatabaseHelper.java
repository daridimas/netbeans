/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.service;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimas
 */
public class DatabaseHelper {

    private static Connection connection;
    private static KategoriService kategoriService;
    private static BarangService barangService;
    private static PenggunaService penggunaService;

    public static KategoriService getKategoriService() {
        if (kategoriService == null) {
            kategoriService = new KategoriService();
        }
        return kategoriService;
    }

    public static BarangService getBarangService() {
        if (barangService == null) {
            barangService = new BarangService();
        }
        return barangService;
    }

    public static PenggunaService getPenggunaService() {
        if (penggunaService == null) {
            penggunaService = new PenggunaService();
        }
        return penggunaService;
    }

    static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = new Properties();
                properties.load(DatabaseHelper.class.getResourceAsStream("/com/dapproduction/desktop/service/database.properties"));

                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setUser(properties.getProperty("username"));
                dataSource.setPassword(properties.getProperty("password"));
                dataSource.setServerName(properties.getProperty("host"));
                dataSource.setPort(Integer.valueOf(properties.getProperty("port")));
                dataSource.setDatabaseName(properties.getProperty("database"));

                connection = dataSource.getConnection();
            } catch (SQLException | IOException ex) {
                Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
