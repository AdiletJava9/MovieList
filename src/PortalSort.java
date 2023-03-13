import java.util.Comparator;
import java.util.List;

public class PortalSort implements SortAble {
    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(sortName);
        for (Movie m:movies) {
            System.out.println(m);
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
movies.sort(sortYear);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(sortDirector);
        for (Movie movie : movies) {
            System.out.println(movie);
        }

    }
    public static Comparator<Movie> sortYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public static Comparator<Movie> sortName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };

}
