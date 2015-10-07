import java.io.*;

public class ExportList
{
	public void writeList(MovieNode head)
	{
		try
		{
			String filename = "movie_list.txt";
			FileWriter fw = new FileWriter(filename);
			PrintWriter pw = new PrintWriter(fw);
	
			while (head != null)
			{
				pw.print(head.printAll());
				head = head.getNext();
			}
			fw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
