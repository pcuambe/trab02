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
public class Computador extends Produto {

    /**
     * Um tipo de produto
     *
     * @variavel velocidadePro
     */
    private String velocidadePro;

    public String getVelocidadePro() {
        return velocidadePro;
    }

    public void setVelocidadePro(String velocidadePro) {
        this.velocidadePro = velocidadePro;
    }

    /**
     * Metodos sobrescritos da classe Mae
     */
    @Override
    public void desligar() {
        super.desligar();
        JOptionPane.showMessageDialog(null, "O computador esta sendo delisgado...");
    }

    @Override
    public void ligar() {
        super.ligar();
        JOptionPane.showMessageDialog(null, "O computador esta ligando...");
    }

    public void processar() {
        JOptionPane.showMessageDialog(null, "Computador processando...");
    }

    @Override
    public String toString() {
        return "Computador" + "\nVelocidade de processamento: " + this.getVelocidadePro() + super.toString();

    }

}
