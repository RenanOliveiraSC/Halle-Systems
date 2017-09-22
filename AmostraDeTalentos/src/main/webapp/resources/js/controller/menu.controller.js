'use strict';
(function() {
	angular.module('app').controller('MenuController', MenuController);

	function MenuController($location, $cookies, $http) {

		var menu = this;

		/* declaração das variáveis  */
		menu.usuario = $cookies.get('nomeusuario');hjl

	}
})();