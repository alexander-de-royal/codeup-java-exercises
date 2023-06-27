package movies;

public class MoviesApplication{

    private static String getMovies(Movie[] movies, String category){
        String movieList = " ";
        for(Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase(category)){
                movieList = String.format("%s%s - %s%n", movieList, movie.getName(), movie.getCategory());
            }
        }
        return movieList;
    }

    private static void runApp(){
        System.out.println("Welcome to Movie Plex Industries!\n\n" +
                "What would you like to do?\n\n0" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        input in = new Input();
        System.out.println("Please enter your selection");
        int userChoice = in.getInt(0,5);
        switch (userChoice){
            case 0:
                System.out.println("Farewell! Thank you for using Movie Pleex Industries");
                break;
            case 1:
                getMovies(movies);
                break;
            case 2:
                getMovies(movies, "animated");
                break;
            case 3:
                getMovies(movies, "drama");
                break;
            case 4:
                getMovies(movies, "horror");
                break;
            case 5:
                getMovies(movies, "scifi");
                break;
//                String movieList = " ";
//                for (Movie movie : MoviesArray.findAll()){
//                    movieList = String.format("%s%s - %s%n", movieList, movie.getName)
//                }
        }
    }
}

//package movies;
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class MoviesApplication {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Movies[] movies = MoviesArray.findAll();
//        int choice;
//
//        do{
//            System.out.println("0 - exit");
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view movies in the animated category");
//            System.out.println("3 - view movies in the drama category");
//            System.out.println("4 - view movies in the horror category");
//            System.out.println("5 - view movies in the scifi category");
//
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//                case 0:
//                    System.out.println("0 - exit");
//                    break;
//                case 1:
//                    System.out.println("1 - view all movies");
//                    display(movies);
//                    break;
//                case 2:
//                    System.out.println("2 - view movies in the animated category");
//                    displayMovieByCategory(movies, "animated");
//                    break;
//                case 3:
//                    System.out.println("3 - view movies in the drama category");
//                    displayMovieByCategory(movies, "drama");
//                    break;
//                case 4:
//                    System.out.println("4 - view movies in the horror category");
//                    displayMovieByCategory(movies, "horror");
//                    break;
//                case 5:
//                    System.out.println("5 - view movies in the scifi category");
//                    dispalyMovieByCategory(movies, "scifi")
//                    break;
//                default:
//                    System.out.println("Invalid");
//            }
//        }
//        while(choice != 0);
//    }
//
//    public static void displayMovie(Movie[] movies) {
//        for(Movie movie: movies){
//            System.out.println(movie.getName() + "--" + movie.getCategory());
//        }
//    }
//
//    public static void displayMovieByCategory(Movie[] movies, String categories) {
//        for (Movie movie: movies){
//            if(movie.getCategory().equalsIgnoreCase(categories)){
//                System.out.println(movie.getName() + "--" + movie.getCategory());
//            }
//        }
//    }
//}
