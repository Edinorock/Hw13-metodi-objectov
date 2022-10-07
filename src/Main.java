public class Main {
    public static void main(String[] args) {

        Author author = new Author("Виктор", "Пелевин");
        Book book = new Book("Чапаев и Пустота", author, 1999);
        Book book2 = new Book("Чапаев и Пустота", author, 1999);
        System.out.println(book.getTitle() + " " + book.getAuthor().getfirstName() + " " + book.getAuthor().getlastName() + " " + book.getYear());
        System.out.println(book);

        System.out.println(book.hashCode() == book2.hashCode());
        System.out.println(book.equals(book2));

    }
}