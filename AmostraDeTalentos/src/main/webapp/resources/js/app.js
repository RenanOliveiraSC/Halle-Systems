(function () {
	angular
		.module('app', [
						'ngRoute', 
			            'ngCookies']);

	angular
		.module('app')
		.config(config)
		.constant('URL_APP', 'localhost:8080/rest');

	angular
		.module('app')
		.run(run);

	function config($routeProvider, $httpProvider) {
		$routeProvider.when('/', {
			templateUrl : 'login.html',
		}).when('/home', {
			templateUrl : 'home.html'
		}).when('/nao-autorizado', {
			templateUrl : 'naoAutorizado.html'
		}).when('/agenda', {
			templateUrl : 'agenda.html'
		}).otherwise({
			redirectTo : '/'
		});
	}
	
	function run($rootScope, $cookies, $location) {
		$rootScope.$on("$routeChangeStart", function(event, next, current) {
			if ($cookies.get('autorizacao') != null) {
				var autorizacao = $cookies.getObject('autorizacao');
				if(!autorizacao) {
					$location.path('/nao-autorizado');
				}				
			} else {
				$location.path("/");
			}
		});
	}
})();