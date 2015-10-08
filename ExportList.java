import java.io.*;

public class ExportList
{
	public void writeList(MovieNode head, String fileName)
	{
		try
		{
			FileWriter fw = new FileWriter(fileName);
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
