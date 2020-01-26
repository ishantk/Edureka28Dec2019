package co.edureka.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class Order{
	
	int orderId;
	String customerName;
	int price;
	
	public String toString() {
		return orderId+"\t"+customerName+"\t"+price;
	}
}

public class DOMParser {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/orders.xml"); // Path can be of our choice
			ArrayList<Order> orders = new ArrayList<Order>();
			
			if(file.exists()) {
				System.out.println(">> Parsing: "+file.getName());
				
				// 1. Create Document Object representing XML Document as Tree after PARSING
				Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
				System.out.println(">> ROOT ELEMENT: "+document.getDocumentElement().getNodeName());
				NodeList nodes = document.getElementsByTagName("order");
				System.out.println(">> TOTAL order TAGS Found: "+nodes.getLength());
				
				// 2. Iterate in NodeList to reach to every Node 1 by 1 and extract data
				for(int i=0;i<nodes.getLength();i++) {
					
					Node node = nodes.item(i);		// we will get 3 nodes -> 0, 1, 2
					Element element = (Element)node;
					
					Order order = new Order();
					
					order.orderId = Integer.parseInt(element.getElementsByTagName("orderId").item(0).getTextContent());
					order.customerName = element.getElementsByTagName("customerName").item(0).getTextContent();
					order.price = Integer.parseInt(element.getElementsByTagName("price").item(0).getTextContent());
					
					System.out.println(order);
					
					// We can maintain Collection of Objects by Parsing Data from XML File :)
					orders.add(order);
				}
				
			}else {
				System.out.println(">> File Not Found: "+file.getName());
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}

	}

}
