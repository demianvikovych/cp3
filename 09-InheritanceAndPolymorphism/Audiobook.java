public class Audiobook extends Book { 
    private int minutes; 
    private int seconds; 
 
    public Audiobook(String title, String author, int minutes, int seconds) { 
        super(title, author); 
        this.minutes = minutes; 
        this.seconds = seconds; 
    } 
 
    public String getDuration() { 
        return minutes + " minutes " + seconds + " seconds"; 
    } 
 
    public void setDuration(int minutes, int seconds) { 
        this.minutes = minutes; 
        this.seconds = seconds; 
    } 
 
    public void display() { 
        System.out.println("Audiobook: " + getTitle() + " by " + getAuthor() + ", Duration: " + getDuration()); 
    } 
} {
    
}
