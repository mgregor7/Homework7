public class BibleBook
{
	private String bookName;
	private int numberOfChapters;
	private String summary;
	
	public BibleBook(String bookName, int numberOfChapters, String summary)
	{
		this.bookName = bookName;
		this.numberOfChapters = numberOfChapters;
		this.summary = summary;
	}
	
	public void display()
		{
		System.out.println("Book Name: " + bookName + " | Chapters: "+ numberOfChapters + " | Summary: " + summary);
		
		}
	public BibleBook(String commaDelimited)
	{
		String[] parts = commaDelimited.split(":");
		this.bookName = parts[0];
		this.numberOfChapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
		
	}
	
}