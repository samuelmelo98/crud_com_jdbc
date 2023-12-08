/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.teste2;

/**
 *
 * @author Samuel Melo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConectarBanco con =new  ConectarBanco();
        con.Conectar();
    // String sql= "INSERT INTO LOGIN ( id,EMAIL,SENHA) VALUES(17,'test','test') ";
    //String sql= "DELETE LOGIN WHERE id=15";
      // String teste= "SELECT*FROM LOGIN ";
     //con.Adicionar(sql);
       //System.out.println(con.Adicionar(sql));
        con.ConsultarBanco();
        
        
        
    }
    
}
