public class Book{
	private String signature;
	private int authorId;
	private String title;
	private int publisherId;
	private String anotation;
	private int numberOfCopies;
	private int price;
	public void Book(String signature, int authorId, String title, 
	    int publisherId, String anotation, int numberOfCopies, int price){
		this.signature = signature;
		this.authorId = authorId;
		this.title = title;
		this.publisherId = publisherId;
		this.anotation = anotation;
		this.numberOfCopies = numberOfCopies;
		this.price = price;
	}
}
