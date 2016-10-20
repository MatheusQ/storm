/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;
import Interface.Login;
import java.io.File;
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
 */
public class Storm {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException, SAXException, ParserConfigurationException, IOException {
        // TODO code application logic here
        Xml xml = new Xml();
        Document doc; 
        doc=xml.Carrega();
        xml.Cidade(doc);
        xml.XmlPrvisao(doc);

             
            //Login login = new Login();  
      
         //   login.setVisible(true);  
           
         
    }

    
}
