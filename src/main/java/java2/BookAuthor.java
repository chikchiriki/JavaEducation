package java2;

public class BookAuthor {
    public static class Author{

        private String FirstName;
        private String LastName;

        public Author (String FirstName, String LastName){
            this.FirstName = FirstName;
            this.LastName = LastName;
        }
        //getters
        public String getFirstName(){
            return FirstName;
        }
        public String getLastName(){
            return LastName;
        }

        public String toString() {
            return FirstName + " " + LastName;
        }
    }

    public static class Book{

        private String title;
        private Author author;
        private Double price;

        public Book(String title, Author author, Double price){
            this.author = author;
            this.title = title;
            this.price= price;
        }
        //getters
        public String getFirstName(){
            return this.author.getFirstName();
        }
        public String getLastName(){
            return this.author.getLastName();
        }
        public String getTitle(){
            return title;
        }
        public Double getPrice(){
            return price;
        }

        //setters
        public void setAuthor(Author newAuthor){
            author=newAuthor;
        }
        public void setTitle (String title){
            this.title=title;
        }
        public void setPrice(Double price){
            this.price=price;
        }

        public String toString() {
            return "'" + title + "' by " + author + " price: "+ price;
        }

    }

    public static class BookDemo{

        public static void main(String[] args) {
            Author author  = new Author ("Ti", "Huan");
            System.out.println(author);
            //Test Getters
            System.out.println("First Name is: " + author.getFirstName());
            System.out.println("Last Name is: " + author.getLastName());

            Book book = new Book("Java ", author, 70.00);
            System.out.println(book);
            // Test Setters and Getters
            book.setPrice(5.00);
            book.setTitle("Java and KOKO");
            System.out.println("name is: " + book.getTitle());
            System.out.println("price is: " + book.getPrice());
            System.out.println("author first name is: " + book.getFirstName());
            System.out.println("author last name is: " + book.getLastName());



            Book moreBook = new Book("Developing Java Software",
                    new Author("Russel", "Winderand"), 79.75);
            System.out.println(moreBook);

        }

    }
}
