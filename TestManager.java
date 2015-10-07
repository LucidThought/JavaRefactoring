import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestManager
{
	Manager tM;
	String title = "Zorro";
	String genre = "Adventure";
	int rating = 4;
	String cast[] = {"SomeGuy","SomeGirl","SomeThing"};

	String title2 = "Awesome";
	String genre2 = "Action";
	int rating2 = 3;
	String cast2[] = {"SomeGuy2","SomeGirl2","SomeThing2"};

	@Test
	public void testMovieFinder()
	{
		tM = new Manager();
		tM.addNewAlphabeticalOrder(title,genre,rating,cast);
		tM.addNewAlphabeticalOrder(title2,genre2,rating2,cast2);

		assertEquals("Zorro", tM.movieFinder(title).getName());
		assertEquals("Action", tM.movieFinder(title2).getGenre());
	}

	@Test
	public void testPointHead()
	{
		tM = new Manager();
		tM.addNewAlphabeticalOrder(title,genre,rating,cast);
		tM.addNewAlphabeticalOrder(title2,genre2,rating2,cast2);

		assertEquals("Awesome", tM.pointHead().getName());
		assertEquals("Action", tM.pointHead().getGenre());
	}
}
