package atividade02_10;

import com.sun.jdi.connect.spi.Connection;

public class ConexaoImpl implements Conexao {

	private String usuario;
	private String senha;
	private String uri;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public Connection conectar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desconectar(Connection con) {
		// TODO Auto-generated method stub

	}

}
