/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mahasiswa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author V for Vladimir
 */
public class MahasiswaController {
    public MahasiswaController(){
        
    }
    static DBHandler conn = new DBHandler();

    // SELECT ALL from table pasiens
    public static ArrayList<Mahasiswa> getAllMahasiswa() {
        ArrayList<Mahasiswa> mList = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM Mahasiswa";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                
                Mahasiswa m = new Mahasiswa();
                m.setNIM(rs.getString("NIM"));
                m.setNama(rs.getString("Nama"));
                m.setAngkatan(rs.getInt("Angkatan"));
                m.setKode_jurusan(rs.getString("Kode_jurusan"));
                mList.add(m);
//                pasiens.add(pasien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (mList);
    }

    // SELECT WHERE
    public static Mahasiswa getMahasiswa(String NIM) {
        conn.connect();
        String query = "SELECT * FROM Mahasiswa WHERE NIM='" + NIM + "'";
        Mahasiswa m = new Mahasiswa();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                m.setNIM(rs.getString("NIM"));
                m.setNama(rs.getString("Nama"));
                m.setAngkatan(rs.getInt("Angkatan"));
                m.setKode_jurusan(rs.getString("Kode_jurusan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (m);
        
    }
    
    // INSERT
    public static boolean insertNewMahasiswa(Mahasiswa m) {
        conn.connect();
        String query = "INSERT INTO Mahasiswa VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, m.getNIM());
            stmt.setString(2, m.getNama());
            stmt.setInt(3, m.getAngkatan());
            stmt.setString(4, m.getKode_jurusan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE
    public static boolean updateMahasiswa(String Nama,String Kode_jurusan,String NIM) {
        conn.connect();
        String query = "UPDATE Mahasiswa SET Nama='" + Nama + "', "
                + "Kode_jurusan='" + Kode_jurusan+ "', "
                + " WHERE NIK='" + NIM + "'";
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
    public static boolean deleteMahasiswa(String NIM) {
        conn.connect();

        String query = "DELETE FROM Mahasiswa WHERE NIK='" + NIM + "'";
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
