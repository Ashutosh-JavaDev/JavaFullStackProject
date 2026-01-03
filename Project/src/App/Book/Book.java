package App.Book;

public class Book {
    private String BookId;
    private String title;
    private String author;
    private String category;
    private String totalcopies;
    private String availablecopies;
    private boolean status;

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getBookId() {
        return BookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setTotalcopies(String totalcopies) {
        this.totalcopies = totalcopies;
    }

    public String getTotalcopies() {
        return totalcopies;
    }

    public void setAvailablecopies(String availablecopies) {
        this.availablecopies = availablecopies;
    }

    public String getAvailablecopies() {
        return availablecopies;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

}
