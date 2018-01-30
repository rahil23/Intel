package XmlReader;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader {
	Document doc;
	
	public XMLReader(String path) throws ParserConfigurationException {
		
File file = new File("C:\\Intel\\qqqqqq\\ReadingWritingfromTextFiles\\src\\XmlReader\\XmlReader.xml");
		
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		try {
			doc = dBuilder.parse(file);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Hashtable<String,String>> getDataAsList(String testName)
	{
		Node testCaseNode = getNode(testName);
		NodeList dataNodes = testCaseNode.getChildNodes();
		
		for (int count = 0; count < dataNodes.getLength(); count++) {
			Node dataNode = dataNodes.item(count);
			if(dataNode.getNodeType() == Node.ELEMENT_NODE)
			{
				System.out.println(dataNode.getNodeName());
				System.out.println(dataNode.getTextContent());
				NodeList dataList = dataNode.getChildNodes();
				
			}
		}
	return null;	
	}
	
	public void getDataAsArray(String testName)
	{
	
	}
	
	
	public Node getNode(String nodeName)
	{
		NodeList list = doc.getChildNodes();
		Node rootNode = list.item(0);
		
		NodeList testcasesList = rootNode.getChildNodes();
		
		for (int count = 0; count < testcasesList.getLength(); count++) 
		{
			Node tempNode = testcasesList.item(count);
			
			if(tempNode.getNodeType() == Node.ELEMENT_NODE)
			{
				//System.out.println(rootNode.getNodeName());
				if(tempNode.equals(tempNode.getNodeName()))
				{
					System.out.println(rootNode.getTextContent());
					return tempNode;
				}
					
				
			}
		
		}
		return null;
		
		
	}
}
