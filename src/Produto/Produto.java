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
public class Produto {

    /**
     * Classe super
     *
     * @variavel nrSerie
     * @variavel tipo
     * @variavel ligado
     */
    private int nrSerie;
    private String tipo;
    private boolean ligado;

    public int getNrSerie() {
        return nrSerie;
    }

    public void setNrSerie(int nrSerie) {
        this.nrSerie = nrSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * Metodos da Classe
     */
    public void ligar() {
        if (this.isLigado() == false) {
            this.setLigado(true);
        } else {
            JOptionPane.showMessageDialog(null, "O computador ja esta ligado.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void desligar() {
        if (this.isLigado() == false) {
            this.setLigado(false);
        } else {
            JOptionPane.showMessageDialog(null, "O computador ja esta desligado.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "\nSerie: " + this.getNrSerie() + "\nTipo: " + this.getTipo() + "\nLigado: " + this.isLigado();
    }

}
