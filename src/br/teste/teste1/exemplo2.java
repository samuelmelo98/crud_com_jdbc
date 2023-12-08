/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.teste1;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Melo
 */
public class exemplo2 {
    
    public static void main(String[]args){
        
        String[] op ={"Masculino","Feminino","samuel","Melo","Outros"};
        
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:", "Titulo",
                                                 JOptionPane.PLAIN_MESSAGE,null,op,"Feminino");
        if(resp==null){
           
            System.out.println("Voce Cancelou");
        }
        JOptionPane.showMessageDialog(null,"Você selecionou: "+resp);
        
        if("samuel".equals(resp)){
            System.out.println("Comparação com equals ");
        }
        System.exit(0);
    }
    
}
