import java.util.Date;

public class Loan{
	private String userEt;
	private String bookSignature;
	private Date loanDate;
	private Date returnPeriod;
	private Boolean isReturned;
	private Date bookReturnedOnDate;
	public void Loan(String userEt, String bookSignature, Date loanDate, 
	    Date returnPeriod, Boolean isReturned, Date bookReturnedOnDate){
		this.userEt = userEt;
		this.bookSignature = bookSignature;
		this.loanDate = loanDate;
		this.returnPeriod = returnPeriod;
		this.isReturned = isReturned;
		this.bookReturnedOnDate = bookReturnedOnDate;
	}
}
