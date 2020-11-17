/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GBCController;
import Model.DateLabelFormatter;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class View1 {
    JFrame viewFrame = new JFrame();
    JLabel label1,label2,label3,label4,label5,label6,label7,label8;
    JTextField field1;
    JRadioButton field2,field7,field8;
    JComboBox<Object> field3;
    JCheckBox field4,field5;
    ButtonGroup buttonGroup;
    JButton button1;
    JSpinner field6;
    JPanel panelContent,panelWithScroll;
    JScrollPane panelScroll;
    JDatePickerImpl tglLahir;
    JDatePanelImpl datePanel;
    GridBagLayout gbl;
    GridBagConstraints gbc;
    GBCController controller;
    
    public View1(){
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        field1 = new JTextField();
        field2 = new JRadioButton();
        field3 = new JComboBox<>();
        field4 = new JCheckBox();
        field5 = new JCheckBox();
        field6 = new JSpinner();
        field7 = new JRadioButton();
        field8 = new JRadioButton();
        panelContent = new JPanel();
        panelWithScroll = new JPanel();
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datePanel = new JDatePanelImpl(model, p);
        tglLahir = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        buttonGroup = new ButtonGroup();
        buttonGroup.add(field2);
        buttonGroup.add(field7);
        buttonGroup.add(field8);
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        controller = new GBCController();
        panelWithScroll.setLayout(gbl);
        panelScroll = new JScrollPane(){
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(600, 500);
            };
        };
        panelScroll.setViewportView(panelWithScroll);
        
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label1);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label2);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label3);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label4);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label5);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label6);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label7);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(label8);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field1);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field2);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field3);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field4);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field5);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field6);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field7);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        panelWithScroll.add(field8);
        controller.setGBC(gbc, 0.5, 0.5, 1, 1, GridBagConstraints.FIRST_LINE_START,GridBagConstraints.HORIZONTAL);
        
        panelContent.add(panelScroll,gbc);
        
        viewFrame.setContentPane(panelContent);
        viewFrame.pack();
        viewFrame.setLocationByPlatform(true);
        viewFrame.setVisible(true);
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
