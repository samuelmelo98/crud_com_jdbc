/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.teste2;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Samuel Melo
 */

        
public class ConectarBanco {
    
        static Connection cn;
        static Statement sr;
        static ResultSet rs;
        static String  usuariodb  = "system";
        static String  senhadb    = "23038614Ss";
  public void Conectar(){
    try{
        String url = "jdbc:oracle:thin:@localhost:1521:mydb";
        cn         = DriverManager.getConnection(url,usuariodb,senhadb);
        sr         = cn.createStatement();
        System.out.println("Conectou com sucesso!!");
    
}
 catch(Exception e){
     
     JOptionPane.showMessageDialog(null, "ERRO ao Conectar no Banco de Dados!");
    
}   
    
    
}
 public void  ConsultarBanco(){
     int ver=1;
     try{
         String sql = "SELECT * FROM LOGIN";
       rs = sr.executeQuery(sql);
       
    while(rs.next()){
       String email = rs.getString("email");
       String senha = rs.getString("senha");
       //  System.out.println("conteudo:"+email+"-"+senha);
         System.out.println(""+  rs.getString("id"));
         System.out.println(""+  rs.getString("email"));
         System.out.println(""+  rs.getString("senha"));
         
         
         
         
         
       if(email.equals("test")&& senha.equals("test")){
          
           int t= ver++;
          JOptionPane.showMessageDialog(null, "Acesso com sucesso");
          // rs.close();
           System.out.println(t);
       }
     }}
      catch(SQLException | HeadlessException e){
          System.out.println("ERRO AO CONSULTAR O BANCO DE DADOS!");
      }
  }
 
 public String Adicionar(String sql){
         
     try{
        
        rs = sr.executeQuery(sql);
        
     }
     catch(Exception e){
         
     }
     String msg = "Executou query com sucesso!";
            return  msg;
 }
}