package week3.W03H01;

public class Review {
    private static int nextId = 0;
    private final int postId;
    private final String title;
    private final String content;
    private final int rating;
    private final Date postDate;
    private final Document reviewedDocument;
    private final Author reviewer;
    public Review(String title, String content, Date postDate, Author reviewer, Document reviewedDocument, int rating) {
        this.reviewedDocument = reviewedDocument;
        this.postId = nextId++;
        this.title = title;
        this.content = content;
        this.rating = rating;
        this.postDate = postDate;
        this.reviewer = reviewer;
    }
    public int getPostId() {
        return postId;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public int getRating() {
        return rating;
    }
    public Document getReviewedDocument() { return reviewedDocument; }
    public Date getPostDate() { return postDate; }
    public Author getReviewer() { return reviewer; }

    public static int numberOfCreatedReviews() { return nextId; }

    public boolean equals(Review review) {
        return postId == review.getPostId();
    }
    public String toString() {return rating + " " + title + " " + content;}
    public String toPrintText() {
        return reviewedDocument.toString() + "\n" +
                rating + "\n" +
                title + "\n" +
                content + "\n" +
                postDate.toString() + "\n" +
                reviewer.toString();
    }
}
