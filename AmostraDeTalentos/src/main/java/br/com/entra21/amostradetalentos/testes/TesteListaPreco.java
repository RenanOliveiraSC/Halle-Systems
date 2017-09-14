package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.model.ListaDePreco;
import br.com.entra21.amostradetalentos.service.ListaDePrecoService;

public class TesteListaPreco {

	public static void main(String[] args) throws SQLException{
		
		ListaDePrecoService listaDePrecoService = new ListaDePrecoService();

		List<ListaDePreco> lListaDePreco = listaDePrecoService.listarListaDePreco();
		for (ListaDePreco lista : lListaDePreco) {
			System.out.println(lista.getNome() + " " + lista.getFator());
		}
	}
}
