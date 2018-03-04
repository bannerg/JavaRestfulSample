package pe.edu.utp.javarestfulsample.models;

public class SampleClass {
    private String firstName;
    private String lastName;

    public SampleClass() {
    }

    public SampleClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}