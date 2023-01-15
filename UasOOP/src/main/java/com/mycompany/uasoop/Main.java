/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uasoop;

/**
 *
 * @author USER
 */
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame;
        jFrame = new JFrame();
        jFrame.setSize(400,300);
        jFrame.setVisible(true);
        
        //PESAWAT F-14 TOMCAT//
        F14_Tomcat pesawat = new F14_Tomcat();
        
        pesawat.setNegara ( "Amerika");
        
        String nama = pesawat.cetakNegara() + "\n" + pesawat.Ketahanan() + "\n" + pesawat.Meriam() + "\n" + pesawat.Rudal() ;
        
        JOptionPane.showMessageDialog(null, "Welcome");
        JOptionPane.showMessageDialog(null, "PLANE 1");
        JOptionPane.showMessageDialog(null, pesawat.Namapesawat()) ;                               
        JOptionPane.showMessageDialog(null, nama) ;
        
        //PESAWAT F-35 LIGHTHING II//
        
        F35_LIghthingII pesawat2 = new F35_LIghthingII();
        
        pesawat2.setNegara ( "Amerika");
        
        String nama2 = pesawat2.cetakNegara2() + "\n" + pesawat2.Ketahanan2() + "\n" + pesawat2.Meriam2() + "\n" + pesawat2.Rudal2() ;
        
        JOptionPane.showMessageDialog(null, "PLANE 2");
        JOptionPane.showMessageDialog(null, pesawat2.Namapesawat2()) ;                               
        JOptionPane.showMessageDialog(null, nama2) ;
        
    }
}
