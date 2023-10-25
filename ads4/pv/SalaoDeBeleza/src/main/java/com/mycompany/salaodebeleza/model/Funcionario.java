/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private String cargo;
    private float salario;
    private LocalDate dataDeContratacao;
    
    public Funcionario() {
        super();
        cargo = null;
        salario = 0;
        dataDeContratacao = null;
    }

    public Funcionario(String cargo, float salario, LocalDate dataDeContratacao, int codigo, String nome, String endereco, String telefone, String email) {
        super(codigo, nome, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
        this.dataDeContratacao = dataDeContratacao;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(LocalDate dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }
    
}
