/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampada;

/**
 *
 * @author Paulo Amosse
 */
public class FabricaLampada {

    /**
     *SuperClasse FabricaLampada que possui duas classes aninhadas a ela
     * Metodo construir que constroi uma lampada dependendo do tipo entregue
     * @param l
     * @return
     */
    
    
    public Lampada construir(Lampada l) {
        if (l instanceof Fluorescente) {
            l = new Fluorescente();
            ((Fluorescente)l).ligar();
            ((Fluorescente)l).desligar();
            return l;
        } else {
            l = new Incadescente();
            ((Incadescente)l).ligar();
            ((Incadescente)l).desligar();
            return l;
        }
    }
}
