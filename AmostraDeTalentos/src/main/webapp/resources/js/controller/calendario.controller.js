'use strict';
(function() {
	angular
		.module('app')
		.controller('CalendarioController', CalendarioController);
	
	function CalendarioController($location, $cookies, $http, CalendarioService) {
		
		var calendario = this;
		
		/*declaração das variáveis*/
		calendario.dataInicio;
		calendario.dataFim;
		calendario.agendamento;
		
		/*declaração dos métodos*/
		calendario.carregarAgendamentoPeloCodigo = carregarAgendamentoPeloCodigo;
		calendario.carregarNovoAgendamento = carregarNovoAgendamento;
		calendario.getClientes = getClientes;
		calendario.getServicos = getServicos;
		calendario.getFuncionarios = getFuncionarios;
		
		/*implementação dos métodos*/
		
		function carregarAgendamentoPeloCodigo(codigo){
			console.log(codigo);
			CalendarioService.getAgendamento(codigo)
			.then(
				function(data) { //success
					console.log(data.data);
					calendario.agendamento = data.data;
				}, function() { //error
					alert("Não foi possível carregar o agendamento");
				});
		};
		
		function carregarNovoAgendamento(dataAgendamento){
			CalendarioService.novo()
			.then(
				function(data) { //success
					console.log(data.data);
					calendario.agendamento = data.data;
				}, function() { //error
					alert("Não foi possível carregar novo agendamento");
				});
			
		};
		
		function getClientes(){
			return [{codigo : '1', nome : 'Maria', cpf : '789.999.987-99'},
					{codigo : '2', nome : 'Fulano', cpf : '789.999.987-98'},
					{codigo : '3', nome : 'José', cpf : '789.999.987-97'}]
		};
		
		function getServicos(){
			return [{codigo : '1', servico : 'Unhas'},
				{codigo : '2', servico : 'Cabelo Feminino'},
				{codigo : '3', servico : 'Cabelo Masculino'}]
		};
		
		function getFuncionarios(){
			return [{codigo : '1', nome : 'Marlene'},
				{codigo : '2', nome : 'Adriana'}]
		};
		
	}
})();