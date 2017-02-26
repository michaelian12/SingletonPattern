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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Suami suami = Suami.getSuami();
        suami.setNamaIstri("Susi");
        suami.katakanSesuatu();
        
        Istri istri = Istri.getIstri();
        istri.setNamaSuami("10113050_Michael Agustian");
        istri.katakanSesuatu();
        
        Suami os = Suami.getSuami();
        os.setNamaIstri("Juminten");
        os.katakanSesuatu();
        
        suami.katakanSesuatu();
    }
    
}
