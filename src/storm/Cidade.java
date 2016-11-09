/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Felipe Batoni
 * @author Joseffer Leite
 */
@XmlRootElement(name = "cidade")
public class Cidade implements Serializable {

    private String nome;
    private String uf;
    private String atualizacao;
    public ArrayList<Previsao> prev = new ArrayList<>();;
    private ArrayList<String> nomeCidades = new ArrayList<>();

    Cidade() {

    }

    public Cidade(String nome, String uf, String atualizacao) {
        this.nome = nome;
        this.uf = uf;
        this.atualizacao = atualizacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return this.uf;
    }

    public void setAtualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }

    public String getAtualizacao() {
        return this.atualizacao;
    }


    public void LeArray() {

        for (int a = 0; a <= nomeCidades.size(); a++) {

            System.out.println(nomeCidades.get(a));
        }

    }

    public void AddPrevisao(Previsao p) {
        this.prev.add(p);
    }

}
