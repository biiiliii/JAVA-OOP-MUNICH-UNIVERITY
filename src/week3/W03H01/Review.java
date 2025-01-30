package week3.W03H01;

public class Review {
    private final int postId;
    private final String title;
    private final String content;
    private final int rating;
    public Review(int postId, String title, String content, int rating) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.rating = rating;
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

    public boolean equals(Review review) {
        return postId == review.getPostId();
    }
}
