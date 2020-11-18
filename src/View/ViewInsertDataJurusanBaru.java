/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GBCController;
import Controller.JurusanController;
import Model.DateLabelFormatter;
import Model.Jurusan;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author V for Vladimir
 */
public class ViewInsertDataJurusanBaru {
    JFrame viewFrame = new JFrame("insert data jurusan baru");
    JLabel kodeLabel,namaLabel;
    JTextField kodeField,namaField;
//    JRadioButton field2,field7,field8;
//    JComboBox<Object> field3;
//    JCheckBox field4,field5;
//    ButtonGroup buttonGroup;
    JButton buttonInsert;
//    JSpinner field6;
    JPanel panelContent;
//    ,panelWithScroll
//    JScrollPane panelScroll;
//    JDatePickerImpl tglLahir;
//    JDatePanelImpl datePanel;
    GridBagLayout gbl;
    GridBagConstraints gbc;
    GBCController controller;
    
    public ViewInsertDataJurusanBaru(){
        kodeLabel = new JLabel("Kode Jurusan");
        namaLabel = new JLabel("Nama Jurusan");
//        label3 = new JLabel();
//        label4 = new JLabel();
//        label5 = new JLabel();
//        label6 = new JLabel();
//        label7 = new JLabel();
//        label8 = new JLabel();
        kodeField = new JTextField(20);
        namaField = new JTextField(20);
        buttonInsert = new JButton("Insert");
//        field2 = new JRadioButton();
//        field3 = new JComboBox<>();
//        field4 = new JCheckBox();
//        field5 = new JCheckBox();
//        field6 = new JSpinner();
//        field7 = new JRadioButton();
//        field8 = new JRadioButton();
        panelContent = new JPanel();
//        panelWithScroll = new JPanel();
//        UtilDateModel model = new UtilDateModel();
//        Properties p = new Properties();
//        p.put("text.today", "Today");
//        p.put("text.month", "Month");
//        p.put("text.year", "Year");
//        datePanel = new JDatePanelImpl(model, p);
//        tglLahir = new JDatePickerImpl(datePanel,new DateLabelFormatter());
//        buttonGroup = new ButtonGroup();
//        buttonGroup.add(field2);
//        buttonGroup.add(field7);
//        buttonGroup.add(field8);
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        controller = new GBCController();
//        panelWithScroll.setLayout(gbl);
//        panelScroll = new JScrollPane(){
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(600, 500);
//            };
//        };
//        panelScroll.setViewportView(panelWithScroll);
        
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.VERTICAL);
        panelContent.add(kodeLabel,gbc);
        controller.setGBC(gbc, 0.5, 0.5, 2, 1, GridBagConstraints.FIRST_LINE_START);
        panelContent.add(kodeField,gbc);
        controller.setGBC(gbc, 0.5, 0.5, 1, 2, GridBagConstraints.LINE_START,GridBagConstraints.VERTICAL);
        panelContent.add(namaLabel,gbc);
        controller.setGBC(gbc, 0.5, 0.5, 2, 2, GridBagConstraints.LINE_START);
        panelContent.add(namaField,gbc);
        controller.setGBC(gbc, 0.5, 0.5, 1, 3, GridBagConstraints.LINE_START);
        panelContent.add(buttonInsert,gbc);
        
        viewFrame.setContentPane(panelContent);
        viewFrame.pack();
        viewFrame.setLocationByPlatform(true);
        viewFrame.setVisible(true);
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttonInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JurusanController JC = new JurusanController();
                ArrayList<Jurusan> JL = JC.getAllJurusan();
                Jurusan j = new Jurusan();
                j.setKode(kodeField.getText());
                j.setNama(namaField.getText());
                int i = 0;
                boolean found = false;
                while(i < JL.size() && !found){
                    if(j.getKode() == JL.get(i).getKode()){
                        found = true;
                    }else{
                        i++;
                    }
                }
                System.out.println(found);
                if(found){
                    JOptionPane.showMessageDialog(null, "Kode sudah dipakai");
                }else{
                    JC.insertNewJurusan(j);
                    viewFrame.setVisible(false);
                    new ViewMainMenu();
                }
                
            }
        });
    }
}
