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
public class Impressora extends Produto {

    /**
     * Tipo de produto
     *
     * @variavel velocidade
     */
    private String velocidade;

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * Metodos sobrescritos da classe super
     */
    @Override
    public void desligar() {
        super.desligar();
        JOptionPane.showMessageDialog(null, "A impressora nao esta disponivel para imprimir...");
    }

    @Override
    public void ligar() {
        super.ligar();
        JOptionPane.showMessageDialog(null, "A impressora esta pronta para receber documentos...");
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "A impressora esta imprimindo...");
    }

    @Override
    public String toString() {
        return "Impressora \nVelocidade de Impressao: " + this.getVelocidade() + super.toString();
    }

}
