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
public class Fluorescente extends FabricaLampada implements Lampada {

    /**
     * Metodos Ligar e Desligar da Classe Lampada Fluorescente Metodos
     * sobrescritos da interface Lampada
     */
    @Override
    public void ligar() {
        JOptionPane.showMessageDialog(null, "Ligando lampada fluorescente...");
    }

    @Override
    public void desligar() {
        JOptionPane.showMessageDialog(null, "Desligando lampada fluorescente...");
    }

}
