
public class Project {

	//here we are initializing all the project details and the people
	int p_num;
	String p_name;
	String building_type;
	String address;
	int ERF_num;
	Double Fee;
	Double paid;
	String deadline;
	Person architect;
	Person contractor;
	Person customer;
	
	//creating a method for the project details
	public Project(int p_num, String p_name, String building_type, String address, int ERF_num, Double Fee, Double paid,String deadline) {

		this.p_num = p_num;
		this.p_name = p_name;
		this.building_type = building_type;
		this.address = address;
		this.ERF_num = ERF_num;
		this.Fee = Fee;
		this.paid = paid;
		this.deadline = deadline;
	
	}	
	public Project(String string) {
		// TODO Auto-generated constructor stub
	}
	//create a setArchitect method so we can use it by calling it in the main poised file
	public void setArchitect(Person arc) {
		architect = arc;
	}
	
	public Person getArchitect() {
		return architect;
	}
	//create a setContractor method so we can use it by calling it in the main poised file
	public void setContractor(Person cont) {
		contractor = cont;
	}

	public Person getContractor() {
		return contractor;
	}
	//create a setCustomer method so we can use it by calling it in the main poised file
	public void setCustomer(Person cust) {
		customer = cust;
	}
	
	public Person getCustomer() {
		return customer;
	}
	
	//Use the getName function to call the names of the project and return p_name which is project name
	public String getName() {
		return p_name;
	}
	//create a toString method
	public String toString() {
		String output = "\nProject number: " + p_num;
		output += "\nProject name: " + p_name;
		output += "\nType of building: " + building_type;
		output += "\nProject address: " + address;
		output += "\nERF number: " + ERF_num;
		output += "\nProject cost: " + Fee;
		output += "\nAmount paid: "+ paid;
		output += "\nProject deadline date : " + deadline;
		return output;
	}
	public void getCompletion(String string) {
		// TODO Auto-generated method stub
		
	}
	public Double get_total_fee() {
		return Fee;
	}
	public Double get_total_paid_amount() {
		// TODO Auto-generated method stub
		return Fee;
	}
	public Double Project() {
		// TODO Auto-generated method stub
		return paid;
	}
	public String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
	public void set_deadline_date(String date) {
		deadline = date;
	}
	public void set_total_amount_paid(double nextDouble) {
		paid = nextDouble;
	}
	public  String get_project_name() {
		// TODO Auto-generated method stub
		return p_name;
	}
}

