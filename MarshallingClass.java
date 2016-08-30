import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;  

public class MarshallingClass {
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		try {
			//Create Jaxb Context
			JAXBContext contextObj = JAXBContext.newInstance(MarshallingPojo.class);
			
			//Marshaller object
			Marshaller marshallerObj = contextObj.createMarshaller();
			//Set marshaller object property. 
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		    
		    MarshallingPojo mp =new MarshallingPojo(339446,"Paritosh Mishra",50000);
		    marshallerObj.marshal(mp, new FileOutputStream("employee.xml"));
			
		} catch (JAXBException e) {
			throw e;
		}
	}
	
}
