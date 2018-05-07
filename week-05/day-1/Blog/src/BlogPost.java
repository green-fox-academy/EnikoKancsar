public class BlogPost {
    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void printBlogPost() {
        System.out.println(title + " titled by " + authorName + " posted at " + publicationDate);
        System.out.println(text);
    }
}