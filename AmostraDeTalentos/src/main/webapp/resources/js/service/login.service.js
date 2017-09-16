'use_strict';
(function() {
	
	angular
		.module('app')
		.service('LoginService', LoginService);
		
	function LoginService(URL_APP, $http) {
		var service = {
		    login : login
		}
		
		return service;
		
		function logins(credenciais) {
			return $http({
				url : URL_APP + '/login',
				method : 'POST',
				data : JSON.stringify(credenciais),
				headers : {
					'Content-Type' : 'application/json'
				}
			});
		}
	}

})();