package lib;

public class BbookDto {
    private Book aBook;
    private int volume;
    private String location;

    public BbookDto(Book aBook, int volume, String location) {
        this.volume = volume;
        this.location = location;
        this.aBook= aBook;
    }

    public BbookDto getSuccess(BbookDto dto){
        return new BbookDto(dto.aBook, dto.volume, dto.location);
    }

    public String getFail(){
        return "filed";
    }
}

class Book{
    public String bookTitle;
    private String author;
    private String publisher;

    public void setBookInfo(String bookTitle, String author, String publisher){
        setBookTitle(bookTitle);
        setAuthor(author);
        setPublisher(publisher);
    }

    protected void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}