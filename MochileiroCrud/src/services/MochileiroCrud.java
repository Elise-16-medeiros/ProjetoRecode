package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import conexao.ConexaoBanco;
import model.MochileiroDados;

public class MochileiroCrud {

	public void save() {
		Scanner sc = new Scanner(System.in);

		MochileiroDados mochileiro = new MochileiroDados();

		System.out.println("Digite seu nome completo:");
		mochileiro.setNome(sc.nextLine());

		System.out.println("Digite seu email:");
		mochileiro.setEmail(sc.nextLine());

		System.out.println("Digite sua senha:");
		mochileiro.setSenha(sc.nextInt());

		System.out.println("Digite seu endereco:");
		mochileiro.setEndereco(sc.nextLine());

		System.out.println("Digite seu complemento:");
		mochileiro.setComplemento(sc.nextLine());

		System.out.println("Digite seu Cidade:");
		mochileiro.setCidade(sc.nextLine());

		System.out.println("Digite seu Estado:");
		mochileiro.setEstado(sc.nextLine());

		String sql = "INSERT INTO Dados(nome, email, senha, endereco, complemento, cidade, estado)VALUES(?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConexaoBanco.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, mochileiro.getNome());
			pstm.setString(2, mochileiro.getEmail());
			pstm.setInt(3, mochileiro.getSenha());
			pstm.setString(4, mochileiro.getEndereco());
			pstm.setString(5, mochileiro.getComplemento());
			pstm.setString(6, mochileiro.getCidade());
			pstm.setString(7, mochileiro.getEstado());

			pstm.execute();
			System.out.println("Cadastro efetuado.");

			conn.close();
			pstm.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void update() {
		Scanner sc = new Scanner(System.in);

		MochileiroDados mochileiro = new MochileiroDados();

		System.out.println("Digite o Id");
		mochileiro.setId(sc.nextInt());

		System.out.println("Digite seu nome completo:");
		mochileiro.setNome(sc.nextLine());

		System.out.println("Digite seu email:");
		mochileiro.setEmail(sc.nextLine());

		System.out.println("Digite sua senha:");
		mochileiro.setSenha(sc.nextInt());

		System.out.println("Digite seu endereco:");
		mochileiro.setEndereco(sc.nextLine());

		System.out.println("Digite seu complemento:");
		mochileiro.setComplemento(sc.nextLine());

		System.out.println("Digite seu Cidade:");
		mochileiro.setCidade(sc.nextLine());

		System.out.println("Digite seu Estado:");
		mochileiro.setEstado(sc.nextLine());

		String sql = "UPDATE dados set nome = ?, email = ?, senha = ?, endereco = ?, complemento = ?, cidade = ?, estado = ? where id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConexaoBanco.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, mochileiro.getNome());
			pstm.setString(2, mochileiro.getEmail());
			pstm.setInt(3, mochileiro.getSenha());
			pstm.setString(4, mochileiro.getEndereco());
			pstm.setString(5, mochileiro.getComplemento());
			pstm.setString(6, mochileiro.getCidade());
			pstm.setString(7, mochileiro.getEstado());
			pstm.setInt(8, mochileiro.getId());

			pstm.execute();
			System.out.println("Cadastro atualizado.");

			conn.close();
			pstm.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		
		MochileiroDados mochileiro = new MochileiroDados();
		

		System.out.println("Digite o Id");
		mochileiro.setId(sc.nextInt());
		
		String sql = "DELETE FROM dados where id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, mochileiro.getId());

			pstm.execute();
			System.out.println("Cadastro excluído.");

			conn.close();
			pstm.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		
		MochileiroDados mochileiro = new MochileiroDados();
		System.out.println("Digite o Id");
		mochileiro.setId(sc.nextInt());

		System.out.println("Digite seu nome completo:");
		mochileiro.setNome(sc.nextLine());

		System.out.println("Digite seu email:");
		mochileiro.setEmail(sc.nextLine());

		System.out.println("Digite sua senha:");
		mochileiro.setSenha(sc.nextInt());

		System.out.println("Digite seu endereco:");
		mochileiro.setEndereco(sc.nextLine());

		System.out.println("Digite seu complemento:");
		mochileiro.setComplemento(sc.nextLine());

		System.out.println("Digite seu Cidade:");
		mochileiro.setCidade(sc.nextLine());

		System.out.println("Digite seu Estado:");
		mochileiro.setEstado(sc.nextLine());

		String sql = "SELECT FROM * dados";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConexaoBanco.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, mochileiro.getNome());
			pstm.setString(2, mochileiro.getEmail());
			pstm.setInt(3, mochileiro.getSenha());
			pstm.setString(4, mochileiro.getEndereco());
			pstm.setString(5, mochileiro.getComplemento());
			pstm.setString(6, mochileiro.getCidade());
			pstm.setString(7, mochileiro.getEstado());
			pstm.setInt(8, mochileiro.getId());

			pstm.execute();
			System.out.println("Cadastro Selecionado.");

			conn.close();
			pstm.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

	
	
	

