/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiarsipsuratv2;

/**
 *
 * @author dimas
 */
public class UserSession {
    private static String u_uid;
    private static int id_level;

    public static String getU_uid() {
        return u_uid;
    }

    public static void setU_uid(String u_uid) {
        UserSession.u_uid = u_uid;
    }

    public static int getId_level() {
        return id_level;
    }

    public static void setId_level(int id_level) {
        UserSession.id_level = id_level;
    }
    
    
    
}
