/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conexao;


//import static br.com.conexao.ConexaoDb.stmt;
import java.sql.*;


/**
 *
 * @author Samuel Melo
 */
public class ConexaoDb {
 private static final String usuario = "root";
 private static final String senha   = "";
 private static final String dbnome  = "teste";
 private static final String servidor = "localhost:";
 private static final String porta   ="3306/";
    
    
    static Connection conexao;
    static ResultSet  resultado;
    static Statement   stmt;
    
   
    
    public static void main(String args[]) throws SQLException{
    
 
    String URL = "jdbc:mysql://";
    String DRIVER = "com.mysql.jdbc.Driver";
   
    
    try{
        Class.forName(DRIVER);
        conexao =DriverManager.getConnection(URL+servidor+porta+dbnome,usuario,senha);
        System.out.println("Conexão ao Banco de Dados realizada com sucesso!");
        
        /////////////////////////////////////////////////////////////////////
              //INSERT INTO //Coamandos para inserir no banco de dados!!!
        String sql ="INSERT INTO meusdados(id,nome,sobrenome,email)VALUES"
                + "(null,'Samuel','Melo',"
                + "'samuelmelo98@hotmail.com') ";
        stmt = conexao.prepareStatement(sql);
        stmt.execute(sql);
        
      ///////////////////////////////////////////////////////////////////////////
       /*/SELECT Consuta no banco de dados! Retorna todos os dados da tabela meusdados, faz filtro pelo email.
        retorna todo os dados do email do filtro*/
       sql ="SELECT * FROM  meusdados WHERE email='samuelmelo98@hotmail.com' ";//faz um filtro no banco de dados pelo email
       stmt = conexao.prepareStatement(sql);
       resultado = stmt.executeQuery(sql);//Consulta o banco de dados
        while(resultado.next()){//Laço que mostra todos os dados armazenados no banco de dados
        System.out.println(resultado.getString("id"));
        System.out.println(resultado.getString("nome"));
        System.out.println(resultado.getString("sobrenome"));
        System.out.println(resultado.getString("email"));
        System.out.println("Primeira Consulta\n");
        }
  //////////////////////////////////////////////////////////////////////////////////////////
        //Update no Banco de Dados
        sql ="UPDATE meusdados SET nome='Ana Beatriz' WHERE id=2";
        stmt = conexao.prepareStatement(sql);
        stmt.executeUpdate(sql);
      
        //Delete Dados
        sql ="DELETE FROM meusdados WHERE id=1   ";
        stmt = conexao.prepareStatement(sql);
        stmt.execute(sql);
        
        ////////////////////////////////////////////////
       // Consulta banco depois das mudanças
        
         sql ="SELECT * FROM  meusdados";
        stmt = conexao.prepareStatement(sql);
        resultado = stmt.executeQuery(sql);//Consulta o banco de dados
        while(resultado.next()){//Laço que mostra todos os dados armazenados no banco de dados
        System.out.println(resultado.getString("id"));
        System.out.println(resultado.getString("nome"));
        System.out.println(resultado.getString("sobrenome"));
        System.out.println(resultado.getString("email"));
        System.out.println("Segunda Consulta\n");
        }
        conexao.close();
}
 catch(Exception e){
     
     System.out.println("Erro na Conexão com o Banco de Dados!"+e);
    
}

}
  }

