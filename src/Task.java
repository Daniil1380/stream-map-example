public class Task {

    public static void main(String[] args) {
        Person daniil = new Person("Даниил");
        Person artur = new Person("Артур");
        Person vladimir = new Person("Владимир");
        Person alexander = new Person("Александр");
        Person anton = new Person("Антон");

        Book book1 = new Book("Преступление и наказание", daniil);
        Book book2 = new Book("Дубровский", artur);
        Book book3 = new Book("Отцы и дети", vladimir);
        Book book4 = new Book("Евгений Онегин", alexander);
        Book book5 = new Book("Война и Мир", anton);
        Book book6 = new Book("Пиковая дама", null);






        //есть список из книг, у каждой книги есть запись о том, кто ее взял
        //нужно вывести список людей, которые взяли книги, при этом их имена должны начинаться на букву А

    }
}
