/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.JurusanController;
import Model.Jurusan;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author V for Vladimir
 */
public class ViewInsertMahasiswaBaru {
    JFrame frame = new JFrame("Insert Mahasiswa Baru");
    JLabel NIMLabel,NamaLabel,AngkatanLabel,KodeJurusanLabel;
    JTextField NIMField,NamaField,AngkatanField;
    JComboBox KodeJurusanField;
    JButton buttonInsert;
    public ViewInsertMahasiswaBaru(){
        NIMLabel = new JLabel("NIM");
        NamaLabel = new JLabel("Nama");
        AngkatanLabel = new JLabel("angkatan");
        KodeJurusanLabel = new JLabel("kode Jurusan");
        NIMField = new JTextField();
        NamaField = new JTextField();
        AngkatanField = new JTextField();
        JurusanController JC = new JurusanController();
        ArrayList<Jurusan> JL = JC.getAllJurusan();
        KodeJurusanField = new JComboBox(new DefaultComboBoxModel(JL.toArray()));
        buttonInsert = new JButton("insert");
        
        NIMLabel.setBounds(10, 10, 120, 25);
        NamaLabel.setBounds(10, 50, 120, 25);
        AngkatanLabel.setBounds(10, 90, 120, 25);
        KodeJurusanLabel.setBounds(10, 130, 120, 25);
        NIMField.setBounds(140, 10, 120, 25);
        NamaField.setBounds(140, 50, 120, 25);
        AngkatanField.setBounds(140, 90, 120, 25);
        KodeJurusanField.setBounds(10, 170, 200, 25);
        buttonInsert.setBounds(10, 400, 120, 25);
        
        frame.add(NIMLabel);
        frame.add(NamaLabel);
        frame.add(AngkatanLabel);
        frame.add(KodeJurusanLabel);
        frame.add(NIMField);
        frame.add(NamaField);
        frame.add(AngkatanField);
        frame.add(KodeJurusanField);
        frame.add(buttonInsert);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
