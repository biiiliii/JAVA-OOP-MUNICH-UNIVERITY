package week3.W03H01;

public class Document {
    private final int documentId;
    private final String title;
    private final String description;
    private final String content;

    public Document(int documentId, String title, String description, String content) {
        this.documentId = documentId;
        this.title = title;
        this.description = description;
        this.content = content;
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

    public boolean equals(Document otherDocument) {
        return documentId == otherDocument.documentId;
    }

}
