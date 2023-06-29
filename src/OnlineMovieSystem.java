import java.util.ArrayList;
import java.util.List;

public class OnlineMovieSystem {
    public static void main(String[] args) {
        MovieSystem movieSystem = new MovieSystem();

        // Filmleri oluştur
        Movie movie1 = new Movie("The Shawshank Redemption", "Drama", 142);
        Movie movie2 = new Movie("The Godfather", "Crime", 175);
        Movie movie3 = new Movie("Pulp Fiction", "Crime", 154);

        // Filmleri film sistemine ekle
        movieSystem.addMovie(movie1);
        movieSystem.addMovie(movie2);
        movieSystem.addMovie(movie3);

        // Tüm filmleri listele
        movieSystem.printMovieList();

        // Bir filmi kaldır
        movieSystem.removeMovie(movie2);

        // Güncellenmiş film listesini yazdır
        System.out.println("Updated Movie List:");
        movieSystem.printMovieList();
    }
}

class Movie {
    private String title;
    private String genre;
    private int duration;

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}

class MovieSystem {
    private List<Movie> movies;

    public MovieSystem() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public void printMovieList() {
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Duration: " + movie.getDuration() + " minutes");
            System.out.println("---------------------------");
        }
    }
}
