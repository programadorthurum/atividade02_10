package atividade02_10;

import java.util.ArrayList;

public class DaoClienteImpl implements DaoCliente {

	private ArrayList<Cliente> lista;

	public ArrayList<Cliente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cliente> lista) {
		this.lista = lista;
	}

	public DaoClienteImpl() {
	}

	@Override
	public Cliente incluir(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Integer codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente alterar(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente get() {
		// TODO Auto-generated method stub
		return null;
	}

}
