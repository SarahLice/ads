/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.model;

public class Equipamento {
    private int codigo;
    private String nome;
    private String descricao;
    private Funcionario funcionario;

    public Equipamento() {
        this.codigo = 0;
        this.nome = null;
        this.descricao = null;
        this.funcionario = null;
    }
    
    public Equipamento(int codigo, String nome, String descricao, Funcionario funcionario) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.funcionario = funcionario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    
}
