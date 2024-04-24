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
                    // this.showAllMovies();
                    break;
                case "3":
                    //this.movieCount();
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

        

    }









}
