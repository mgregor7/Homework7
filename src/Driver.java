import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/books.dat"));
		ArrayList<String> bibleBooks = new ArrayList<String>();
		while(input.hasNext())
		{
			bibleBooks.add(input.nextLine());
		}
		input.close();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Search by keyword: ");
		
		String keyword = input2.nextLine();
		input2.close();
		
		for(int i = 0; i < bibleBooks.size(); i++)
		{
			if(bibleBooks.get(i).contains(keyword))
			{
				System.out.println(bibleBooks.get(i));
				break;
			}
		}
	}
}
