public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван Петров", "+7 (903) 123-45-67");
        phoneBook.addContact("Мария Сидорова", "+7 (905) 765-43-21");
        phoneBook.addContact("Иван Петров", "+7 (906) 321-45-67");
        phoneBook.addContact("Мария Ким", "+7 (954) 097-82-61");
        phoneBook.addContact("Сергей Лях", "+7 (909) 876-54-32");
        phoneBook.addContact("Мария Ким", "+7 (909) 567-89-01");
        phoneBook.addContact("Мария Ким", "+7 (988) 987-28-81");

        phoneBook.printSortedByPhoneNumbersCountWithPhones();
    }
}

