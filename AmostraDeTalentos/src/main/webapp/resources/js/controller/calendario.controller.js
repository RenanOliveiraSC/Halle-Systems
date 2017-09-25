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
		
		function carregarNovoAgendamento(data){
			console.log(data);
		};
		
	}
})();