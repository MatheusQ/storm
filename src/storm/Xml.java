/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
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
 * @author j155993
 */
public class Xml {

//################### NOVAS FUNÇÕES ##################                    
    public Document BaixaArquivo(String cod) throws MalformedURLException, IOException, SAXException, ParserConfigurationException {
        URL url = new URL("http://servicos.cptec.inpe.br/XML/cidade/"+cod+"/todos/tempos/ondas.xml");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        while (reader.ready()) {
            String line = reader.readLine();
            EscreveXml(line);
        }
        return Carrega();
    }

    public void EscreveXml(String line) {
        try {
            // Criar arquivo 
            FileWriter fstream = new FileWriter("out.xml");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(line);
            // Fechar output stream
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    //função para gerar o arquivo xml e passar para outros objetos carregarem a informação no obj previsao
    public Document Carrega() throws SAXException, ParserConfigurationException, IOException {
        File inputFile = new File("out.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);

        doc.getDocumentElement().normalize();

        return doc;

    }

    public String XmlGetNome(Element eElementc) {
        String nome;
        nome = eElementc.getElementsByTagName("nome").item(0).getTextContent();
        return nome;

    }

    public String XmlGetUf(Element eElementc) {
        String uf;

        uf = eElementc.getElementsByTagName("uf").item(0).getTextContent();
        return uf;
    }

    public String XmlGetAtualizacao(Element eElementc) {

        String atu;

        atu = eElementc.getElementsByTagName("atualizacao").item(0).getTextContent();
        return atu;

    }

    public Cidade getXmlCidade(Document doc) {
        Cidade city = new Cidade();

        NodeList nListc = doc.getElementsByTagName("cidade");

        for (int tempc = 0; tempc < nListc.getLength(); tempc++) {
            Node nNodec = nListc.item(tempc);

            if (nNodec.getNodeType() == Node.ELEMENT_NODE) {
                Element eElementc = (Element) nNodec;

                //System.out.println("nome: " + XmlGetNome(eElementc));
                city.setNome(XmlGetNome(eElementc));
                //System.out.println("UF: " + XmlGetUf(eElementc));
                city.setUf(XmlGetUf(eElementc));
                //System.out.println("Atualizacão: " + XmlGetAtualizacao(eElementc));
                city.setAtualizacao(XmlGetAtualizacao(eElementc));

                //System.out.println("\n");

            }

        }
        return city;
    }

    public void XmlPrevisao(Document doc, Cidade city) {
       // Previsao objPrevisao = new Previsao();
        
        
        NodeList nList = doc.getElementsByTagName("previsao");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            Previsao objPrevisao = new Previsao();
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

               // System.out.println("agitacao: " + XmlGetAgitacao(eElement));
                objPrevisao.setAgitacao(XmlGetAgitacao(eElement));

               // System.out.println("Dia: " + XmlGetDia(eElement));
                objPrevisao.setDia(XmlGetDia(eElement));

               // System.out.println("Altura: " + XmlGetAltura(eElement));
                objPrevisao.setAltura(XmlGetAltura(eElement));

                //System.out.println("Direcao: " + XmlGetDirecao(eElement));
                objPrevisao.setDirecao(XmlGetDirecao(eElement));

                //System.out.println("Vento: " + XmlGetVento(eElement));
                objPrevisao.setVento(XmlGetVento(eElement));
                
                //System.out.println("Vento_Dir: " + XmlGetVentoDir(eElement));
                objPrevisao.setVentoDir(XmlGetVentoDir(eElement));
                

                //System.out.println("\n\n");
                city.AddPrevisao(objPrevisao);

            }
        }
        return ;
    }

    public String XmlGetCidade(Element eElement) {
        String cidade;
        cidade = eElement.getAttribute("cidade");

        return cidade;
    }

    public String XmlGetAgitacao(Element eElement) {
        String agitacao;

        agitacao = eElement.getElementsByTagName("agitacao").item(0).getTextContent();

        return agitacao;
    }

    public String XmlGetDia(Element eElement) {
        String dia;
        dia = eElement.getElementsByTagName("dia").item(0).getTextContent();
        return dia;
    }

    public String XmlGetAltura(Element eElement) {
        String altura;

        altura = eElement.getElementsByTagName("altura").item(0).getTextContent();

        return altura;
    }

    public String XmlGetDirecao(Element eElement) {
        String direcao;

        direcao = eElement.getElementsByTagName("direcao").item(0).getTextContent();

        return direcao;
    }

    public String XmlGetVento(Element eElement) {
        String vento;

        vento = eElement.getElementsByTagName("vento").item(0).getTextContent();

        return vento;
    }

    public String XmlGetVentoDir(Element eElement) {
        String vento_dir;

        vento_dir = eElement.getElementsByTagName("vento_dir").item(0).getTextContent();

        return vento_dir;
    }

}
