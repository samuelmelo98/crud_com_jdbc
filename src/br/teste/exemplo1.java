/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Melo
 */
public class exemplo1 {
  
   public static void main(String[] args){
       
    String nome,auxaltura;
    float altura;
     
    try{
    nome = JOptionPane.showInputDialog("Entre com sua nome:");
    auxaltura = JOptionPane.showInputDialog("Entre com sua Altura:");
    altura = Float.parseFloat(auxaltura);
    JOptionPane.showMessageDialog(null,nome);
    JOptionPane.showMessageDialog(null, altura);
    }
    catch(Exception e)
            {
               JOptionPane.showMessageDialog(null, e);
            }
}
}