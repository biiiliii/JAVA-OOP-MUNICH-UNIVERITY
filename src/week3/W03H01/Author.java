package week3.W03H01;

public class Author {
    private final String firstName;
    private final String lastName;
    private String address;
    private String email;
    private final Date birthday;

    public Author(String firstName, String lastName, String address, String email, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDateOfBirth() {
        return birthday;
    }
    public boolean equals(Author other) {
        if (other == null) return false;

        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.birthday.equals(other.birthday);
    }
    public String toString() {
        return firstName + " " + lastName;
    }
    public String toPrintText() {
        return firstName + " " + lastName + "\n" +
                birthday.toString() + "\n" +
                address + "\n" +
                email;
    }
}