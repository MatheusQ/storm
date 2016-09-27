/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;
import Interface.Login;
import java.io.File;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author hack
 */
public class Storm {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException {
        // TODO code application logic here
        
            
      try {	
         File inputFile = new File("ondas.xml");
         DocumentBuilderFactory dbFactory  = DocumentBuilderFactory.newInstance();
         
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         
         doc.getDocumentElement().normalize();
         
         System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
         //__________________________
         NodeList nListc = doc.getElementsByTagName("cidade");
         
         System.out.println("----------------------------");
         
         for (int tempc = 0; tempc < nListc.getLength(); tempc++) {
            Node nNodec = nListc.item(tempc);
            System.out.println("\nCurrent Element :" + nNodec.getNodeName());
            if (nNodec.getNodeType() == Node.ELEMENT_NODE) {
                 Element eElementc = (Element) nNodec;
                System.out.println("Nome " + eElementc.getElementsByTagName("nome").item(0)
                .getTextContent());
                System.out.println("UF " + eElementc.getElementsByTagName("uf").item(0)
                .getTextContent());
                System.out.println("Atualizacao " + eElementc.getElementsByTagName("atualizacao").item(0)
                .getTextContent());
                 
            }
           
            }
         NodeList nList = doc.getElementsByTagName("previsao");
         
         System.out.println("----------------------------");
         
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Cidade " + eElement.getAttribute("cidade"));
               System.out.println("agitacao " + eElement.getElementsByTagName("agitacao").item(0)
                .getTextContent());
               System.out.println("Dia : " + eElement
                  .getElementsByTagName("dia").item(0).getTextContent());
               System.out.println("agitacao " + eElement.getElementsByTagName("agitacao").item(0)
                  .getTextContent());
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
      } catch (Exception e) {
         e.printStackTrace();
      }
   
             
            //Login login = new Login();  
      
         //   login.setVisible(true);  
           
         
    }

    
}
