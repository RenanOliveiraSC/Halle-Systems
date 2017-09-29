'use strict';
(function() {
	angular.module('app').controller('FuncionariosController',
			FuncionariosController);

	function FuncionariosController($location, $cookies, $http, $scope, FuncionarioService) {

		var funcionario = this;

		/* declaração das variáveis */
		funcionario.filtroNome;
		funcionario.funcionario;
		funcionario.listaFuncionarios;
		
		/* declaração dos métodos */
		funcionario.carregarFuncionarioPeloCodigo = carregarFuncionarioPeloCodigo;
		funcionario.carregarNovoFuncionario = carregarNovoFuncionario;
		funcionario.getFuncionarios = getFuncionarios;
		funcionario.salvar = salvar;
		funcionario.excluir = excluir;
		funcionario.limpar = limpar;

		function carregarFuncionarioPeloCodigo(codigo) {
			FuncionarioService.getFuncionario(codigo).then(function(data) { // success
				funcionario.funcionario = data.data;
			}, function() { // error
				alert("Não foi possível carregar o cadastro do funcionário");
			});
		};

		function carregarNovoFuncionario() {
			funcionario.funcionario = [];
		};

		function getFuncionarios() {
			FuncionarioService.listar().then(function(data) { // success
				funcionario.listaFuncionarios = data.data;
			}, function() {
			});
		};

		function limpar() {
			funcionario.funcionario = [];
		};

		function salvar() {
			if (funcionario.funcionario && funcionario.funcionario.codigo) {
				FuncionarioService.update(funcionario.funcionario).then(
					function(data) { // success
						getFuncionarios();
						alert('Alterado com sucesso');
					}, function() {
					});
			} else {
				FuncionarioService.create(funcionario.funcionario).then(
					function(data) { // success
						getFuncionarios();
						alert('Criado com sucesso');
					}, function() {
					});
			}
		};

		function excluir() {
			FuncionarioService.deletar(codigo).then(function(data) { // success
				getFuncionarios();
				alert('Removido com sucesso');
			}, function() {
			});
		};

	}
})();