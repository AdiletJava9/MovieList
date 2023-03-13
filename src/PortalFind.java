import java.util.List;
import java.util.Scanner;

public class PortalFind implements FindAble {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        System.out.println("MOVIES");
        for (Movie m : movies) {
            System.out.println(m);
        }
        return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("MOVIES NAME?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getName().equals(s)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("ACTOR FULL NAME?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                if (c.getActorFullName().equals(s)) {
                    System.out.println(m);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("YEAR?");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        for (Movie m : movies) {
            if (m.getYear() == s) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("DIRECTOR?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getDirector().getName().equals(s)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("DESCRIPTION?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getDescription().equals(s)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("ROLE?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c: m.getCast()) {
               if (c.getRole().equals(s)){
                   System.out.println(m);
               }
            }
        }
    }
}
