/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conexao;

import static br.com.conexao.ConexaoDb.conexao;
import static br.com.conexao.ConexaoDb.stmt;
import java.sql.SQLException;

/**
 *
 * @author Samuel Melo
 */
public class InsertInto {
   
     String sql ;//="INSERT INTO meusdados(id,nome,sobrenome,email)VALUES(null,'Samuel','Melo','samuelmelo98@hotmail.com')";
     public String Inserir(String sql) throws SQLException{
         stmt = conexao.prepareStatement(sql);
         stmt.execute(sql);
         return "Inserido com Sucesso!";
     }
    
}
