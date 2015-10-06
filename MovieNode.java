// Andrew Lata
// 10082905
// CPSC 233
// Lab: 03
// Assignment 3
// Version: 1.2
// Much of this classes programming code was adapted from James Tam's example of linked lists in his BookNode example

public class MovieNode // this class stored a link to a single movie. the program uses this class to navigate the list and retreive information from each Movie
{
	private Movie data;
	private MovieNode next;
	
	public MovieNode ()
	{
		data = null;
		next = null;
	}
	public MovieNode (Movie data, MovieNode next)
	{
		setData(data);
		setNext(next);
	}

	public void setData (Movie input)
	{
		data = input;
	}
	public void setNext (MovieNode pointer)
	{
		next = pointer;
	}

	public Movie getData ()
	{
		return data;
	}
	public MovieNode getNext ()
	{
		return next;
	}

}
