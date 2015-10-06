// Andrew Lata
// 10082905
// CPSC 233
// Lab: 03
// Assignment 3
// Version: 1.0
// Some of the code used in this program was adapted from James Tam's example of linked lists, see header documentation
/* --PURPOSE--
   This program creates a linked-list of the users movie choices 
   It functions using a linkied-list structure for storing movie information 
   --LIMITATIONS--
   The program must take the users selection of genre and rating as an integer,
   any other datatype the user inpus when prompted for these things will crash the program
   --FEATURES--
   All of the assignment features have been implemented */


public class Driver
{
    public static void main (String [] args)
    {
	UserInterface aUser = new UserInterface();
	aUser.intro();
    }
}
