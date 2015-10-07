import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestManager
{
	Manager tM;
	String title = "Movie";
	String genre = "Adventure";
	int rating = 4;
	String cast[] = {"SomeGuy","SomeGirl","SomeThing"};

	String title2 = "Movie2";
	String genre2 = "Action";
	int rating2 = 3;
	String cast2[] = {"SomeGuy2","SomeGirl2","SomeThing2"};

	@Test
	public void testMovieFinder()
	{
		tM = new Manager();
		tM.add(title,genre,rating,cast);
		tM.add(title2,genre2,rating2,cast2);

		assertEquals("Movie", tM.movieFinder(title).getName());
		assertEquals("Action", tM.movieFinder(title2).getGenre());
	}
}
