import java.util.Date;

public class User{
	private String et;
	private String name;
	private String middleName;
	private String lastName;
	private int readingCardId;
	private Date cardIssueDate;
	public void User(String et, String name, String middleName, 
	    String lastName, int readingCardId, Date cardIssueDate){
	    this.et = et;
	    this.name = name;
	    this.middleName = middleName;
	    this.lastName = lastName;
	    this.readingCardId = readingCardId;
	    this.cardIssueDate = cardIssueDate;   
	}
}
