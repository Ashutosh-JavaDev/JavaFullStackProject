package App;

public class book {
    private String BookId;
    private String title;
    private String author;
    private String category;
    private String totalcopies;
    private String availablecopies;
    private boolean status;

    private String BookId() {
        return BookId;
    }

    private void setBookID(String BookId) {
        this.BookId = BookId;

    }
}
