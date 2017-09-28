'use_strict';
(function() {
	
	angular
		.module('app')
		.service('ClienteService', ClienteService);
		
	function ClienteService($http) {
		var service = {
				create : create,
			    update : update,
			    deletar : deletar,
				listar : listar,
			    listarSelect : listarSelect
		}
		
		return service;
		
		function create(cliente) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/cliente/create',
				method : 'POST',
				data : JSON.stringify(cliente),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
		
		function update(cliente) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/cliente/update',
				method : 'POST',
				data : JSON.stringify(cliente),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
		
		function deletar(codigo) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/cliente/delete/'+codigo,
				method : 'DELETE'
			});
		}
		
		function listar() {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/cliente/clientes',
				method : 'GET'
			});
		}
		
		function listarSelect() {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/cliente/clientesSelecionar',
				method : 'GET'
			});
		}
	}

})();