import java.util.HashSet;
import java.util.Set;

class PhoneData {
    private String name;
    private Set<String> phoneNumbers;

    public PhoneData(String name) {
        this.name = name;
        this.phoneNumbers = new HashSet<>();
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
