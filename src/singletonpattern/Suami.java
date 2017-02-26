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
public class Suami {
    private static Suami suami = null;
    private String namaIstri;

    public String getNamaIstri() {
        return namaIstri;
    }

    public void setNamaIstri(String namaIstri) {
        this.namaIstri = namaIstri;
    }

    private Suami(){
        System.out.println("Halo, saya suami kamu");
    }

    public static synchronized Suami getSuami(){
        if(suami==null)
            suami=new Suami();

        return suami;
    }

    public void katakanSesuatu(){
        System.out.println("Mau dibelikan baju warna apa dek "+namaIstri+"?");
    }
}
