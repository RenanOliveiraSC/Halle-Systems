package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.model.*;
import br.com.entra21.amostradetalentos.service.EstadoService;
import br.com.entra21.amostradetalentos.dao.*;

public class EstadoTeste {

	public static void main(String[] args) throws SQLException {
		
		Estado estado = new Estado();
		
		
		EstadoService estadoService = new EstadoService();
	
	List<Estado> lEstado = estadoService.listarEstados();
	for (Estado estado : lEstado) {
		System.out.println();
	}
	}
	
	
}
