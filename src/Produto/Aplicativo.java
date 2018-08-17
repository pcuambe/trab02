/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Amosse
 */
public class Aplicativo {
    /**
     * Classe de teste do Produto
     * @param args 
     */
    public static void main(String[] args) {
        Computador computador = new Computador();
        Impressora impressora = new Impressora();
        
        computador.setVelocidadePro("7GHz");
        computador.setNrSerie(231);
        computador.setTipo("MacBook Pro");
        
        impressora.setVelocidade("8ppm");
        impressora.setNrSerie(819);
        impressora.setTipo("HP");
        
        SimulacaoTestes simula = new SimulacaoTestes();
        simula.simular(computador);
        simula.simular(impressora);
        JOptionPane.showMessageDialog(null, ""+computador+"\n\n"+impressora);
    }
}
