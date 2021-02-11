package Assig2;

public class EngineeringBook extends Book
{
private String category;


	
	public EngineeringBook(String category) {
	super();
	this.category = category;
}


	public EngineeringBook() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return super.toString()+"EngineeringBook [category=" + category + "]";
	}


	


	
	

}



