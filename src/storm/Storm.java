/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import Interface.Login;

import java.io.File;
import Interface.CadastroUsuario;
import Interface.Previsao;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author hack
 * @author Felipe Batoni
 * 
 */
public class Storm {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException, SAXException, ParserConfigurationException, IOException {
        // TODO code application logic here

        /*        Cidade cidade = new Cidade();
        Previsao prev = new Previsao();
        //cidade.lerArquivo();
        //cidade.LeArray();
        
        Xml xml = new Xml();
        xml.BaixaArquivo("851");
        Document doc;
        doc = xml.Carrega();
        cidade = xml.getXmlCidade(doc);
        
        xml.XmlPrevisao(doc,cidade);
        
        //cidade.arquivo("cidades");
        cidade.LeArray();
        System.out.println(cidade.getNome());
        System.out.println(cidade.getUf());
        System.out.println(cidade.getAtualizacao());
        System.out.println("\n\n");*/

        /*
        System.out.println(prev.getAgitacao());
        System.out.println(prev.getDia());
        System.out.println(prev.getAltura());
        System.out.println(prev.getDirecao());
        System.out.println(prev.getVento());
        System.out.println(prev.getVentoDir());
     for(int a =0 ; a< cidade.prev.size();a++){
	prev = cidade.prev.get(a);
        System.out.println(prev.getAgitacao());
        System.out.println(prev.getDia());
        System.out.println(prev.getAltura());
        System.out.println(prev.getDirecao());
        System.out.println(prev.getVento());
        System.out.println(prev.getVentoDir());
        System.out.println("\n");
    }*/

        //Login login = new Login();  
          // login.setVisible(true); 
       // Previsao previsao = new Previsao();
       // previsao.setVisible(true);
       
    }

}
