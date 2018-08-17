/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Amosse
 */
public class TesteAgenda {
    public static void main(String[] args) {
        
        /**
         * Aqui vamos pedir chamar os metodos das classes criadas
         */
        Agenda a;
        int nrPessoas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o nr de pessoas \nque deseja introduzir na Agenda"));
        
        a = new Agenda(nrPessoas);
        JOptionPane.showMessageDialog(null,"Amigos: "+a.getQtdAmigos()+"\nConhecidos: "+a.getQtdConhecidos());
        a.addInformacoes();
        a.imprimirAniversarios();
        a.imprimirEmails();
//        JOptionPane.showMessageDialog(null, "Agora vamos imprimir tudo. \n NB: My own Stuff");
//        a.imprimir();
    }
}
