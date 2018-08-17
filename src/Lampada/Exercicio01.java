/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampada;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Amosse
 */
public class Exercicio01 {

    /**
     * Classe de teste da Lampada
     *
     * @param args
     */
    public static void main(String[] args) {

        Fluorescente fl = new Fluorescente();
        Incadescente inc = new Incadescente();
        FabricaLampada fb = new FabricaLampada();

        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual lampada deseja construir?"
                + "\n1 - Fluorescente \n2 - Incandescente"));

        switch (i) {
            case 1:
                fb.construir(fl);
                break;
            case 2:
                fb.construir(inc);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida", "", JOptionPane.ERROR_MESSAGE);
        }
    }
}
