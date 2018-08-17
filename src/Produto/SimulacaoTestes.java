/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *
 * @author Paulo Amosse
 */
public class SimulacaoTestes {

    /**
     * Classe de simulacao de testes da classe de produtos
     */
    public void simular(Produto p) {
        if (p instanceof Computador) {
            p.desligar();
            p.ligar();
            ((Computador) p).processar();

        }
        if (p instanceof Impressora) {
            p.desligar();
            p.ligar();
            ((Impressora) p).imprimir();
        }
    }

}
