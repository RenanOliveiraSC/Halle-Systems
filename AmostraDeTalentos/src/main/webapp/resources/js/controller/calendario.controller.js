'use strict';
(function() {
	angular.module('app').controller('CalendarioController',
			CalendarioController);

	function CalendarioController($location, $cookies, $http, $scope,
			CalendarioService, ClienteService, FuncionarioService,
			ServicoService) {

		var calendario = this;

		/* declaração das variáveis */
		calendario.dataInicio;
		calendario.dataFim;
		calendario.agendamento;
		calendario.clientes;
		calendario.servicos;
		calendario.funcionarios;

		/* declaração dos métodos */
		calendario.init = init;
		calendario.carregarAgendamentoPeloCodigo = carregarAgendamentoPeloCodigo;
		calendario.carregarNovoAgendamento = carregarNovoAgendamento;
		calendario.getClientes = getClientes;
		calendario.getServicos = getServicos;
		calendario.getFuncionarios = getFuncionarios;
		calendario.concluir = concluir;
		calendario.cancelar = cancelar;
		calendario.salvar = salvar;
		calendario.excluir = excluir;
		calendario.limpar = limpar;

		/* implementação dos métodos */

		function init() {
			calendario.getClientes();
			calendario.getServicos();
			calendario.getFuncionarios();
		};

		function carregarAgendamentoPeloCodigo(codigo) {
			CalendarioService.getAgendamento(codigo).then(function(data) { // success
				calendario.agendamento = data.data;
				var date = data.data.data;
				var arraydate = date.split("-");
				var intday = 1+parseInt(arraydate[2]);
				date = arraydate[0]+"-"+arraydate[1]+"-"+intday+"T00:00:00.000Z";
				calendario.agendamento.data = new Date(date);
			}, function() { // error
				alert("Não foi possível carregar o agendamento");
			});
		};

		function carregarNovoAgendamento(day, month, year) {
			if(day && month && year){
				calendario.agendamento = [];
				var date = year+"-"+month+"-"+day+"T00:00:00.000Z";
				calendario.agendamento.data = new Date(date);
				$scope.$apply();
			}
		};

		function getClientes() {
			ClienteService.listarSelect().then(function(data) { // success
				calendario.clientes = data.data;
			}, function() {
			});
		};

		function getServicos() {
			ServicoService.listarSelect().then(function(data) { // success
				calendario.servicos = data.data;
			}, function() {
			});
		};

		function getFuncionarios() {
			FuncionarioService.listarSelect().then(function(data) { // success
				calendario.funcionarios = data.data;
			}, function() {
			});
		};

		function limpar() {
			calendario.agendamento = [];
		};

		function concluir() {
			CalendarioService.concluir(calendario.agendamento.codigo).then(
					function(data) {
						$("#calendar").fullCalendar("refetchEvents");
						alert('Concluído com sucesso');
					}, function() {
					});
		};

		function cancelar() {
			CalendarioService.cancelar(calendario.agendamento.codigo).then(function(data) { // success
				$("#calendar").fullCalendar("refetchEvents");
				alert('Cancelado com sucesso');
			}, function() {
			});
		};

		function salvar() {
			if (calendario.agendamento && calendario.agendamento.codigo) {
				CalendarioService.update(calendario.agendamento).then(
					function(data) { // success
						$("#calendar").fullCalendar("refetchEvents");
						alert('Alterado com sucesso');
					}, function() {
					});
			} else {
				var agendamento = {codigoCliente : calendario.agendamento.codigoCliente, codigoFuncionario : calendario.agendamento.codigoFuncionario, 
					codigoServico : calendario.agendamento.codigoServico, data : calendario.agendamento.data.toString(), observacao : calendario.agendamento.observacao};
				CalendarioService.create(agendamento).then(
					function(data) { // success
						$("#calendar").fullCalendar("refetchEvents");
						alert('Criado com sucesso');
					}, function() {
					});
			}
		};

		function excluir() {
			CalendarioService.deletar(calendario.agendamento.codigo).then(function(data) { // success
				$("#calendar").fullCalendar("refetchEvents");
				alert('Removido com sucesso');
			}, function() {
			});
		};

		calendario.init();

	}
})();