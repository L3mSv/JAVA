/* 
Write a Java program to create a class called Movie with private instance variables title, director, and duration.
 Provide public getter and setter methods to access and modify these variables.
 Add a method called getMovieDetails() that returns a formatted string containing the movie details.
*/

public class Exec13 {
    public static void main(String[] args)
    {
        Movie movie = new Movie();

        movie.setDirector("Christopher Nolan");
        movie.setTitle("Arrival");
        movie.setDuration(146);

        System.out.println(movie.getMovieDetails());
    }   
}

class Movie{
    private String title;
    private String director;
    private int duration;

    public String setTitle(String title)
    {
        return this.title = title;
    }

    public String setDirector(String director)
    {
        return this.director = director;
    }

    public int setDuration(int duration)
    {
        return this.duration = duration;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDirector()
    {
        return director;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getMovieDetails()
    {
        return "Title: " + title + ", Director: " + director + ", Duration: " + duration + " minutes";
    }
}