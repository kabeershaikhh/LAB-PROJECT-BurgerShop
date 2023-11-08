public class Customer extends Person {
    private String name;
    private String phoneNumber;
    private String email;

    public Customer(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}

