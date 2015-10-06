// Andrew Lata
// 10082905
// CPSC 233
// Lab: 03
// Assignment 3
// Version: 1.4
// Much of this classes programming code was adapted from James Tam's example of linked lists in his BookNode example

public class Movie // This class stores all the information for each movie, and compiles it as a multi-line string
{
	private String name;
	private String genre;
	private int rating;
	private String [] cast; 
	
	public Movie (String aName, String aGenre, int aRating, String [] aCast)
	{
		setName(aName);
		setGenre(aGenre);
		setRating(aRating);
		setCast(aCast);
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
