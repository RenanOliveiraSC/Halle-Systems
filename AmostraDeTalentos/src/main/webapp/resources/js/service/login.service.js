'use_strict';
(function() {
	
	angular
		.module('app')
		.service('LoginService', LoginService);
		
	function LoginService($http) {
		var service = {
		    login : login
		}
		
		return service;
		
		function login(credenciais) {
			return $http({
				url : 'http://localhost:8080/AmostraDeTalentos/rest/login/efetuarlogin',
				method : 'POST',
				data : JSON.stringify(credenciais),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
	}

})();