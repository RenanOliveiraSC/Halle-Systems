'use strict';
(function() {
	angular.module('app').controller('PerfilController',
			PerfilController);

	function PerfilController($location, $cookies, $http, $scope) {

		var perfil = this;

		/* declaração das variáveis */
		perfil.perfil;

		/* declaração dos métodos */
		perfil.init = init;

		function init(){
			perfil.perfil= $cookies.getObject('autorizacao').data;
		};
		
		perfil.init();

	}
})();