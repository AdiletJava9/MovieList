import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cast cast = new Cast("Kristen Stuart", "Bella");
        Cast cast1 = new Cast("Robert Patinson", "Eduard");
        Cast cast2 = new Cast("Teilor Lotner", "Jacob");
        Cast cast3 = new Cast("Billy Berk", "Charli");
        ArrayList<Cast> casts = new ArrayList<>(Arrays.asList(cast, cast1, cast2, cast3));
        Director director = new Director("Ketrin", "Hardvik");
        Movie movie = new Movie("Sumerki", 2008, "Drama", director, casts);

        System.out.println("-----------------------------------------------------------------------");

        Cast cast4 = new Cast("Djastin Timber", "Salas");
        Cast cast5 = new Cast("Amanda Saifred", "Silvia");
        Cast cast6 = new Cast("Killian Merfi", "Leon");
        ArrayList<Cast> casts1 = new ArrayList<>(Arrays.asList(cast4, cast5, cast6));
        Director director1 = new Director("Enfriu", "Niccol");
        Movie movie1 = new Movie("Time", 2011, "Fantasy,Melodrama", director1, casts1);

        System.out.println("----------------------------------------------------------------------");
        Cast cast7 = new Cast("Hiu Djekman ", "Charli");
        Cast cast8 = new Cast("Dakato Gayo", "Max");
        Cast cast9 = new Cast("Evend Lilli", "Bayli");
        ArrayList<Cast> casts2 = new ArrayList<>(Arrays.asList(cast7, cast8, cast9));
        Director director2 = new Director("Shon", "Levi");
        Movie movie2 = new Movie("Real Steel", 2010, "Fantasy", director2, casts2);


        ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(movie, movie1, movie2));
        PortalFind portalFind = new PortalFind();
        PortalSort portalSort = new PortalSort();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("METHODS 1....7\n" +
                    "SORTS 7...10");
            System.out.println("----------------------------------------------------------------------");

            System.out.println("----------------------------------------------------------------------");
            int s = scanner.nextInt();
            switch (s) {
                case 1 -> portalFind.getAllMovies(movies);
                case 2 -> portalFind.findMovieByName(movies);
                case 3 -> portalFind.findMovieByActorName(movies);
                case 4 -> portalFind.findMovieByYear(movies);
                case 5 -> portalFind.findMovieByDirector(movies);
                case 6 -> portalFind.findMovieByDescription(movies);
                case 7 -> portalFind.findMovieByRole(movies);
                case 8 -> portalSort.sortByYear(movies);
                case 9 -> portalSort.sortByMovieName(movies);
                case 10 -> portalSort.sortByDirector(movies);
                default -> System.out.println("Error!!");

            }
        }


    }
}