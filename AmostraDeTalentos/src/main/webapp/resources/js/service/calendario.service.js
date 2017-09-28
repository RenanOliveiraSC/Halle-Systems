'use_strict';
(function() {
	
	angular
		.module('app')
		.service('CalendarioService', CalendarioService);
		
	function CalendarioService($http) {
		var service = {
		    listar : listar,
		    getAgendamento : getAgendamento,
		    create : create,
		    update : update,
		    deletar : deletar,
		    concluir : concluir,
		    cancelar : cancelar
		}
		
		return service;
		
		function listar(start, end) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/agendamento/listar/'+start+'/'+end,
				method : 'GET'
			});
		}
		
		function getAgendamento(codigo) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/agendamento/agendamento/'+codigo,
				method : 'GET'
			});
		}
		
		function create(agendamento) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/agendamento/create',
				method : 'POST',
				data : JSON.stringify(agendamento),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
		
		function update(agendamento) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/agendamento/update',
				method : 'POST',
				data : JSON.stringify(agendamento),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
		
		function deletar(codigo) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/agendamento/delete/'+codigo,
				method : 'DELETE'
			});
		}
		
		function concluir(codigo) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/agendamento/concluir/'+codigo,
				method : 'POST'
			});
		}
		
		function cancelar(codigo) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/agendamento/cancelar/'+codigo,
				method : 'POST'
			});
		}
		
	}

})();