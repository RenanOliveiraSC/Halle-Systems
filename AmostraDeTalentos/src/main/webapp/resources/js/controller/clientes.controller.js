'use strict';
(function() {
	angular.module('app').controller('ClientesController',
			ClientesController);

	function ClientesController($location, $cookies, $http, $scope, ClienteService) {

		var cliente = this;

		/* declaração das variáveis */
		cliente.filtroNome;
		cliente.cliente;
		cliente.listaClientes;
		
		/* declaração dos métodos */
		cliente.init = init;
		cliente.carregarClientePeloCodigo = carregarClientePeloCodigo;
		cliente.carregarNovoCliente = carregarNovoCliente;
		cliente.getClientes = getClientes;
		cliente.salvar = salvar;
		cliente.excluir = excluir;
		cliente.limpar = limpar;

		function init(){
			getClientes();
		};
		
		function carregarClientePeloCodigo(codigo) {
			ClienteService.getCliente(codigo).then(function(data) { // success
				cliente.cliente = data.data;
			}, function() { // error
				alert("Não foi possível carregar o cadastro do cliente");
			});
		};

		function carregarNovoCliente() {
			cliente.cliente = [];
		};

		function getClientes() {
			ClienteService.listar().then(function(data) { // success
				cliente.listaClientes = data.data;
			}, function() {
			});
		};

		function limpar() {
			cliente.cliente = [];
		};

		function salvar() {
			if (cliente.cliente && cliente.cliente.codigo) {
				ClienteService.update(cliente.cliente).then(
					function(data) { // success
						getClientes();
						alert('Alterado com sucesso');
					}, function() {
					});
			} else {
				ClienteService.create(cliente.cliente).then(
					function(data) { // success
						getClientes();
						alert('Criado com sucesso');
					}, function() {
					});
			}
		};

		function excluir() {
			ClienteService.deletar(codigo).then(function(data) { // success
				getClientes();
				alert('Removido com sucesso');
			}, function() {
			});
		};
		
		cliente.init();

	}
})();