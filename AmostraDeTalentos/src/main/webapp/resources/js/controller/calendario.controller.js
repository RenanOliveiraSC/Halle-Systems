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
		calendario.limpar = limpar;
		
		/*implementação dos métodos*/
		
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
			if(calendario.clientes && '' != calendario.clientes){
				ClienteService.listarSelect().then(
					function(data) { //success
						calendario.clientes = data.data;
					},
					function() { //error
						alert("Não foi possível carregar a listagem de clientes");
					}
				);
			}
		};
		
		function getServicos(){
			if(calendario.servicos && '' != calendario.servicos){
				ServicoService.listarSelect().then(
					function(data) { //success
						calendario.servicos = data.data;
					},
					function() { //error
						alert("Não foi possível carregar a listagem de serviços");
					}
				);
			}
		};
		
		function getFuncionarios(){
			if(calendario.funcionarios && '' != calendario.funcionarios){
				FuncionarioService.listarSelect().then(
					function(data) { //success
						calendario.funcionarios = data.data;
					},
					function() { //error
						alert("Não foi possível carregar a listagem de funcionários");
					}
				);
			}
		};
		
		function init(){
			calendario.getClientes();
			calendario.getServicos();
			calendario.getFuncionarios();
		};
		
		function limpar(){
			calendario.agendamento = [];
		}
		
		calendario.init();
		
	}
})();