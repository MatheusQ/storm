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
    public ArrayList<String> nomeCidades = new ArrayList<>();

   public Cidade() {

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

    
    public void lerArquivo(){
    try {
      FileReader arq = new FileReader("estados.txt");
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
      while (linha != null) {
        nomeCidades.add(linha);
 
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();
  
    
    
    
    }

    public void LeArray() {
        String mostra;
        for (int a = 0; a < nomeCidades.size(); a++) {

            mostra= nomeCidades.get(a);
            System.out.println(mostra);
        }

    }

    public void AddPrevisao(Previsao p) {
        this.prev.add(p);
    }

}
