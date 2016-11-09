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
    //private ArrayList<Previsao> prev;
    private ArrayList<String> nomeCidades = new ArrayList<>();
    

     Cidade() {
        
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

public void arquivo(String nome){
    try {
      FileReader arq = new FileReader(nome);
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
    
    public void LeArray(){
    
        for(int a = 0 ; a <= nomeCidades.size();a++) {
            
            System.out.println(nomeCidades.get(a));
        }
  
    
    }
    
    
    }
    

