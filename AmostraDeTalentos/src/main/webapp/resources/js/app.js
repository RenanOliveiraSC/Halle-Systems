(function() {
	angular.module('app', [ 'ngRoute', 'ngCookies' ]);

	angular.module('app').config(config);
	
	angular.module('app').run(run);

	// AQUI CRIA E CONFIGURA A ROTA DO SITE //
	function config($routeProvider, $httpProvider, $locationProvider) {
		$locationProvider.hashPrefix('');
		$routeProvider.when('/', {
			templateUrl : 'login.html'
		}).when('/home', {
			templateUrl : 'home.html'
		}).when('/nao-autorizado', {
			templateUrl : 'naoAutorizado.html'
		}).when('/agenda', {
			templateUrl : 'calendario.html'
		}).when('/cliente', {
			templateUrl : 'clientes.html'
		}).when('/fornecedor', {
			templateUrl : 'funcionarios.html'
		}).when('/perfil', {
			templateUrl : 'calendario.html'
		}).when('/configuracoes', {
			templateUrl : 'calendario.html'
		}).otherwise({
			redirectTo : '/'
		});
	}

	function run($rootScope, $cookies, $location) {
		$rootScope.$on("$routeChangeStart", function(event, next, current) {
			if ($cookies.get('autorizacao') != null) {
				var autorizacao = $cookies.getObject('autorizacao');
				if (!autorizacao) {
					$location.path('/nao-autorizado');
				}
			} else {
				$location.path("/");
			}
		});
	}
})();