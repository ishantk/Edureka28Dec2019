package co.edureka.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// import org.glassfish.jersey.servlet.ServletContainer; | ServletContainer must be configured in web.xml file for Restful Web Service implementation

@Path("/appservice")
public class AppService {					// Web Service
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {			// Web Method
		Date date = new Date();
		String response = "This is Hello from App Service: "+date;
		return response; // Textual Response
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		Date date = new Date();
		String response = "<html><body><h4>This is Hello from App Service</h4> <i>"+date+"</i></body></html>";
		return response; // HTML Response
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		Date date = new Date();
		String response = "<?xml verson='1.0' encoding='utf-8'?><hello>This is Hello from App Service: "+date+"</hello>";
		return response; // XML Response
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello() {	// INDUSTRIAL STANDARD
		Date date = new Date();
		String response = "{'message':'This is Hello from App Service', 'date':'"+date+"'}";
		return response; // JSON Response
	}
	
}
