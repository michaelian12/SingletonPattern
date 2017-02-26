/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author Michael
 */
public class Istri {
    private static Istri istri=null;

    public String getNamaSuami() {
        return namaSuami;
    }

    public void setNamaSuami(String namaSuami) {
        this.namaSuami = namaSuami;
    }

    private String namaSuami;

    private Istri(){
        System.out.println("Halo, saya istri kamu!");
    }

    public static synchronized Istri getIstri(){
        if(istri==null)
            istri=new Istri();

        return istri;
    }

    public void katakanSesuatu(){
        System.out.println("Mau dibuatkan masakan apa mas "+namaSuami+"?");
    }
}
