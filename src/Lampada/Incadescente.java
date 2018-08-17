/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampada;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Amosse
 */
public class Incadescente extends FabricaLampada implements Lampada {

    /**
     * Metodos sobrescritos da Interface Lampada
     */
    @Override

    public void ligar() {
        JOptionPane.showMessageDialog(null, "Ligando lampada incadescente..");
    }

    @Override
    public void desligar() {
        JOptionPane.showMessageDialog(null, "Desigando lampada incadescente..");
    }

}
