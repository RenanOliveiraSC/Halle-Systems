'use_strict';
(function() {
	
	angular
		.module('app')
		.service('ServicoService', ServicoService);
		
	function ServicoService($http) {
		var service = {
				getServico : getServico,
				listar : listar,
				listarSelect : listarSelect
		}
		
		return service;

		function getServico(codigo) {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/servico/servico/'+codigo,
				method : 'GET'
			});
		}
		
		function listar() {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/servico/listar',
				method : 'GET'
			});
		}
		
		function listarSelect() {
			return $http({
				url : 'http://localhost:9080/AmostraDeTalentos/rest/servico/servicosSelecionar',
				method : 'GET'
			});
		}
	}

})();