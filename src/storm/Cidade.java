/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import storm.Previsao;
import java.awt.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Felipe Batoni
 */

@XmlRootElement(name = "cidade")
public class Cidade implements Serializable {    
    private String nome;
    private String uf;
    private String atualizacao;
    public ArrayList<Previsao> prev;

    public Cidade() {
    }
    
    

    public Cidade(String nome, String uf, String atualizacao) {
        this.nome = nome;
        this.uf = uf;
        this.atualizacao = atualizacao;
    }

    public void nome(String nome) {
        this.nome = nome;
    }

    public void uf(String uf) {
        this.uf = uf;
    }

    public void atualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }

    public void getXml() {
        
    }
    
    public String getNome(){
    
        return nome;
    }
}
