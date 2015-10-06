// Andrew Lata
// 10082905
// CPSC 233
// Lab: 03
// Assignment 3
// Version: 1.5
// Much of this classes programming code was adapted from James Tam's example of linked lists in his BookNode example

import java.util.Scanner;

public class Manager // this class has the only direct link to the list, in the form of a link to the lists start (head). any tasks referring to the list (inserting, adding, removing, clearing) are done through Manager
{	
	private MovieNode head;
	private int counter;
	private Scanner in;

	public final int ZERO = 0;
	public final int ONE = 1;
	public final int THREE = 3;
	public final int FOUR = 4;

	public Manager () 
	{
		head = null;
		counter = ZERO;
		in = new Scanner(System.in);
	}

	public void add (String aName, String aGenre, int aRating, String [] aCast)
	{
		MovieNode aMovieNode = new MovieNode(aName, aGenre, aRating, aCast, null);

		if (head == null)
		{
			head = aMovieNode;
		}
		else
		{
			MovieNode finder = head;
			do {
				if (finder.getData().getName().compareToIgnoreCase(aName) < 0 && finder.getNext() == null) {
					finder.setNext(aMovieNode); 
					break; }
				else if (finder.getData().getName().compareToIgnoreCase(aName) < 0 && finder.getNext().getData().getName().compareToIgnoreCase(aName) > 0) {
					MovieNode temp = finder.getNext();
					finder.setNext(aMovieNode);
					aMovieNode.setNext(temp);
					break; }
				else if (finder.getData().getName().compareToIgnoreCase(aName) == 0) {
					MovieNode temp = finder.getNext();
					finder.setNext(aMovieNode);
					aMovieNode.setNext(temp); 
					break; }
				finder = finder.getNext();
			} while (finder != null);
			if (aName.compareToIgnoreCase(head.getData().getName()) < 0) {
					aMovieNode.setNext(head);
					head = aMovieNode; }
			else if (finder.getNext() == null) {
				finder.setNext(aMovieNode); }	
		}

	}

	public MovieNode pointHead()
	{
		return head;
	}

	public void display ()
	{
		MovieNode tempNode = head;
		int count = ZERO;
			do {
				if (count > THREE) {
					System.out.println("Press enter to continue");
					in.nextLine(); 
					count = ZERO; }
				count++;
				System.out.print(tempNode.getData().printAll());
				tempNode = tempNode.getNext();
			} while (tempNode != null);
	}

	public void doBackwardsDisplay (MovieNode temp)
	{
		resetCounter();
		if (temp != null) {
			MovieNode next = temp.getNext();
			doBackwardsDisplay(next); }
		if (counter > FOUR) {
			System.out.println("Press enter to continue");
			in.nextLine(); }
		counter++;
		if (temp != null) {
			System.out.print(temp.getData().printAll()); }
	}

	private void resetCounter()
	{
		counter = ZERO;
	}
	public void clearList ()
	{
		head = null;
	}

	public void movieNodeRemover (String movie)
	{
		MovieNode remove = head;
		MovieNode previous = null;
		int checker = ZERO;
		if (head == null) {
			System.out.println("The list is empty.");
			return; }
		while (remove != null) 
		{
			if (remove.getData().getName().equalsIgnoreCase(movie)) {
				if (previous == null) {
					head = remove.getNext(); }
				else {
					previous.setNext(remove.getNext()); } 
				checker++;
				break; }
			else {
				previous = remove;
				remove = remove.getNext(); }
		} 
		if (checker == ZERO) {
			System.out.println("Your movie was not found"); }
		else {
			System.out.println("Your movie has been removed from the list"); }
	}

	public MovieNode movieFinder (String movie)
	{
		MovieNode temp = head;
		while (temp != null) 
		{
			if (temp.getData().getName().equalsIgnoreCase(movie)) {
				return temp; }
			temp = temp.getNext();
		} 
		return null;
	}
}
