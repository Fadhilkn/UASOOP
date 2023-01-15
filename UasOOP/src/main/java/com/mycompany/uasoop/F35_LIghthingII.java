/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uasoop;

/**
 *
 * @author USER
 */
public class F35_LIghthingII extends Pesawat {
    String Negara;
    
    public void setNegara(String Negara){
        this.Negara = Negara;
    }
    public String getNegara(){
        return this.Negara;   
    }
   public String Namapesawat2() {
        return "F-35 LIghthing II ";
    }
   public String cetakNegara2() {
        return "Negara: " + getNegara();
    }
    public String Ketahanan2(){
        return "HP : 1500";
    }
   public String Meriam2(){
        return "MERIAM : GAU-22";    
    }
    public String Rudal2(){
        return "RUDAL : SPEAR-3";
    }
    
    
}
