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
				listarSelect : listarSelect
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
		
		function listarSelect() {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/funcionario/funcionariosSelecionar',
				method : 'GET'
			});
		}
	}

})();