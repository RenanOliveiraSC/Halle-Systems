'use strict';
(function() {
	angular
		.module('app')
		.controller('LoginController', LoginController);
	
	function LoginController($location, $cookies, $http, LoginService) {
		
		var login = this;
		
		/*declaração das variáveis*/
		login.usuario;
		login.senha;
		
		/*declaração dos métodos*/
		login.efetuarLogin = efetuarLogin;
		
		/*implementação dos métodos*/
		
		function efetuarLogin() {
			var credencial = {usuario: login.usuario, senha: login.senha};
			LoginService.login(credencial)
			.success(
				function(data) {
					$cookies.putObject('autorizacao', data);
					$location.path('/home');
				})
			.error(
				function() {
					alert("Login invalido");
				}
			);
		};
	}
})();