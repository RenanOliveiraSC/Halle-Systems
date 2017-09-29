'use_strict';
(function() {
	
	angular
		.module('app')
		.service('FuncionarioService', FuncionarioService);
		
	function FuncionarioService($http) {
		var service = {
				create : create,
			    update : update,
			    deletar : deletar,
			    listar : listar,
				listarSelect : listarSelect,
				getFuncionario : getFuncionario,
		}
		
		return service;
		
		function create(funcionario) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/funcionario/create',
				method : 'POST',
				data : JSON.stringify(funcionario),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
		
		function update(funcionario) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/funcionario/update',
				method : 'POST',
				data : JSON.stringify(funcionario),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
		
		function deletar(codigo) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/funcionario/delete/'+codigo,
				method : 'DELETE'
			});
		}
		
		function listar() {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/funcionario/funcionarios',
				method : 'GET'
			});
		}
		
		function listarSelect() {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/funcionario/funcionariosSelecionar',
				method : 'GET'
			});
		}
		
		function getFuncionario(codigo){
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/funcionario/funcionario/'+codigo,
				method : 'GET'
			});
		}
	}

})();