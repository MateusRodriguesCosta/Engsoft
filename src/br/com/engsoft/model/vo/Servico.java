/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.model.vo;

/**
 *
 * @author MATEUS
 */
public class Servico {
    /**
     * id: auto-generated no banco de dados.
     */
    private String id;
    private String solicitanteFuncionario;
    private String supervisor;
    private String solicitacao;
    private String setorExecutante;
    private String tipoManutencao;
    private String prioridade;
    private Aeronave aeronave;
    private String centroCusto;
    private Cliente cliente;
    private String localizacao;
    private String prazoEntrega;
    private String execucaoPrevista;
    private String horarioPararAeronave;

    public String getSolicitanteFuncionario() {
        return solicitanteFuncionario;
    }

    public void setSolicitanteFuncionario(String solicitanteFuncionario) {
        this.solicitanteFuncionario = solicitanteFuncionario;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }

    public String getSetorExecutante() {
        return setorExecutante;
    }

    public void setSetorExecutante(String setorExecutante) {
        this.setorExecutante = setorExecutante;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public String getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getExecucaoPrevista() {
        return execucaoPrevista;
    }

    public void setExecucaoPrevista(String execucaoPrevista) {
        this.execucaoPrevista = execucaoPrevista;
    }

    public String getHorarioPararAeronave() {
        return horarioPararAeronave;
    }

    public void setHorarioPararAeronave(String horarioPararAeronave) {
        this.horarioPararAeronave = horarioPararAeronave;
    }    
    
}
