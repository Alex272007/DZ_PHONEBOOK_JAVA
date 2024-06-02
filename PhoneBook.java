import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class PhoneBook {
    private Map<String, PhoneData> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        PhoneData contact = contacts.get(name);
        if (contact == null) {
            contact = new PhoneData(name);
            contacts.put(name, contact);
        }
        contact.addPhoneNumber(phoneNumber);
    }

    public void printSortedByPhoneNumbersCountWithPhones() {
    Comparator<Object> byPhoneNumbersCountComparator = Comparator.comparingInt(contact -> ((PhoneData) contact).getPhoneNumbers().size()).reversed();

    contacts.values().stream()
            .sorted(byPhoneNumbersCountComparator)
            .forEach(contact -> {
                String phones = contact.getPhoneNumbers().stream()
                        .collect(Collectors.joining(", "));
                System.out.println(contact.getName() + ": " + phones);
            });
    }
}