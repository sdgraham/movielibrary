public class UserInterface
{
    private InputReader reader;
    private MovieLibrary library;

    public UserInterface()
    {
        this.reader = new InputReader();
    }

    public void showMainMenu()
    {
        boolean quit = false;

        while (quit == false)
        {
            System.out.println("Please select an option: ");
            System.out.println("1. add a new movie");
            System.out.println("2. show all movies");
            System.out.println("3. show movie count");
            System.out.println("0. quit");

            String userInput = reader.getInput();

            switch (userInput)
            {
                case "1":
                    this.addMovie();
                    break;
                case "2":
                    this.listMovies();
                    break;
                case "3":
                    this.showMovieCount();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("That was not a valid choice.");
            }

        }

    }

    public void addMovie()
    {
        System.out.println("Please enter the title of the movie: ");
        String title = reader.getInput();

        System.out.println("Please enter the running time of the movie: ");
        String userInput = reader.getInput();
        int runningTime = 0;

        try
        {
            runningTime = Integer.parseInt(userInput);
        }
        catch (NumberFormatException exception)
        {
            System.err.println("The input could not be parsed to an int.");
            return;
        }

        Genre aGenre;

        System.out.println("Please choose from the following:");
        System.out.println("1. Comedy");
        System.out.println("2. Thriller");
        System.out.println("3. Horror");
        System.out.println("4. Action");
        System.out.println("5. Romance");
        System.out.println("6. Historical");

        userInput = reader.getInput();

        int genreNumber = -1;

        try
        {
            genreNumber = Integer.parseInt(userInput);
        }
        catch (NumberFormatException exception)
        {
            System.err.println("The input could not be parsed to an int.");
            return;
        }

        if (genreNumber < 1 || genreNumber > 6)
        {
            System.err.println("That was not a valid option.");
            return;
        }

        Genre genre;

        switch (genreNumber)
        {
            case 1:
                genre = Genre.COMEDY;
                break;
            case 2:
                genre = Genre.THRILLER;
                break;
            case 3:
                genre = Genre.HORROR;
                break;
            case 4:
                genre = Genre.ACTION;
                break;
            case 5:
                genre = Genre.ROMANCE;
                break;
            case 6:
                genre = Genre.HISTORICAL;
                break;
            default:
                genre = Genre.COMEDY;
        }

        Movie m = new Movie(title, runningTime, genre);
        this.library.addMovie(m);

    }

    public void listMovies()
    {
        this.library.showMovies();
    }


    public void showMovieCount()
    {
        int count = this.library.movieCount();

        System.out.println(count);
    }





}
