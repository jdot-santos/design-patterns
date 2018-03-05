package java.com.jsantos.creationalpatterns.abstractfactorypattern.documentbuilderfactoryexample;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * This is a real-life example of how you could possibly use the abstract factory pattern by using the DocumentBuilderFactory class.
 *
 * Note that the variable names are named appropriately to distinguish between the abstract factory and the factory.
 */
public class DocumentBuilderFactoryDemo {


	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		String xml = "<document><body><stock>AAPL</stock></body></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

		/*
			DocumentBuilderFactory is an abstract factory because we don't know what the underlying impl of the factory is when we get it. The ipml can be swapped out by adding a command line parameter.
		 */
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder factory = abstractFactory.newDocumentBuilder();
		Document doc = factory.parse(bais);
		doc.getDocumentElement().normalize();

		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

		/*
			This shows what the implementing abstract factory class is, which is com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl + ...jaxp.DocumentBuilderImpl, respectively.
		 */
		System.out.println(abstractFactory.getClass());
		System.out.println(factory.getClass());
	}
}
