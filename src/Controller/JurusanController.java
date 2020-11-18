/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Jurusan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author V for Vladimir
 */
public class JurusanController {
    public JurusanController(){
        
    }
    static DBHandler conn = new DBHandler();

    // SELECT ALL from table pasiens
    public static ArrayList<Jurusan> getAllJurusan() {
        ArrayList<Jurusan> jurusanList = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM Jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                
                Jurusan j = new Jurusan();
                j.setKode(rs.getString("Kode"));
                j.setNama(rs.getString("Nama"));
                jurusanList.add(j);
//                pasiens.add(pasien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (jurusanList);
    }

    // SELECT WHERE
    public static Jurusan getJurusan(String NIM) {
        conn.connect();
        String query = "SELECT * FROM Jurusan WHERE NIM='" + NIM + "'";
        Jurusan j = new Jurusan();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                j.setKode(rs.getString("Kode"));
                j.setNama(rs.getString("Nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (j);
        
    }
    
    // INSERT
    public static boolean insertNewJurusan(Jurusan j) {
        conn.connect();
        String query = "INSERT INTO Jurusan VALUES(?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, j.getKode());
            stmt.setString(2, j.getNama());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE
    public static boolean updateJurusan(String Nama,String Kode) {
        conn.connect();
        String query = "UPDATE Jurusan SET Nama='" + Nama + "', "
                + " WHERE NIK='" + Kode + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // DELETE
    public static boolean deleteJurusan(String Kode) {
        conn.connect();

        String query = "DELETE FROM Jurusan WHERE NIK='" + Kode + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
