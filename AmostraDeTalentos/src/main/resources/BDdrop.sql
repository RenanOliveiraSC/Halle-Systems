ALTER TABLE CIDADE DROP CONSTRAINT FK_ESTADO_CIDADE;
ALTER TABLE ENDERECO DROP CONSTRAINT FK_CIDADE_ENDERECO;
ALTER TABLE FORNECEDOR DROP CONSTRAINT FK_TIPF_FORNECEDOR;
ALTER TABLE FORNECEDOR DROP CONSTRAINT FK_ENDERECO_FORNECEDOR;
ALTER TABLE CLIENTE DROP CONSTRAINT FK_TIPC_CLIENTE; 
ALTER TABLE CLIENTE DROP CONSTRAINT FK_ENDERECO_CLIENTE;
ALTER TABLE FUNCIONARIO DROP CONSTRAINT FK_TIPO_FUNCIONARIO;
ALTER TABLE PRODUTO DROP CONSTRAINT FK_FAMILIA_PRODUTO; 
ALTER TABLE PRODUTO DROP CONSTRAINT FK_FABRICANTE_PRODUTO;
ALTER TABLE ESTADO DROP CONSTRAINT FK_PAIS_ESTADO;
ALTER TABLE SERVICO DROP CONSTRAINT FK_FAMILIA_SERVICO;
ALTER TABLE SALVA_AGENDA DROP CONSTRAINT FK_SALVA_AGENDA;
ALTER TABLE SALVA_AGENDA DROP CONSTRAINT FK_SALVA_CLIENTE;
ALTER TABLE SALVA_AGENDA DROP CONSTRAINT FK_SALVA_FUNCIONARIO;
ALTER TABLE SALVA_AGENDA DROP CONSTRAINT FK_SALVA_SP;
ALTER TABLE SERVICO_PRODUTO DROP CONSTRAINT FK_SP_SERVICO;
ALTER TABLE SERVICO_PRODUTO DROP CONSTRAINT FK_SP_PRODUTO;
ALTER TABLE CAIXA DROP CONSTRAINT FK_CAIXA_SALVA_AGENDA;
ALTER TABLE CAIXA DROP CONSTRAINT FK_CAIXA_FORMA;
ALTER TABLE CONTAS_RECEBER DROP CONSTRAINT FK_CAR_CAIXA;
ALTER TABLE PRODUTO DROP CONSTRAINT FK_PRODUTO_LISTA;
ALTER TABLE PRODUTO DROP CONSTRAINT FK_PRODUTO_DEPOSITO;
ALTER TABLE SERVICO DROP CONSTRAINT FK_SERVICO_LISTA;
ALTER TABLE NOTA_DE_COMPRA DROP CONSTRAINT FK_NOTA_FORNECEDOR;
ALTER TABLE NOTA_DE_COMPRA DROP CONSTRAINT FK_NOTA_PRODUTO;
ALTER TABLE NOTA_DE_COMPRA DROP CONSTRAINT FK_NOTA_FORMA;
ALTER TABLE CONTAS_A_PAGAR DROP CONSTRAINT FK_CAP_FORNECEDOR;
ALTER TABLE CONTAS_A_PAGAR DROP CONSTRAINT FK_CAP_FORMA;
ALTER TABLE LANCAMENTO_CONTABIL DROP CONSTRAINT FK_LC_CAP;
ALTER TABLE LANCAMENTO_CONTABIL DROP CONSTRAINT FK_LC_CAR;
ALTER TABLE LANCAMENTO_CONTABIL_LINHAS DROP CONSTRAINT FK_LCL_LC;
ALTER TABLE LANCAMENTO_CONTABIL_LINHAS DROP CONSTRAINT FK_LCL_CONTA;

DROP TABLE PAIS;
DROP TABLE ESTADO;
DROP TABLE CIDADE;
DROP TABLE ENDERECO;
DROP TABLE TIPO_FORNECEDOR;
DROP TABLE TIPO_CLIENTE;
DROP TABLE FORNECEDOR;
DROP TABLE CLIENTE;
DROP TABLE USUARIO_LOGIN;
DROP TABLE TIPO_FUNCIONARIO;
DROP TABLE FUNCIONARIO;
DROP TABLE FABRICANTE;
DROP TABLE FAMILIA;
DROP TABLE LISTA_DE_PRECO;
DROP TABLE DEPOSITO;
DROP TABLE PRODUTO;
DROP TABLE SERVICO;
DROP TABLE AGENDA;
DROP TABLE SALVA_AGENDA;
DROP TABLE SERVICO_PRODUTO;
DROP TABLE FORMA_PAGAMENTO;
DROP TABLE CAIXA;
DROP TABLE CONTAS_RECEBER;
DROP TABLE NOTA_DE_COMPRA;
DROP TABLE CONTAS_A_PAGAR;
DROP TABLE LANCAMENTO_CONTABIL;
DROP TABLE PLANO_DE_CONTAS;
DROP TABLE LANCAMENTO_CONTABIL_LINHAS;

DROP SEQUENCE SEQ_PAIS;
DROP SEQUENCE SEQ_ESTADO;
DROP SEQUENCE SEQ_CIDADE;
DROP SEQUENCE SEQ_ENDERECO;
DROP SEQUENCE SEQ_TIPO_FORNECEDOR;
DROP SEQUENCE SEQ_TIPO_CLIENTE;
DROP SEQUENCE SEQ_FORNECEDOR;
DROP SEQUENCE SEQ_CLIENTE;
DROP SEQUENCE SEQ_USUARIO_LOGIN;
DROP SEQUENCE SEQ_TIPO_FUNCIONARIO;
DROP SEQUENCE SEQ_FUNCIONARIO;
DROP SEQUENCE SEQ_FABRICANTE;
DROP SEQUENCE SEQ_FAMILIA;
DROP SEQUENCE SEQ_PRODUTO;
DROP SEQUENCE SEQ_SERVICO;
DROP SEQUENCE SEQ_AGENDA;
DROP SEQUENCE SEQ_SALVA_AGENDA;
DROP SEQUENCE SEQ_SERVICO_PRODUTO;
DROP SEQUENCE SEQ_FORMA_PAGAMENTO;
DROP SEQUENCE SEQ_CAIXA;
DROP SEQUENCE SEQ_CONTAS_RECEBER;
DROP SEQUENCE SEQ_LISTA_DE_PRECO;
DROP SEQUENCE SEQ_DEPOSITO;
DROP SEQUENCE SEQ_NOTA;
DROP SEQUENCE SEQ_CAP;
DROP SEQUENCE SEQ_LC;
DROP SEQUENCE SEQ_CONTA;
DROP SEQUENCE SEQ_LCL;