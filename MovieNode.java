// Andrew Lata
// 10082905
// CPSC 233
// Lab: 03
// Assignment 3
// Version: 1.2
// Much of this classes programming code was adapted from James Tam's example of linked lists in his BookNode example

public class MovieNode // this class stored a link to a single movie. the program uses this class to navigate the list and retreive information from each Movie
{
	private MovieNode next;
	private String name;
	private String genre;
	private int rating;
	private String [] cast;
	
	public MovieNode ()
	{
		next = null;
	}
	public MovieNode (String aName, String aGenre, int aRating, String [] aCast, MovieNode next)
	{
		setNext(next);
		setName(aName);
		setGenre(aGenre);
		setRating(aRating);
		setCast(aCast);

	}
	public void setNext (MovieNode pointer)
	{
		next = pointer;
	}
	public MovieNode getNext ()
	{
		return next;
	} 
	
	public void setName (String aName)
	{
		name = aName;
	}
	public void setGenre (String aGenre)
	{
		genre = aGenre;
	}
	public void setRating (int aRating)
	{
		rating = aRating;
	}
	public void setCast (String [] aCast)
	{
		cast = aCast;
	}

	public String printAll()
	{
		String showMovie = "";
		showMovie = showMovie + "Title: " + name + "\n";
		showMovie = showMovie + "Genre: " + genre + "\n";
		showMovie = showMovie + "Rating: " + rating + "\n";
		showMovie = showMovie + "Cast:" + "\n";
		showMovie = showMovie + cast[0] + "\n" + cast[1] + "\n" + cast[2] + "\n";
		showMovie = showMovie + "*************************** \n";
		return showMovie;
	}

	public String getName ()
	{
		return name;
	}
	public String getGenre ()
	{
		return genre;
	}
	public int getRating ()
	{
		return rating;
	}
	public String [] getCast ()
	{
		return cast;
	}

}
