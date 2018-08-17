/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Amosse
 */
public class Agenda {

    private int qtdAmigos;
    private int qtdConhecidos;
    Pessoa pessoas[];

    public Agenda(int nrPessoas) {
        pessoas = new Pessoa[nrPessoas];

        for (int i = 0; i < nrPessoas; i++) {
            int nrAleatorio = 1 + (int) (Math.random() * 2);
            if (nrAleatorio == 1) {
                pessoas[i] = new Amigo();
                ++qtdAmigos;
            } else {
                pessoas[i] = new Conhecido();
                ++qtdConhecidos;
            }
        }
    }

    public void addInformacoes() {
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].setNome(JOptionPane.showInputDialog("Digite o nome: "));
            pessoas[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));

            if (pessoas[i] instanceof Amigo) {
                String data = JOptionPane.showInputDialog(null, "Introduza a data de \n Aniversario do amigo[dd-MM-yyyy]:");
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                Date dataAniversario = new Date();
                try {
                    dataAniversario = formato.parse(data);
                    ((Amigo) pessoas[i]).setDataAniversario(dataAniversario);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Formato de data Invalida", "Erro na Data", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (pessoas[i] instanceof Conhecido) {
                String email = JOptionPane.showInputDialog(null, "Introduza o email do Conhecido: ");
                ((Conhecido) pessoas[i]).setEmail(email);
            }
        }
    }

    public void imprimirEmails() {
        int a = 0;
        String emails = "Emails \n";
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof Conhecido) {
                emails = emails + ((Conhecido) pessoas[i]).getEmail() + "\n";
                ++a;
            }
        }

        if (a > 0) {
            JOptionPane.showMessageDialog(null, emails);
        } else {
            JOptionPane.showMessageDialog(null, "Sem emails para mostrar", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void imprimirAniversarios() {
        int a = 0;
        String datas = "Datas de aniversario: \n";
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof Amigo) {
                datas = datas + ((Amigo) pessoas[i]).getDataAniversario() + "\n";
                ++a;
            }
        }

        if (a > 0) {
            JOptionPane.showMessageDialog(null, datas);
        } else {
            JOptionPane.showMessageDialog(null, "Sem datas de aniversarios para "
                    + "mostra", "Datas", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void imprimir() {
        String amigo = "Todos Amigos: ";
        String conhecidos = "Todos Conhecidos: ";
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof Amigo) {
                amigo = amigo + pessoas[i].toString();
            } else {
                conhecidos = conhecidos + pessoas[i].toString();
            }
        }

        JOptionPane.showMessageDialog(null, amigo);
        JOptionPane.showMessageDialog(null, conhecidos);
    }

    public int getQtdAmigos() {
        return qtdAmigos;
    }

    public void setQtdAmigos(int qtdAmigos) {
        this.qtdAmigos = qtdAmigos;
    }

    public int getQtdConhecidos() {
        return qtdConhecidos;
    }

    public void setQtdConhecidos(int qtdConhecidos) {
        this.qtdConhecidos = qtdConhecidos;
    }

}
