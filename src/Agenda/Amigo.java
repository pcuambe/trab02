/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.util.Date;

/**
 *
 * @author Paulo Amosse
 */
public class Amigo extends Pessoa{
    /**
     * Variavel do amigo, que armazena a sua sdata de aniversario
     * @variavel dataAniversario
     */
    private Date dataAniversario;

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    
    public Amigo() {
        this.dataAniversario = null;
    }

    @Override
    public String toString() {
        return super.toString()+"Amigo \n" + "Data de Aniversario:" + dataAniversario;
    }
    
    
}
