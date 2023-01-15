/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uasoop;

/**
 *
 * @author USER
 */
public class F14_Tomcat extends Pesawat{
    String Negara;
    
    public void setNegara(String Negara){
        this.Negara = Negara;
    }
    public String getNegara(){
        return this.Negara;
       
    }
    
    public String Namapesawat() {
        return "F-14Tomcat ";
    }
    public String cetakNegara() {
        return "Negara: " + getNegara();
    }
    
    public String Ketahanan(){
        return "HP : 1000";
    }
    public String Meriam(){
        return "Meriam : Vulkan";
    }
    public String Rudal(){
        return "Rudal : AGM_65";
    }
    
    
}
