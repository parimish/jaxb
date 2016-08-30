
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class MarshallingPojo {

	private int id;  
	private String strName;  
	private float fSalary;  

	public MarshallingPojo() {
		//Empty Constructor
	}

	public MarshallingPojo(int Empid, String name, float sal) {
		this.id = Empid;
		this.strName=name;
		this.fSalary = sal;
	}

	@XmlAttribute
	public int getId(){
		return id;
	}

	public void setId(int Empid){
		this.id = id;
	}

	//Defining The element in the xml using the xml Element 
	@XmlElement
	public float getSal(){
		return fSalary;
	}
	
	public void setSal(float sal){
		this.fSalary=sal;
	}

	@XmlElement
	public String getName() {
		return strName;
	}

	public void setName(String Name) {
		this.strName=Name;
	}


}
