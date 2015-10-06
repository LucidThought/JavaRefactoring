import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestManager
{
	Manager tM;
	String title = "Movie";
	String genre = "Adventure";
	int rating = 4;
	String cast[] = {"SomeGuy","SomeGirl","SomeThing"}

	@Test
	public void testMovieFinder()
	{
		tM = new Manager();
		tM.add(title,genre,rating,cast);
		assertEquals("Movie", tM.movieFinder(title).getName());
	}
}
