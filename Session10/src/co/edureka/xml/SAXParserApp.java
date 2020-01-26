package co.edureka.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Methods in MyHandler will be executed automatically.
class MyHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println(">> XML PARSING STARTED");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		System.out.print(data); // We can write our code here to prcess data :)
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println(">> XML PARSING FINISHED");
	}
}

public class SAXParserApp {

	public static void main(String[] args) {
		
		try {
			
			// Use it when your files are Large :)
			SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
			// saxParser is Ref Var to SAXParser Object :)
			
			File file = new File("/Users/ishantkumar/Downloads/orders.xml"); // Path can be of our choice
			
			MyHandler handler = new MyHandler();
			
			saxParser.parse(file, handler);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// Assignment : Create ArrayList of Order Objects :)
// XSL : https://www.w3schools.com/xml/tryxslt.asp?xmlfile=cdcatalog&xsltfile=cdcatalog_ex3
