/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.lista;

/**
 *
 * @author Samuel Melo
 */
/*public void listarTodos() {

		String sql = "SELECT titulo,conteudo from noticia";
		List<Noticia> listAll = null;
		Noticia n;
		
		try {

			Connection con = Conexao.getConnection();
			Statement stm = con.createStatement();

			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {

				n = new Noticia();
				
				n.setTitulo(rs.getString("titulo"));
				n.setConteudo(rs.getString("conteudo"));
				
				listAll.add(n);
				System.out.println("ADICIONOU 1");
				
			}
			System.out.println("Adicionou Todos!");
			
			con.close();
			rs.close();
			stm.close();
			
		} catch (Exception e) {
			System.out.println("Listando... "+e.getMessage());
		}

		return listAll;

	}
*/
