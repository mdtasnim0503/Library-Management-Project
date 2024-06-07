class Library {
    String books[];
    int i, no_of_books;
    Library() {
        this.books = new String[100];
        no_of_books = 0;
    }
    public void addBook(String book) {
        this.books[no_of_books] = book;
        System.out.println(book + " has been added");
        no_of_books++;
    }
    public void issueBook(String book) {
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (book.equals(books[i])) {
                System.out.println(book + " book has been Issued");
                this.books[i] = null;
                return;
            }
        }
        if (book != books[i]) {
            System.out.println("This book doesn't exist in Library");
        }
    }
   public void showAvailableBook(){
       System.out.println();
       System.out.println("Available books are : ");
       for(int i=0;i<books.length;i++){
           if(books[i]==null) {
               continue;
           }
           else{
               System.out.println(" * "+books[i]);
           }
       }
   }
    public void returnBook(String book) {
        System.out.println();
        addBook(book);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("****** Welcome to Our Library ******");
        Library mylibrary = new Library();
        mylibrary.addBook("C Tutorial Complete Course");
        mylibrary.addBook("C++ Tutorial Complete Course");
        mylibrary.addBook("Java(Core+Adv) Complete Course");
        mylibrary.addBook("Android App Complete Course");
        mylibrary.issueBook("Java(Core+Adv) Complete Course");
        mylibrary.showAvailableBook();
        mylibrary.returnBook("Java(Core+Adv) Complete Course");
        mylibrary.showAvailableBook();
    }
}