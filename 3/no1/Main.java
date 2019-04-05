class Main{
    public static void main(String[] args) {
        Author aut  = new Author("arizki","gmail.com",'L');
        Book book1 = new Book("pd",aut, 10000);
        book1.printBook();
    }
}
