/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import java.awt.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felipe Batoni
 */
@XmlRootElement (name="cidade")
public class Cidade {
    private String nome;
    private String uf;
    private String atualizacao;
    private ArrayList<Previsao> prev;
}
teste