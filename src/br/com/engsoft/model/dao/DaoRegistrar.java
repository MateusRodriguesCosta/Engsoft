/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.model.dao;

import br.com.engsoft.model.vo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MATEUS
 */
public class DaoRegistrar {

    public void DaoRegistrar(Object objeto) throws SQLException{
        try (Connection conexao = new DaoBaseDados().getConnection()) {
            PreparedStatement statement;
            
            switch(objeto.getClass().getSimpleName()){
                case "Aeronave":
                    String sqlAeronave = "insert into aeronaves " +
                    "(centroCusto,tipoAeronave,localizacao,unidadeProdutiva," +
                    "proprietario,fabricanteFornecedor,modelo,anoFabricacao," + 
                    "dataAquisicao,dataUltimaManutencao,csn,cso,tsn,tso,"     + 
                    "velocidadeMaxima,autonomiaVoo,capacidadePassageiros,"    +
                    "larguraInterna,alturaInterna,altitude)" +
                    " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    
                    statement = conexao.prepareStatement(sqlAeronave);
                    
                    Aeronave aeronave = (Aeronave) objeto;
                    
                    statement.setString(1,aeronave.getCentroCusto());
                    statement.setString(2,aeronave.getTipoAeronave());
                    statement.setString(3,aeronave.getLocalizacao());
                    statement.setString(4,aeronave.getUnidadeProdutiva());
                    statement.setString(5,aeronave.getProprietario());
                    statement.setString(6,aeronave.getFabricanteFornecedor());
                    statement.setString(7,aeronave.getModelo());
                    statement.setString(8,aeronave.getAnoFabricacao());
                    statement.setString(9,aeronave.getDataAquisicao().toString());
                    statement.setString(10,aeronave.getDataUltimaManutencao().toString());
                    statement.setString(11,aeronave.getCsn());
                    statement.setString(12,aeronave.getCso());
                    statement.setString(13,aeronave.getTsn());
                    statement.setString(14,aeronave.getTso());
                    statement.setString(15,aeronave.getVelocidadeMaxima());
                    statement.setString(16,aeronave.getAutonomiaVoo());
                    statement.setString(17,aeronave.getCapacidadePassageiros());
                    statement.setString(18,aeronave.getLarguraInterna());
                    statement.setString(19,aeronave.getAlturaInterna());
                    statement.setString(20,aeronave.getAltitude());
                    
                    statement.execute();
                    statement.close();
                    //...
                    break;
                case "AeronaveDerivado":
                    String sqlAeronaveDerivado = "insert into "               + 
                    "aeronavesDerivados (partNumber,fabricanteFornecedor,"    +
                    "modelo,anoFabricacao,overhaulRealizados,overhaulMaximo," +
                    "dataAquisicao,dataGarantia,dataInstalacao,"              + 
                    "dataUltimaManutencao,csn,cso,tsn,tso)"                   +                     
                    "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    
                    statement = conexao.prepareStatement(sqlAeronaveDerivado);
                    
                    AeronaveDerivado aeronaveDerivado = 
                    (AeronaveDerivado) objeto;
                    
                    statement.setString(1,aeronaveDerivado.getPartNumber());
                    statement.setString(2,aeronaveDerivado.getFabricanteFornecedor());
                    statement.setString(3,aeronaveDerivado.getModelo());
                    statement.setString(4,aeronaveDerivado.getAnoFabricacao());
                    statement.setString(5,aeronaveDerivado.getOverhaulRealizados());
                    statement.setString(6,aeronaveDerivado.getOverhaulMaximo());
                    statement.setString(7,aeronaveDerivado.getDataAquisicao().toString());
                    statement.setString(8,aeronaveDerivado.getDataGarantia().toString());
                    statement.setString(9,aeronaveDerivado.getDataInstalacao().toString());
                    statement.setString(10,aeronaveDerivado.getDataUltimaManutencao().toString());
                    statement.setString(11,aeronaveDerivado.getCsn());
                    statement.setString(12,aeronaveDerivado.getCso());
                    statement.setString(13,aeronaveDerivado.getTsn());
                    statement.setString(14,aeronaveDerivado.getTso());
                    
                    statement.execute();
                    statement.close();
                    //...
                    break;
                case "AeronaveEscala":
                    String sqlAeronaveEscala = "insert into aeronavesEscalas" + 
                    "(dataInicial,horaInicial,dataFinal,horaFinal)"           +                    
                    "values (?,?,?,?)";
                    
                    statement = conexao.prepareStatement(sqlAeronaveEscala);
                    
                    AeronaveEscala aeronaveEscala = (AeronaveEscala) objeto;
                    
                    statement.setString(1,aeronaveEscala.getDataInicial().toString());
                    statement.setString(2,aeronaveEscala.getHoraInicial());
                    statement.setString(3,aeronaveEscala.getDataFinal().toString());
                    statement.setString(4,aeronaveEscala.getHoraFinal());
                    
                    statement.execute();
                    statement.close();
                    //...
                    break;
                case "AlmoxarifadoEquipamento":
                    String sqlAlmoxarifado = "insert into "                   +
                    "almoxarifadoEquipamentos (material,estoqueMaximo,"       + 
                    "estoqueMinimo,saldo,custo,valorTotal,moeda,unidade,"     +                    
                    "dataValidade)"                                           +
                    "values (?,?,?,?,?,?,?,?,?)";
                    
                    statement = conexao.prepareStatement(sqlAlmoxarifado);
                    
                    AlmoxarifadoEquipamento almoxarifadoEquipamento = 
                    (AlmoxarifadoEquipamento) objeto;
                    
                    statement.setString(1,almoxarifadoEquipamento.getMaterial());
                    statement.setString(2,almoxarifadoEquipamento.getEstoqueMaximo());
                    statement.setString(3,almoxarifadoEquipamento.getEstoqueMinimo());
                    statement.setString(4,almoxarifadoEquipamento.getSaldoString());
                    statement.setString(5,almoxarifadoEquipamento.getCustoString());
                    statement.setString(6,almoxarifadoEquipamento.getValorTotalString());
                    statement.setString(7,almoxarifadoEquipamento.getMoeda());
                    statement.setString(8,almoxarifadoEquipamento.getUnidade());
                    statement.setString(9,almoxarifadoEquipamento.getDataValidade().toString());                    
                    
                    statement.execute();
                    statement.close();
                    //...
                    break;
                case "Cliente":
                    String sqlCliente = "insert into clientes (razaoSocial,"  +
                    "nome,pessoa,cadastroDePessoa,endereco,complemento,"      + 
                    "bairro,cidade,cep,estado,pais,telefone,celular,website," +                    
                    "email)"                                                  +
                    "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    
                    statement = conexao.prepareStatement(sqlCliente);
                    
                    Cliente cliente = (Cliente) objeto;
                    
                    statement.setString(1,cliente.getRazaoSocial());
                    statement.setString(2,cliente.getNome());
                    statement.setString(3,cliente.getPessoa());
                    statement.setString(4,cliente.getCadastroDePessoa());
                    statement.setString(5,cliente.getEndereco());
                    statement.setString(6,cliente.getComplemento());
                    statement.setString(7,cliente.getBairro());
                    statement.setString(8,cliente.getCidade());
                    statement.setString(9,cliente.getCep());                    
                    statement.setString(10,cliente.getEstado());                    
                    statement.setString(11,cliente.getPais());                    
                    statement.setString(12,cliente.getTelefone());                    
                    statement.setString(13,cliente.getCelular());                    
                    statement.setString(14,cliente.getWebsite());                    
                    statement.setString(15,cliente.getEmail());                    
                    
                    statement.execute();
                    statement.close();                    
                    //...
                    break;
                case "Servico":
                    String sqlServico = "insert into servicos ("              +
                    "solicitanteFuncionario,supervisor,solicitacao,"          +
                    "setorExecutante,tipoManutencao,prioridade,aeronave,"     +
                    "centroCusto,cliente,localizacao,prazoEntrega,"           +
                    "execucaoPrevista,horarioPararAeronave)"                  +                    
                    "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    
                    statement = conexao.prepareStatement(sqlServico);
                    
                    Servico servico = (Servico) objeto;
                    
                    statement.setString(1,servico.getSolicitanteFuncionario());
                    statement.setString(2,servico.getSupervisor());
                    statement.setString(3,servico.getSolicitacao());
                    statement.setString(4,servico.getSetorExecutante());
                    statement.setString(5,servico.getTipoManutencao());
                    statement.setString(6,servico.getPrioridade());
                    statement.setString(7,servico.getAeronave().getId());
                    statement.setString(8,servico.getCentroCusto());
                    statement.setString(9,servico.getCliente().getId());                    
                    statement.setString(10,servico.getLocalizacao());                    
                    statement.setString(11,servico.getPrazoEntrega());                    
                    statement.setString(12,servico.getExecucaoPrevista());                    
                    statement.setString(13,servico.getHorarioPararAeronave());                                        
                    
                    statement.execute();
                    statement.close(); 
                    //...
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Objeto inválido: "   + 
                    objeto.getClass().getSimpleName());
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
