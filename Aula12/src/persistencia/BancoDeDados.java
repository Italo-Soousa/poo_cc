package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	// Propriedades da classe
	private Connection objConexao = null;
	
	// Métodos da classe 
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula12?user=root&password=ceub123456&autoReconnect=true&serverTimezone=UTC&useSSL=false");
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}

	Connection getObjConexao() {
		return objConexao;
	}
}
