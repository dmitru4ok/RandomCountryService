import jakarta.xml.ws.Endpoint;

public class PublisherClass {
	public static void main(String[] args) {
		Integer port = Integer.valueOf(System.getenv("PORT"));
		String address = "http://0.0.0.0:" + port + "/";
		Endpoint.publish(address, new ServiceImplementation());
	}
}
