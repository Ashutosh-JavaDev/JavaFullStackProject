package App;

public class book {
    private String BookId;
    private String title;
    private String author;
    private String category;
    private String totalcopies;
    private String availablecopies;
    private boolean status;

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTotalcopies() {
        return totalcopies;
    }

    public void setTotalcopies(String totalcopies) {
        this.totalcopies = totalcopies;
    }

    public String getAvailablecopies() {
        return availablecopies;
    }

    public void setAvailablecopies(String availablecopies) {
        this.availablecopies = availablecopies;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
