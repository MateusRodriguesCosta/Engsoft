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
public class AlmoxarifadoEquipamento {
    private String material;
    private String estoqueMaximo;
    private String estoqueMinimo;
    /**
     * Saldo: Quantidade de material disponivel;
     * Custo: valor do material;
     * Valor Total: Saldo*Custo;
     * Moeda: UN, US, R$ e etc;
     * Unidade: Litros, Metros, Unidades, Balde e etc.
     */
    private float saldo;
    private float custo;
    private float valorTotal;    
    private String moeda;    
    private String unidade;
    private Date dataValidade;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(String estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(String estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public String getSaldoString() {
        return String.valueOf(saldo);
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getCusto() {
        return custo;
    }
    
    public String getCustoString() {
        return String.valueOf(custo);
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getValorTotal() {
        return valorTotal;
    }
    
    public String getValorTotalString() {
        return String.valueOf(valorTotal);
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    
}
