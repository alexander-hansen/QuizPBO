/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author V for Vladimir
 */
public class ViewMainMenu implements ActionListener{
    JFrame FrameMainMenu = new JFrame();
    JLabel welcome;
    JButton buttonView1,buttonView2,buttonView3,buttonView4;
    JPanel panelContent;
    public ViewMainMenu(){
        welcome = new JLabel("welcome");
        buttonView1 = new JButton("INSERT DATA JURUSAN");
        buttonView2 = new JButton("LIHAT DATA SEMUA JURUSAN");
        buttonView3 = new JButton("INSERT MAHASISWA BARU");
        buttonView4 = new JButton("LIHAT DATA MAHASISWA PER JURUSAN");
        panelContent = new JPanel();
        
        welcome.setBounds(0, 10, 140, 25);
        buttonView1.setBounds(0, 50, 250, 25);
        buttonView2.setBounds(0, 90, 250, 25);
        buttonView3.setBounds(0, 130, 250, 25);
        buttonView4.setBounds(0, 170, 300, 25);
        
        panelContent.add(welcome);
        panelContent.add(buttonView1);
        panelContent.add(buttonView2);
        panelContent.add(buttonView3);
        panelContent.add(buttonView4);
        
        FrameMainMenu.setContentPane(panelContent);
        FrameMainMenu.setSize(500,500);
        FrameMainMenu.setLayout(null);
        FrameMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FrameMainMenu.setVisible(true);
        
        buttonView1.addActionListener(this);
        buttonView3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command) {
            case "INSERT DATA JURUSAN": 
                new ViewInsertDataJurusanBaru();
                FrameMainMenu.setVisible(false);
                break;
            case "LIHAT DATA SEMUA JURUSAN":
//                new MenuDokter();
                FrameMainMenu.setVisible(false);
                break;
            case "INSERT MAHASISWA BARU":
                new ViewInsertMahasiswaBaru();
                FrameMainMenu.setVisible(false);
                break;
            case "LIHAT DATA MAHASISWA PER JURUSAN":
//                new ViewLihatMahasiswaJurusan();
                FrameMainMenu.setVisible(false);
                break;
            default: 
                break;
        }
    }
}
