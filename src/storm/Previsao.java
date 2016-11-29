/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import java.io.Serializable;

/**
 *
 * @author felipe batoni
 */
public class Previsao {

    private String dia;
    private String agitacao;
    private String altura;
    private String direcao;
    private String vento;
    private String ventoDir;

    public Previsao() {

    }

    public Previsao(String dia, String agitacao, String altura, String direcao, String vento, String ventoDir) {
        this.dia = dia;
        this.agitacao = agitacao;
        this.altura = altura;
        this.direcao = direcao;
        this.vento = vento;
        this.ventoDir = ventoDir;
    }

    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the agitacao
     */
    public String getAgitacao() {
        return agitacao;
    }

    /**
     * @param agitacao the agitacao to set
     */
    public void setAgitacao(String agitacao) {
        this.agitacao = agitacao;
    }

    /**
     * @return the altura
     */
    public String getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }

    /**
     * @return the direcao
     */
    public String getDirecao() {
        return direcao;
    }

    /**
     * @param direcao the direcao to set
     */
    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    /**
     * @return the vento
     */
    public String getVento() {
        return vento;
    }

    /**
     * @param vento the vento to set
     */
    public void setVento(String vento) {
        this.vento = vento;
    }

    /**
     * @return the ventoDir
     */
    public String getVentoDir() {
        return ventoDir;
    }

    /**
     * @param ventoDir the ventoDir to set
     */
    public void setVentoDir(String ventoDir) {
        this.ventoDir = ventoDir;
    }
}
