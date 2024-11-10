package lib;

class Main{
    public static void main(String[] args) {
        Book aBook= new Book();
        aBook.setBookInfo("JoungDongSub's life", "JoungDongSub", "JoungDongSub");
        BbookDto dto= new BbookDto(aBook, 999, "JoungDongSub");
        Checker.sayBookName(dto);
    }
}