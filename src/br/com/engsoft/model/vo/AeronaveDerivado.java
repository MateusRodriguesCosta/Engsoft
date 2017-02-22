/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.model.vo;

import java.util.Date;

/**
 *
 * @author MATEUS
 */
public class AeronaveDerivado {
    private String partNumber;
    private String fabricanteFornecedor;
    private String modelo;
    private String anoFabricacao;
    private String overhaulRealizados;
    private String overhaulMaximo;
    private Date dataAquisicao;
    private Date dataGarantia;
    private Date dataInstalacao;
    private Date dataUltimaManutencao;
    /**
     * CSN (Ciclos Since New): ciclos realizados 
     * pela célula, motor ou hélice desde a fabricação;
     * 
     * CSO (Cycles Since Overhaul): ciclos realizados
     * pela célula, motor ou hélice desde último overhaul(Check D);
     * 
     * TSN (Time Since New): horas desde
     * fabricação da célula, motor ou hélice;
     * 
     * TSO (Time Since Overhaul): horas desde
     * o último overhaul(Check D).
     */
    private String csn;
    private String cso;
    private String tsn;
    private String tso;
    
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
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

    public String getOverhaulRealizados() {
        return overhaulRealizados;
    }

    public void setOverhaulRealizados(String overhaulRealizados) {
        this.overhaulRealizados = overhaulRealizados;
    }

    public String getOverhaulMaximo() {
        return overhaulMaximo;
    }

    public void setOverhaulMaximo(String overhaulMaximo) {
        this.overhaulMaximo = overhaulMaximo;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataGarantia() {
        return dataGarantia;
    }

    public void setDataGarantia(Date dataGarantia) {
        this.dataGarantia = dataGarantia;
    }

    public Date getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(Date dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
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
}
