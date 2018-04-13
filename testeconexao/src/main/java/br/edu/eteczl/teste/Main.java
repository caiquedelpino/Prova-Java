package src.main.java.br.edu.eteczl.teste;

import java.sql.Connection;
import java.sql.SQLException;
import src.main.java.br.edu.eteczl.testeconexao.model.*;
import src.main.java.br.edu.eteczl.testeconexao.persistence.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
	        	Horista hor = new Horista();
	        	hor.setId(2);
	        	hor.setPrecoHora(200);
	        	hor.setHorasTrabalhadas(20);
	        	//Comissionado com = new Comissionado();
	        	//com.setId(1);
	        	//com.setTotalVenda(100);
	        	//com.setTaxa(20);
	        	//Assalariado ass = new Assalariado();
	        	//ass.setId(1);
	        	//ass.setSalario(300);
	        	//Empregado emp = new Empregado();
	        	//emp.setNome("Daniel");
	        	//emp.setSobrenome("Lira");
	        	//emp.setCpf("1111111");
	        	//String cpf = "1111111";
				Connection conn = JdbcUtil.getConnection();
				HoristaJdbcDao horDAO = new HoristaJdbcDao(conn);
				horDAO.salvar(hor);
				//horDAO.excluir(1);
				//horDAO.alterar(hor);
				//horDAO.listar();
				//ComissionadoJdbcDao comDAO = new ComissionadoJdbcDao(conn);
				//comDAO.salvar(com);
				//comDAO.excluir(1);
				//comDAO.alterar(com);
				//comDAO.listar();
				//AssalariadoJdbcDao assDAO = new AssalariadoJdbcDao(conn);
				//assDAO.salvar(ass);
				//assDAO.excluir(1);
				//assDAO.alterar(ass);
				//assDAO.listar();
				//EmpregadoJdbcDao empregadoDAO = new EmpregadoJdbcDao(conn);
				//empregadoDAO.salvar(emp);
				//empregadoDAO.alterar(emp);
				//empregadoDAO.excluir(cpf);
				//empregadoDAO.listar();
				System.out.println(conn);
			} catch (ClassNotFoundException e) {		
				e.printStackTrace();
			} catch (SQLException e) {		
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
