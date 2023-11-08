public class Employee extends Person {
    private String name;
    private String phoneNumber;
    private String email;
    private String position;

    
    public Employee(String name, String phoneNumber, String email, String position) {
        super(name, phoneNumber, email);
        this.position = position;
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

    public String getPosition() {
        return position;
    }
}

