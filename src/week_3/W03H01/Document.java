package week_3.W03H01;

public class Document {
    private static int nextId = 0;
    private final int documentId;
    private final String title;
    private final String description;
    private final String content;
    private final Date releaseDate;
    private final Author author;

    public Document(String title, String description, String content, Date releaseDate, Author author) {
        this.documentId = nextId++;
        this.title = title;
        this.description = description;
        this.content = content;
        this.releaseDate = releaseDate;
        this.author = author;
    }

    public int getDocumentId() {
        return documentId;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getContent() {
        return content;
    }
    public Date getReleaseDate() { return releaseDate; }
    public Author getAuthor() { return author; }

    public static int numberOfCreatedDocuments() { return nextId; }

    public boolean equals(Document otherDocument) {
        return documentId == otherDocument.documentId;
    }
    public String toString() { return title + " " + releaseDate + " " + description; }
    public String toPrintText() { return title + "\n" +
            author.toString() + "\n" +
            description + "\n" +
            releaseDate.toString();
    }
}
