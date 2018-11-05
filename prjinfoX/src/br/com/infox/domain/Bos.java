package br.com.infox.domain;

import java.util.Date;

public class Bos {

    private Integer idOs;
    private Date dataOs;
    private String tipo;
    private String situacao;
    private String equipamento;
    private String defeito;
    private String servico;
    private String tecnico;
    private double valor;
    private Integer idCliente;

    public Integer getIdOs() {
        return idOs;
    }

    public void setIdOs(Integer idOs) {
        this.idOs = idOs;
    }

    public Date getDataOs() {
        return dataOs;
    }

    public void setDataOs(Date dataOs) {
        this.dataOs = dataOs;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Bos{" + "idOs=" + 
                idOs + ", dataOs=" + 
                dataOs + ", tipo=" +
                tipo + ", situacao=" + 
                situacao + ", equipamento=" + 
                equipamento + ", defeito=" + 
                defeito + ", servico=" + 
                servico + ", tecnico=" + 
                tecnico + ", valor=" + 
                valor + ", idCliente=" + 
                idCliente + '}';
    }

}
