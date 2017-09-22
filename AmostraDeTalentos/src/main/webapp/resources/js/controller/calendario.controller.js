'use strict';
(function() {
	angular
		.module('app')
		.controller('CalendarioController', CalendarioController);
	
	function CalendarioController($location, $cookies, $http) {
		
		var calendario = this;
		
		/*declaração das variáveis*/
		calendario.dataInicio;
		calendario.dataFim;
		
		/*declaração dos métodos*/
		calendario.carregarAgendamento = carregarAgendamento;
		
		/*implementação dos métodos*/
		function carregarAgendamento(data){
			
		}
		
	}
})();