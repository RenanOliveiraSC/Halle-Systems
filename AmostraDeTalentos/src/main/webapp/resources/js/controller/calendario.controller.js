'use strict';
(function() {
	angular
		.module('app')
		.controller('CalendarioController', CalendarioController);
	
	function CalendarioController($location, $cookies, $http, CalendarioService, ClienteService, 
			FuncionarioService, ServicoService) {
		
		var calendario = this;
		
		/*declaração das variáveis*/
		calendario.dataInicio;
		calendario.dataFim;
		calendario.agendamento;
		calendario.clientes;
		calendario.servicos;
		calendario.funcionarios;
		
		/*declaração dos métodos*/
		calendario.init = init; 
		calendario.carregarAgendamentoPeloCodigo = carregarAgendamentoPeloCodigo;
		calendario.carregarNovoAgendamento = carregarNovoAgendamento;
		calendario.getClientes = getClientes;
		calendario.getServicos = getServicos;
		calendario.getFuncionarios = getFuncionarios;
		calendario.concluir = concluir;
		calendario.cancelar = cancelar;
		calendario.salvar = salvar;
		calendario.excluir = excluir;
		calendario.limpar = limpar;
		
		/*implementação dos métodos*/
		
		function init(){
			calendario.getClientes();
			calendario.getServicos();
			calendario.getFuncionarios();
		};
		
		function carregarAgendamentoPeloCodigo(codigo){
			CalendarioService.getAgendamento(codigo).then(
				function(data) { //success
					calendario.agendamento = data.data;
				},
				function() { //error
					alert("Não foi possível carregar o agendamento");
				}
			);
		};
		
		function carregarNovoAgendamento(date){
			calendario.agendamento.data = new Date(date);
		};
		
		function getClientes(){
			ClienteService.listarSelect().then(
				function(data) { //success
					calendario.clientes = data.data;
				},
				function() {}
			);
		};
		
		function getServicos(){
			ServicoService.listarSelect().then(
				function(data) { //success
					calendario.servicos = data.data;
				},
				function() {}
			);
		};
		
		function getFuncionarios(){
			FuncionarioService.listarSelect().then(
				function(data) { //success
					calendario.funcionarios = data.data;
				},
				function() {}
			);
		};
		
		function limpar(){
			calendario.agendamento = [];
		}
		
		function concluir(){
			CalendarioService.concluir(codigo).then(
				function(data) { //success
					alert('Concluído com sucesso');
				},
				function() {}
			);
		};
		
		function cancelar(){
			CalendarioService.cancelar(codigo).then(
				function(data) { //success
					alert('Cancelado com sucesso');
				},
				function() {}
			);
		};
		
		function salvar(){
			if(calendario.agendamento && calendario.agendamento.codigo){
				CalendarioService.update(calendario.agendamento).then(
					function(data) { //success
						alert('Alterado com sucesso');
					},
					function() {}
				);
			}else{
				CalendarioService.create(calendario.agendamento).then(
					function(data) { //success
						alert('Criado com sucesso');
					},
					function() {}
				);
			}
		};
		
		function excluir(){
			CalendarioService.deletar(codigo).then(
				function(data) { //success
					alert('Removido com sucesso');
				},
				function() {}
			);
		};
		
		calendario.init();
		
	}
})();