package com.pb.protsenko.hw5;

public class Reader {
    private String name;
    private String surname;
    private String faculty;
    private static int numOfTiket = 0;
    private String phone;
    private int day;
    private String month;
    private int year;

    public Reader(){};

    public Reader(String name, String surname, String faculty,  String phone, int day, String month, int year)
    {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        numOfTiket++;
        this.phone = phone;
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", phone='" + phone + '\'' +
                ", day=" + day +
                ", month='" + month + '\'' +
                ", year=" + year +
                " number of tiket =" + numOfTiket;
    }

    public void  takeBook(int count)
    {
     System.out.println(name +" " + surname +" " + " взял " + count + " книг(и) ");
    }

    public void takeBook(Book[] books)
    {
        if (books != null) {

                System.out.println(name + " " + surname + " " + "взял книги:" );
            for (int i = 0; i < books.length; i++) {
                        System.out.println( books[i].getName() + " ");
            }
        }
    }



    public void returnBook(int count)
    {

        System.out.println(name +" " + surname +" " + " вернул(а) " + count + " книг(и) ");
    }

    public void returnBook(Book[] books)
    {
        if (books != null) {

            System.out.println(name + " " + surname + " " + "вернул книги:" );
            for (int i = 0; i < books.length; i++) {
                System.out.println( books[i].getName() + " ");
            }
        }
    }

}
