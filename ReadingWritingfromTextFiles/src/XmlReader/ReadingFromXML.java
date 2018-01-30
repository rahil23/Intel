package XmlReader;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingFromXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		File file = new File("C:\\Intel\\qqqqqq\\ReadingWritingfromTextFiles\\src\\XmlReader\\StudentData.xml");
		
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		
		//System.out.println(doc.getChildNodes());
		NodeList childNodes1 = doc.getChildNodes();
		//System.out.println("Total Nodes"+childNodes1.getLength());
		
	Node rootNode = 	childNodes1.item(0);
	/*System.out.println(rootNode.getNodeName());
	System.out.println(rootNode.getTextContent());*/
	
	
	NodeList childNodes2 = rootNode.getChildNodes();
	//System.out.println("Total nodes under root nodes"+childNodes2.getLength());
	
	for (int count = 0; count < childNodes2.getLength(); count++) {
		Node tempNode = childNodes2.item(count);
		
		if(tempNode.getNodeType() == Node.ELEMENT_NODE)
		{
			System.out.println(rootNode.getNodeName());
			System.out.println(rootNode.getTextContent());
		}
		
	}
	
	}
}
		
	
	

