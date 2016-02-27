/*
 * Create a class called Movie, which represents a movie, and which has the following variables:

title, which is a String representing the title of the movie
studio, which is a String representing the studio that made the movie
a) Write a constructor for the class Movie that takes in as parameters Strings representing the title and studio of the movie.

b) Write a toString() method for the class Movie, which returns a String with the title and studio, nicely formatted.

c) Implement the Comparable interface for the class Movie. The method CompareTo should be written so that an array of Movies will be 
sorted first by studio, and then by title.

Test your CompareTo method by creating three different arrays of Movie instances, and sorting them (use Arrays.sort(...)).

d) Override the default equals(Object obj) method, so that two instances of a Movie are considered equal if they have the same studio and 
if their titles are the same (ignoring case). For example, movie instances with the titles "Lion King" and "Lion king" should be considered 
equal, if their studio is the same.

Test your equals method by calling it on three different test cases. Additionally, if you create two arrays of Movie instances, you can now 
compare them by calling Arrays.equals(..), which will call your equals method to test the pairs of instances.
 */
package cuny.lehman.cmp326;

import java.util.ArrayList;
import java.util.Scanner;

public class Movies implements Comparable<Movies> {
	private String title;
	private String studio;

	public Movies() {
		
	}
	
	public Movies(String title, String studio){
		this.title = title;
		this.studio = studio;
	}

	public String getTitle() {
		return title;
	}

	public String getStudio() {
		return studio;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String toString(){
		return "Movie Title: " + title + " Created by " + studio + "studios";
	}
	
	@Override
	public int compareTo(Movies o) {
		int a = this.title.compareToIgnoreCase(o.title);
		int b = this.studio.compareToIgnoreCase(o.studio);
		return Integer.compare(a, b);
	}
	
	public int compareTo(Movies[] o) {
		int a = 0, b = 0;
		for(int i = 0; i < o.length-1; i++){
			a = this.title.compareToIgnoreCase(o[i].title);
			b = this.studio.compareToIgnoreCase(o[i+1].studio);
		}
		return Integer.compare(a, b);
	}
	
	@Override
	public boolean equals(Object obj){
		return (obj instanceof Movies && this.studio.equalsIgnoreCase(((Movies)obj).studio) || this.title.equalsIgnoreCase(((Movies)obj).title));
	}
	
	public static void main(String[] args){
		boolean isDone = false;
		ArrayList<Movies> movies = new ArrayList<>();
		Scanner keyStroke = new Scanner(System.in);
		String input;
		while(!isDone){
			System.out.println("Enter a name of a movies and a comma and a studio: eg(Iron Man, Marvel): ");
			input = keyStroke.nextLine();
			if(!input.equalsIgnoreCase("done")){
				String[] str = input.split(",");
				str[0] = str[0];
				str[1] = str[1];
				movies.add(new Movies(str[0], str[1]));
			}
			else
				isDone = true;
		}
		for(int i = 0; i < movies.size()-1; i++){
			System.out.println(movies.get(i).compareTo(movies.get(i + 1)));
			System.out.println(movies.get(i).equals(movies.get(i+1)));
		}
		keyStroke.close();
	}
	

}
