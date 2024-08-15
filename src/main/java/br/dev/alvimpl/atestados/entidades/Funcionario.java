/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.alvimpl.atestados.entidades;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *
 * @author Alvaro
 */
class Funcionario {

    @Id
    @PrimaryKeyJoinColumn
    private int id;
    public long cpf;
    public String codMatricula;
    public String nome;
    public long telefone;
    public String email;
    @OneToOne
    public Base base;
    @OneToOne
    public Funcao funcao;
    public String tipoAdmissao;
    public Date dataAdmissao;
    public int cargaHorariaMensal;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public String getTipoAdmissao() {
        return tipoAdmissao;
    }

    public void setTipoAdmissao(String tipoAdmissao) {
        this.tipoAdmissao = tipoAdmissao;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getCargaHorariaMensal() {
        return cargaHorariaMensal;
    }

    public void setCargaHorariaMensal(int cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

}
