CREATE TABLE FUNCIONARIO(
 	cod_func serial,
 	cpf_funcionario Char(14) Unique,
	nome Varchar(100),
	endereco Varchar(500),
	sexo Char(1),
	salario float,
	cargaH Int,
	login Varchar(50) Unique,
	senha Char(8) Unique,
     
	PRIMARY KEY(cod_func)
);

CREATE TABLE GERENTE(
	cod_func Int,
     bonificacao float
);
-- 
Insert into FUNCIONARIO (cpf_funcionario, nome, endereco, sexo, salario, cargaH, login, senha) values ('700.724.284-73', 'Maria Rayane', 'Assentamento Paraná', 'F', 4000, 10, 'AlvesRayane', '123456');
Insert into GERENTE values (1, 400);
-- 
 CREATE TABLE CLIENTE(
 	cpf_cliente Char(14),
     nome Varchar(100),
     endereco Varchar(500),
     sexo Char(1),
     
     PRIMARY KEY(cpf_cliente)    
 );
-- 
 Insert into CLIENTE values ('700.724.284-73', 'Maria Rayane Ribeiro', 'Assentamento Paraná', 'F');
-- 
 CREATE TABLE CONTA(
 	num_conta serial,
     senha Char(8) unique,
     saldo float,
     cpf_cliente Char(14),
     bloqueada boolean,
     
     PRIMARY KEY(num_conta)
 );
-- 
 Insert into CONTA (senha, cpf_cliente) values ('1234567', '700.724.284-73'); 
-- 
CREATE TABLE REALIZA(
 	num_conta Int,
     num_oper Int,
     valor float,
 	dt_oper varchar(11),
     horario_oper Varchar(8),
     
     PRIMARY KEY(num_conta, num_oper, dt_oper, horario_oper)
 );
-- 
 CREATE TABLE OPERACOES(
 	num_oper Int,
     tipo varchar(10),
 	PRIMARY KEY(num_oper)
 );
-- 
 Insert into OPERACOES values (1, 'Saque');
 Insert into OPERACOES values (2, 'Depósito');
Insert into OPERACOES values (3, 'Transf');
 
ALTER TABLE CONTA ADD CONSTRAINT fk_cliente_1 FOREIGN KEY (cpf_cliente) 
REFERENCES CLIENTE (cpf_cliente) 
ON DELETE CASCADE 
ON UPDATE CASCADE;

ALTER TABLE REALIZA ADD CONSTRAINT fk_conta_2 FOREIGN KEY (num_conta) 
REFERENCES CONTA (num_conta) 
ON DELETE CASCADE 
ON UPDATE CASCADE;

ALTER TABLE REALIZA ADD CONSTRAINT FK_oper_2 FOREIGN KEY (num_oper) 
REFERENCES OPERACOES (num_oper) 
ON DELETE CASCADE 
ON UPDATE CASCADE;

ALTER TABLE GERENTE ADD CONSTRAINT FK_gerente FOREIGN KEY (cod_func) 
REFERENCES FUNCIONARIO (cod_func) 
ON DELETE CASCADE 
ON UPDATE CASCADE;




