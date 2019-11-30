/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.validacoes;

import br.com.controles.ControleFuncionario;
import br.com.controles.ControleGerente;
import br.com.models.Funcionario;
import br.com.verificacao.VerificacaoCampos;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rayane
 */
public class ValidacoesFuncionario {

	/*@ requires cpf != null && !cpf.equals("");
    @ requires nome!= null && !nome.equals("");
    @ requires endereco != null && !endereco.equals("");
    @ requires sexo != null && !sexo.equals("");
    @ requires salario != null && !salario.equals("");
    @ requires cargaH != null && !cargaH.equals("");
    @ requires login != null && !login.equals("");
    @ requires senha != null && !senha.equals("");
    @ requires bon != null && !bon.equals("");
    @ requires gerente != null;
	@*/
    public void cadastrarFuncionario(String cpf, String nome, String endereco, String sexo, String salario, String cargaH, String login, String senha, String bon, boolean gerente) {
        ControleFuncionario cc = new ControleFuncionario();

        boolean existe = false;

        existe = cc.existeFuncionario(cpf);
        if (existe == true) {
            JOptionPane.showMessageDialog(null, "Esse funcionário já está cadastrado no sistema!");
        } else {
            cc.cadastrarFuncionario(cpf, nome, endereco, sexo, salario, cargaH, login, senha);
            int cod = cc.recuperarCodigoFuncionario(cpf);

            if (gerente == true) {
                ControleGerente g = new ControleGerente();

                String valor = bon;

                if (valor == "") {
                    valor = "0";
                }
                g.cadastrarGerente(cod, valor);
            }
        }
    }

    /*@ requires campoNomeFuncionario != null;
	@ requires campoEnderecoFuncionario != null;
	@ requires campoSalarioFuncionario != null;
	@ requires campoCargaHFuncionario != null;
	@ requires campoLoginFuncionario != null;
	@ requires campoSenhaFuncionari != null;
	@ requires campoCpfFuncionario != null;
	@*/
    public boolean validarCamposCadastro(JTextField campoNomeFuncionario, JTextField campoEnderecoFuncionario,
            JTextField campoSalarioFuncionario, JTextField campoCargaHFuncionario,
            JTextField campoLoginFuncionario, JPasswordField campoSenhaFuncionario,
            JFormattedTextField campoCpfFuncionario) {

        VerificacaoCampos c = new VerificacaoCampos();
        boolean sucesso = false;
        boolean vazioTexto = false;
        boolean vazioSenha = false;
        boolean vazioFormatado = false;

        vazioTexto = c.verificarCamposTexto(campoNomeFuncionario, campoEnderecoFuncionario, campoSalarioFuncionario, campoCargaHFuncionario, campoLoginFuncionario);
        vazioSenha = c.verificarCamposSenha(campoSenhaFuncionario);
        vazioFormatado = c.verificarCamposFormatados(campoCpfFuncionario);

        if (vazioTexto == false && vazioFormatado == false && vazioSenha == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }
        return sucesso;
    }

    /*@ requires campoCodFuncionario != null;
	@*/
    public boolean validarCamposCodigo(JTextField campoCodFuncionario) {
        boolean sucesso = false;
        VerificacaoCampos c = new VerificacaoCampos();
        boolean vazio = c.verificarCamposTexto(campoCodFuncionario);

        if (vazio == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }
        return sucesso;
    }

    /*@ requires cod != null && !cod.equals("");
    @ requires nome!= null && !nome.equals("");
    @ requires endereco != null && !endereco.equals("");
    @ requires salario != null && !salario.equals("");
    @ requires cargaH != null && !cargaH.equals("");
	@*/
    public void atualizarFuncionario(String cod, String nome, String endereco, String salario, String cargaH) {
        ControleFuncionario cc = new ControleFuncionario();
        boolean existe;

        existe = cc.existeCodFuncionario(cod);
        if (existe == true) {
            boolean sucesso = false;

            sucesso = cc.atualizarFuncionario(cod, nome, endereco, salario, cargaH);
            if (sucesso == true) {
                JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Atualizar!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!\nVerifique so o código foi digitado corretamente e tente novamente.");
        }
    }

    /*@ requires cod != null && !cod.equals("");
	@*/
    public void deletarFuncionario(String cod) {
        ControleFuncionario cc = new ControleFuncionario();
        boolean existe = false;

        existe = cc.existeCodFuncionario(cod);

        if (existe == true) {
            boolean sucesso = false;

            sucesso = cc.deletarFuncionario(cod);
            if (sucesso == true) {
                JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esse funcionário não está cadastrado no sistema!");
        }
    }

    /*@ requires campoCodFuncionario != null;
   	@*/
    public Funcionario buscarFuncionario(JTextField campoCodFuncionario) {
        Funcionario f = null;
        ControleFuncionario cc = new ControleFuncionario();
        f = cc.vizualizarFuncionario(campoCodFuncionario.getText());

        return f;
    }
}
