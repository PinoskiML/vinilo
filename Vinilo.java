import java.util.ArrayList;


class Disc {
    private String artist;
    private String title;
    private int year;
    private int duration;

    public Disc(String artist, String title, int year, int duration) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.duration = duration;
    }


    public String getArtist() { return artist; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public int getDuration() { return duration; }


    public void setYear(int year) { this.year = year; }


    @Override
    public String toString() {
        return "Artist: " + artist + ", Title: " + title +
                ", Year: " + year + ", Duration: " + duration + " minutes";
    }
}

public class Vinilo{
    public static void main(String[] args) {

        ArrayList<Disc> discs = new ArrayList<>();

        discs.add(new Disc("Pink Floyd", "The Dark Side of the Moon", 1973, 43));
        discs.add(new Disc("The Beatles", "Abbey Road", 1969, 47));
        discs.add(new Disc("Nirvana", "Nevermind", 1991, 49));
        discs.add(new Disc("Radiohead", "OK Computer", 1997, 53));
        discs.add(new Disc("Metallica", "Master of Puppets", 1986, 55));


        System.out.println("Complete disc collection:");
        for (Disc disc : discs) {
            System.out.println(disc);
        }


        System.out.println("\nYear of the third disc: " + discs.get(2).getYear());


        int oldYear = discs.get(2).getYear();
        discs.get(2).setYear(1992);

        // Show the change
        System.out.println("\nThe year of \"" + discs.get(2).getTitle() +
                "\" by " + discs.get(2).getArtist() +
                " has been changed from " + oldYear +
                " to " + discs.get(2).getYear());


        System.out.println("\nUpdated third disc: " + discs.get(2));
    }
}