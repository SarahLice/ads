/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Servico extends ItemVenda {
    private Cliente cliente;
    private Funcionario funcionario;
    private TipoServico tipoServico;
    private Status status;
    private LocalDate data;
    private LocalTime horario;

    public Servico(Cliente cliente, Funcionario funcionario, TipoServico tipoServico, Status status, LocalDate data, LocalTime horario) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.tipoServico = tipoServico;
        this.status = status;
        this.data = data;
        this.horario = horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
    
}
