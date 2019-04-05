class Book{
    private String name;
    private Author author;
    private double price;

    public Book(String name, Author author, double  price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    private Author getAuthor() {       
        return this.author;
    }
    private String getName() {
        return name;
    }
    private double getPrice() {
        return price;
    }
    private void setPrice(double price) {
        this.price = price;
    }
    public void printBook(){
        System.out.printf("\nBook Name : %s \nAuthor Name : %s \nBook Price : %.2f \n",getName(),getAuthor(),getPrice());
    }
}
