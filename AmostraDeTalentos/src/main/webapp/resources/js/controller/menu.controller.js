'use strict';
(function() {
	angular.module('app').controller('MenuController', MenuController);

	function MenuController($location, $cookies, $http) {

		var menu = this;

		/* declaração das variáveis  */
		menu.usuario = $cookies.get('nomeusuario');
		menu.notificacoes;
		
		/* declaração métodos */
		menu.logout = logout;
		menu.pegarNotificacoes = pegarNotificacoes;
		
		/* implementação métodos */
		
		function logout(){
			$cookies.putObject('autorizacao', undefined);
			$cookies.putObject('nomeusuario', undefined);
			$location.path('/');
		};
		
		function pegarNotificacoes(){
			menu.notificacoes = [{titulo : '14:00h - Cabelo Cliente X', tipo : 'warning'},{titulo : '14:00h - Unha Cliente X', tipo : 'warning'}]
		};
	}
})();