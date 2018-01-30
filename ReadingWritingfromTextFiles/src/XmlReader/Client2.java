package XmlReader;

import javax.xml.parsers.ParserConfigurationException;

public class Client2 {
	
	public static void main(String[] args) throws ParserConfigurationException {
		XMLReader xml = new XMLReader(System.getenv("user.dir")+"//XmlReader.xml");
		xml.getDataAsList("LoginTest");
	}

}
