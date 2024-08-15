/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.alvimpl.atestados.entidades;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Alvaro
 */
public class Atestado {

    @Id
    private int id;
    @OneToOne
    public Funcionario funcionario;
    public String nomeMedico;
    public Date dataAtestado;
    public Date dataFinal;
    public int diasAfastamento;
    public Boolean cat;
    @OneToOne
    public Cid cid;
    @OneToOne
    public TipoLicenca tipoLicenca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public Date getDataAtestado() {
        return dataAtestado;
    }

    public void setDataAtestado(Date dataAtestado) {
        this.dataAtestado = dataAtestado;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getDiasAfastamento() {
        return diasAfastamento;
    }

    public void setDiasAfastamento(int diasAfastamento) {
        this.diasAfastamento = diasAfastamento;
    }

    public Boolean getCat() {
        return cat;
    }

    public void setCat(Boolean cat) {
        this.cat = cat;
    }

    public Cid getCid() {
        return cid;
    }

    public void setCid(Cid cid) {
        this.cid = cid;
    }

    public TipoLicenca getTipoLicenca() {
        return tipoLicenca;
    }

    public void setTipoLicenca(TipoLicenca tipoLicenca) {
        this.tipoLicenca = tipoLicenca;
    }

}
