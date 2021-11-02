package com.pb.protsenko.hw5;

public class Library {

    public static void show(Book[] books)
    {
        for(Book anbook : books)
        {
            System.out.println(anbook + " ");
        }
    }

    public static void show(Reader[] readers)
    {
        for(Reader anreader : readers)
        {
            System.out.println(anreader + " ");
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book(" Приключения ", " Иванов И.И. ",  2000);
        Book book2 = new Book(" Словарь ", " Сидоров И.И. ",  1980);
        Book book3 = new Book(" Энциклопедия ", " Гусев И.И. ",  2010);
        Book[] books = {book1, book2, book3 };

        show(books);

        Reader[] readers = {new Reader("Алексей", "Константинов",
                "Прикладная математка", "+380505552266", 5, "мая", 1998),
                new Reader("Кирил", "Еременко",
                "Термодинамика", "+380507778855", 14, "июля", 1996),
                new Reader("Елена", "Иванова",
                "СКС", "+380953332214", 2, "декабря", 1995) };

        show(readers);
        readers[0].takeBook(5);
        readers[1].takeBook(2);
        readers[2].takeBook(6);

        readers[0].takeBook(books);

        readers[2].returnBook(5);
        readers[1].takeBook(books);


    }
}
