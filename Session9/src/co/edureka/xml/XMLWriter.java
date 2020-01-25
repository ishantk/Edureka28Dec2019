package co.edureka.xml;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Order{
	
	int orderId;
	String customerName;
	int price;
	
	public String toString() {
		return orderId+"\t"+customerName+"\t"+price;
	}
}



public class XMLWriter {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.orderId = 1;
		order.customerName = "John";
		order.price = 3000;
		
		System.out.println(order);
		
		// Object is in RAM and data in it is temporary.
		// When program will finish, contents will be lost.
		// We must save data
		// 1. Files
		// 2. XML
		// 3. DataBases
		
		try {
			
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			Document document = builder.newDocument();				// Represents an Empty XML Document in Tree Structure :)
			
			// 1. Create Document Object representing XML Document as Tree
			Document documet = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			
			// 2. Create Tags for XML File
			// Element represents what Tags you want in XML File
			Element rootElement = documet.createElement("orders");
			Element orderElement = documet.createElement("order");
			Element orderIdElement = documet.createElement("orderId");
			Element customerNameElement = documet.createElement("customerName");
			Element priceElement = documet.createElement("price");
			
			// 3. Create Data for XML Tags in XML File
			// XML Document will have data which will always be of String type
			Text orderIdText = documet.createTextNode(String.valueOf(order.orderId));
			Text customerNameText = documet.createTextNode(order.customerName);
			Text priceText = documet.createTextNode(String.valueOf(order.price));
			
			// 4. Arrange Data and Tags in Document Object
			orderIdElement.appendChild(orderIdText);
			customerNameElement.appendChild(customerNameText);
			priceElement.appendChild(priceText);
			
			orderElement.appendChild(orderIdElement);
			orderElement.appendChild(customerNameElement);
			orderElement.appendChild(priceElement);
			
			rootElement.appendChild(orderElement);
			
			documet.appendChild(rootElement);
			
			// 5. Generate XML Document from Document Object
			//    We need to use Transformer API
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(documet);
			StreamResult result = new StreamResult(new FileOutputStream("orders.xml"));
			
			transformer.transform(source, result);
			System.out.println(">> XML FILE orders.xml generated :)");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		

	}

}
