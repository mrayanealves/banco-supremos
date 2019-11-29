/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.models;

import br.com.models.Funcionario;
import br.com.controles.ControleFuncionario;

/**
 *
 * @author cliente
 */
public class Teste {
    public static void main(String[]args){
        ControleFuncionario c = new ControleFuncionario();
        Funcionario f = null;
        
        f = c.vizualizarFuncionario("1");
        System.out.println(f.toString());
        
        boolean sim = c.atualizarFuncionario("1", "Maria Rayane Ribeiro da Silva Alves", "Assentamento Paraná", "2000", "15");
        
        System.out.println(sim);
        f = c.vizualizarFuncionario("1");
        System.out.println(f.toString());
    }  
}
