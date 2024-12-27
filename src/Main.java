public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1.");

        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fiodor", "Dostoevsky");

        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("Crime and Punishment", author2, 1866);

        System.out.println("Title: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());
        System.out.println("Title: " + book2.getTitle() + ", Author: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Year: " + book2.getPublicationYear());

        book1.setPublicationYear(1874);
        System.out.println("Updated Year of " + book1.getTitle() + ": " + book1.getPublicationYear());
    }
}