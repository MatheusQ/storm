/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import java.io.File;
import java.io.IOException;
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
    
    //função para gerar o arquivo xml e passar para outros objetos carregarem a informação no obj previsao
    public Document Carrega() throws SAXException, ParserConfigurationException, IOException{
                 File inputFile = new File("ondas.xml");
         DocumentBuilderFactory dbFactory  = DocumentBuilderFactory.newInstance();
         
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         
         doc.getDocumentElement().normalize();
      
         
         return doc;
               
        
    }
    
                    
                    
                    
                    
                    
                    
                    
      public  void Cidade(Document doc){
         
         System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
         //__________________________
         NodeList nListc = doc.getElementsByTagName("cidade");
         
         System.out.println("----------------------------");
         
         for (int tempc = 0; tempc < nListc.getLength(); tempc++) {
            Node nNodec = nListc.item(tempc);
            System.out.println("\nCurrent Element :" + nNodec.getNodeName());
            if (nNodec.getNodeType() == Node.ELEMENT_NODE) {
                 Element eElementc = (Element) nNodec;
                 
                 //Cida
                 System.out.println("nome " + XmlGetNome(eElementc) ); 
               // System.out.println("UF " + eElementc.getElementsByTagName("uf").item(0)
                //.getTextContent());
                System.out.println("UF "+XmlGetUf(eElementc)); 
                
                //System.out.println("Atualizacao " + eElementc.getElementsByTagName("atualizacao").item(0)
                //.getTextContent());
                System.err.println("Atualizacão"+XmlGetAtualizacao(eElementc));
                
                 
            }
           
        }
         
         
       
         
      }
      
      
      public String XmlGetNome(Element eElementc ){
                           String nome;
                           nome=eElementc.getElementsByTagName("nome").item(0).getTextContent();
                           return nome;
                           
                
      }
      
      
        public String XmlGetUf(Element eElementc ){
                        String uf;
            
                       uf = eElementc.getElementsByTagName("uf").item(0).getTextContent();
                       return uf;
        }
      
        
        public String XmlGetAtualizacao(Element eElementc ){
         
                        String atu;
                                                
                        atu= eElementc.getElementsByTagName("atualizacao").item(0).getTextContent();                        
                        return atu;
                        
                        
        }
                            
        
        
      
      public void XmlPrvisao(Document doc){
      
         NodeList nList = doc.getElementsByTagName("previsao");
         
         System.out.println("----------------------------");
         
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               //System.out.println("Cidade " + eElement.getAttribute("cidade"));
              // System.out.println("agitacao " + eElement.getElementsByTagName("agitacao").item(0)
               // .getTextContent());
              // System.out.println("Dia : " + eElement
               //   .getElementsByTagName("dia").item(0).getTextContent());
              // System.out.println("agitacao " + eElement.getElementsByTagName("agitacao").item(0)
               //   .getTextContent());
               System.out.println("altura : " + eElement.getElementsByTagName("altura").item(0)
                  .getTextContent());
                System.out.println("Direcao : " + eElement.getElementsByTagName("direcao").item(0)
                  .getTextContent());
                 System.out.println("Vento : " + eElement.getElementsByTagName("vento").item(0)
                  .getTextContent());
                  System.out.println("altura : " + eElement.getElementsByTagName("altura").item(0)
                  .getTextContent());
            }
         }
      }
      
      
      
      public String XmlGetCidade(Element eElement){
          String cidade;
                    cidade=eElement.getAttribute("cidade");
      
            return cidade;
      }
      
      
       public String XmlGetAgitacao(Element eElement){
                String agitacao;
          
                 agitacao=eElement.getElementsByTagName("agitacao").item(0).getTextContent();
          
                 return agitacao;
                  }
       
       
       
       public String XmlGetDia(Element eElement){
                String dia;
                 dia=eElement.getElementsByTagName("dia").item(0).getTextContent();
                return dia;
       }
       
       
       public String XmlGetAltura(Element eElement){
            String altura;
       
         altura= eElement.getElementsByTagName("altura").item(0).getTextContent();
       
       
            return altura;
       }
      
      
      }

    
    
    
    
    
    
    
    
    
    

