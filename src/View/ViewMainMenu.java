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
    JButton buttonView1,buttonView2,buttonView3;
    JPanel panelContent;
    public ViewMainMenu(){
        welcome = new JLabel("welcome");
        buttonView1 = new JButton("BUTTON1");
        buttonView2 = new JButton("BUTTON2");
        buttonView3 = new JButton("BUTTON3");
        panelContent = new JPanel();
        
        panelContent.add(welcome);
        panelContent.add(buttonView1);
        panelContent.add(buttonView2);
        panelContent.add(buttonView3);
        
        FrameMainMenu.setContentPane(panelContent);
        FrameMainMenu.setSize(500,500);
        FrameMainMenu.setLayout(new GridLayout());
        FrameMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FrameMainMenu.setVisible(true);
        
        buttonView1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command) {
            case "BUTTON1": 
                new View1();
                FrameMainMenu.setVisible(false);
                break;
            case "BUTTON2":
//                new MenuDokter();
                FrameMainMenu.setVisible(false);
                break;
            case "BUTTON3":
//                new MenuAdmin();
                FrameMainMenu.setVisible(false);
                break;
            default: 
                break;
        }
    }
}
