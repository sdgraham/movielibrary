public class Movie
{
    private String title;
    private int runningTime;
    private Genre genre;

    public Movie(String aTitle, int aRunningTime, Genre aGenre)
    {
        this.title = aTitle;
        this.runningTime = aRunningTime;
        this.genre = aGenre;
    }

    public String getTitle()
    {
        return this.title;
    }

    public int getRunningTime()
    {
        return this.runningTime;
    }

    public Genre getGenre()
    {
        return genre;
    }

    // [title], [genre] – running time: [runningTime] minutes
    public void showInfo()
    {
        String movieInfo = this.getTitle() + ", " + this.getGenre() + " – running time: " + this.getRunningTime() + " minutes";

        System.out.println(movieInfo);
    }
}
