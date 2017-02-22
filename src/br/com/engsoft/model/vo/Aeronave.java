/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.model.vo;

import java.util.List;
import java.util.Date;

/**
 *
 * @author MATEUS
 */
public class Aeronave {
    /**
     * id: auto-generated no banco de dados;
     * 
     * Centro de Custo: Departamento ou setor da 
     * empresa no qual é responsável pelos 
     * gastos (custos) daquela aeronave.     
     */
    private String id;
    private String centroCusto;
    private String tipoAeronave;    
    private String localizacao;
    private String unidadeProdutiva;
    private String proprietario;
    private String fabricanteFornecedor;
    private String modelo;
    private String anoFabricacao;
    private Date dataAquisicao;
    private Date dataUltimaManutencao;
    /**
     * CSN (Ciclos Since New): ciclos realizados 
     * pela aeronave desde a fabricação;
     * 
     * CSO (Cycles Since Overhaul): ciclos realizados
     * pela aeronave desde último overhaul(Check D);
     * 
     * TSN (Time Since New): horas desde
     * fabricação da aeronave;
     * 
     * TSO (Time Since Overhaul): horas desde
     * o último overhaul(Check D).
     */
    private String csn;
    private String cso;
    private String tsn;
    private String tso;
    private String velocidadeMaxima;
    private String autonomiaVoo;
    private String capacidadePassageiros;
    private String larguraInterna;
    private String alturaInterna;
    private String altitude;
    private List<AeronaveDerivado> derivados;
    private List<AeronaveEscala> escalas;
    
    public String getId() {
        return id;
    }
    
    public String getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getUnidadeProdutiva() {
        return unidadeProdutiva;
    }

    public void setUnidadeProdutiva(String unidadeProdutiva) {
        this.unidadeProdutiva = unidadeProdutiva;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getFabricanteFornecedor() {
        return fabricanteFornecedor;
    }

    public void setFabricanteFornecedor(String fabricanteFornecedor) {
        this.fabricanteFornecedor = fabricanteFornecedor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Date dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    public String getCsn() {
        return csn;
    }

    public void setCsn(String csn) {
        this.csn = csn;
    }

    public String getCso() {
        return cso;
    }

    public void setCso(String cso) {
        this.cso = cso;
    }

    public String getTsn() {
        return tsn;
    }

    public void setTsn(String tsn) {
        this.tsn = tsn;
    }

    public String getTso() {
        return tso;
    }

    public void setTso(String tso) {
        this.tso = tso;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getAutonomiaVoo() {
        return autonomiaVoo;
    }

    public void setAutonomiaVoo(String autonomiaVoo) {
        this.autonomiaVoo = autonomiaVoo;
    }

    public String getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(String capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getLarguraInterna() {
        return larguraInterna;
    }

    public void setLarguraInterna(String larguraInterna) {
        this.larguraInterna = larguraInterna;
    }

    public String getAlturaInterna() {
        return alturaInterna;
    }

    public void setAlturaInterna(String alturaInterna) {
        this.alturaInterna = alturaInterna;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public List<AeronaveDerivado> getDerivados() {
        return derivados;
    }

    public void setDerivados(List<AeronaveDerivado> derivados) {
        this.derivados = derivados;
    }

    public List<AeronaveEscala> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<AeronaveEscala> escalas) {
        this.escalas = escalas;
    }    
}
