/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conexao;

import static br.com.conexao.Conexao.getConexao;
import static br.com.conexao.ConexaoDb.conexao;
import static br.com.conexao.ConexaoMy.getConexao;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Samuel Melo
 */
public class Conexao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/sistema";
    private static final String USER = "root";
    private static final String PASS = "";
    private static  Statement stmt ;
    public static Connection getConexao()
    {
        try
        {
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            throw new RuntimeException("Algo aconteceu de errado com a conexão com o banco, veja: " + ex);
        }
    }


    
    
}
class Inserir{
   
     String sql="insert into meusdados(id,nome,sobrenome,email)Values(????)";
    
     public void inr(){
     
     try{
      Connection con=null;
      con=Conexao.getConexao();
      PreparedStatement stm= null;
      stm=con.prepareStatement(sql);
      stm.setString(1,"null");
       stm.setString(2,"Melo");
        stm.setString(3,"test");
         stm.setString(4,"eu@");
      stm.executeQuery();
         
     }catch(Exception e){
         
         
         
     }
 }}
    

