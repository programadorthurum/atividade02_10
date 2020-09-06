package atividade02_10;

import java.util.ArrayList;

public interface DaoCliente {

	public Cliente incluir(Cliente c);

	public void excluir(Integer codigo);

	public Cliente alterar(Cliente c);

	public ArrayList<Cliente> listar();

	public Cliente get();

}
