/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.controller;

import com.mycompany.salaodebeleza.model.Cliente;
import com.mycompany.salaodebeleza.model.Funcionario;
import com.mycompany.salaodebeleza.model.Pessoa;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciaPessoa {

    private ArrayList<Pessoa> pessoas;
    private Integer codigoCliente;
    private Integer codigoFuncionario;

    public GerenciaPessoa(ArrayList<Pessoa> p) {
        pessoas = p;
        codigoCliente = 1;
        codigoFuncionario = 1;
    }

    public void gerarCodigoCliente() {
        codigoCliente += 1;
    }

    public void gerarCodigoFuncionario() {
        codigoFuncionario += 1;
    }

    public String getCodigoCliente() {
        return codigoCliente.toString();
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario.toString();
    }

    public Funcionario getFuncionario(int cod) {
        for (Pessoa p : pessoas) {
            if (p instanceof Funcionario) {
                if (p.getCodigo() == cod) {
                    return (Funcionario) p;
                }
            }
        }
        return null;
    }

    public boolean temFuncionario() {
        for (Pessoa p : pessoas) {
            if (p instanceof Funcionario) {
                return true;
            }
        }
        return false;
    }
    
    public boolean inserirCliente(int codigo, String nome, String endereco, String telefone, String email, boolean eVip) {
        Cliente cliente = new Cliente(eVip, codigo, nome, endereco, telefone, email);

        pessoas.add(cliente);

        return true;
    }

    public boolean inserirFuncionario(String cargo, float salario, LocalDate data, int codigo, String nome, String endereco, String telefone, String email) {
        Funcionario funcionario = new Funcionario(cargo, salario, data, codigo, nome, endereco, telefone, email);

        pessoas.add(funcionario);

        return true;
    }
}
