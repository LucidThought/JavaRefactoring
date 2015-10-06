// Andrew Lata
// 10082905
// CPSC 233
// Lab: 03
// Assignment 3
// Version: 1.17

import java.util.Scanner;

public class UserInterface
{
	public final int TOP = 5;
	public final int ONE = 1;
	public final int ZERO = 0;
	public final int SEVEN = 7;

	private Manager aManager;
	private Scanner in;
	public UserInterface ()
	{
		aManager = new Manager();
		in = new Scanner(System.in);
	}
	
	public void intro () // this method displays a short welcome message, then calls the menu method
	{
		System.out.println("_____________________________");
		System.out.println(" Make a List of Your Movies! ");
		System.out.println("-----------------------------");
		System.out.println("- This program can generate a list of all the  -");
		System.out.println("- movies you want to make a list of!           -");
		System.out.println("- Select your desired task from the list below: ");
		menu();
	}
	public void menuOptions () // this method displays the users main-menu options
	{
		System.out.println("\n(A)dd a movie to your list.");
		System.out.println("(R)emove a movie from your list.");
		System.out.println("(D)isplay your list.");
		System.out.println("(B) Display your list backwards.");
		System.out.println("(X) Delete your entire list.");
		System.out.println("(S)earch your list.");
		System.out.println("(Q)uit.\n");
	}
	public void menu () // this is the main looping method, as continues to loop as long as the program is active
	{
		String select = "0";
		while ( !select.equalsIgnoreCase("Q"))
		{
			menuOptions();
			System.out.print("Make your selection: ");
			select = in.nextLine();
			if (select.equalsIgnoreCase("A")) {
				addMovie(); }
			else if (select.equalsIgnoreCase("R")) {
				removeFromList(); }
			else if (select.equalsIgnoreCase("D")) {
				System.out.print("\n");
				displayList(); }
			else if (select.equalsIgnoreCase("B")) {
				System.out.print("\n");
				backwardDisplay(); }
			else if (select.equalsIgnoreCase("X")) {
				aManager.clearList(); 
				System.out.println("-- Your movie list has been cleared --"); }
			else if (select.equalsIgnoreCase("S")) {
				finder(); }
			else if (!select.equalsIgnoreCase("Q")) {
				System.out.println("That's not a menu option, try again"); }
		}
		System.out.println("Goodbye!");
			
	}

	public void addMovie () // This method prompts for movie information, then calls aManager to create a MovieNode and a Movie
	{
		System.out.print("\nEnter a title for the movie: ");
		String newName = in.nextLine();
		int numGenre = getGenre();
		String newGenre = "Other";
		switch (numGenre)
		{
			case 1:
				newGenre = "Action/Adventure";
				break;
			case 2:
				newGenre = "Drama";
				break;
			case 3:
				newGenre = "Science Fiction";
				break;
			case 4:
				newGenre = "Comedy";
				break;
			case 5:
				newGenre = "Other";
				break;
		}
		int newRating = 0;
		while (newRating < ONE || newRating > TOP)
		{
			System.out.print("Enter a star rating (1-5) ");
			newRating = in.nextInt();
		}
		in.nextLine();
		String [] newCast = new String [3];
		System.out.print("Enter cast member name 1: ");
		newCast[0] = in.nextLine();
		System.out.print("Enter cast member name 2: ");
		newCast[1] = in.nextLine();
		System.out.print("Enter cast member name 3: ");
		newCast[2] = in.nextLine();
		aManager.add(newName, newGenre, newRating, newCast);
	}

	public void showGenre () // this is a movie genre list
	{
		System.out.println("1 - Action");
		System.out.println("2 - Drama");
		System.out.println("3 - Science Fiction");
		System.out.println("4 - Comedy");
		System.out.println("5 - other");
	}
	public int getGenre () // this method gets the movie genre in the form of an integer. it calls the showGenre method to show the list of genres
	{
		showGenre();
		int genreKey = ZERO;
		while (genreKey < ONE || genreKey > SEVEN) {
			System.out.println("Choose your genre (1-7): ");
			genreKey = in.nextInt(); }
		in.nextLine();
		return genreKey;
	} 

	public void displayList () // this method determines if the list is empty, and if it is not it calls Manager to display the list
	{
		if (aManager.pointHead() == null) {
		System.out.println("\n-----------------");
		System.out.println("The list is empty");
		System.out.println("-----------------\n"); }
		else {
			aManager.display(); }
	}
	public void backwardDisplay () // this method determines if the list is empty, and if it is not it calls Manager to display the list backwards
	{
		if (aManager.pointHead() == null) {
			System.out.println("\n-----------------");
			System.out.println("The list is empty");
			System.out.println("-----------------\n"); }
		else {
			MovieNode temp = aManager.pointHead();
			aManager.doBackwardsDisplay(aManager.pointHead()); }
	}

	public void removeFromList() // this method calls Manager to remove a movie based on the users input here
	{
		System.out.print("Name of the movie you would like to remove from the list: ");
		String remover = in.nextLine();
		aManager.movieNodeRemover(remover);
	}
	public void finder() // this method calls Manager to find a movie based on user input of it's title, then displays the movie
	{
		System.out.print("Enter the name of the movie to find: ");
		String find = in.nextLine();
		MovieNode found = aManager.movieFinder(find);
		if (found == null) {
			System.out.println("Your movie was not found in the list"); }
		else {
			System.out.println("\nMovie Found: \n");
			System.out.print(found.printAll()); }
	}

}
