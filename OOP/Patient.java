public class Patient extends Person {
    private int id;
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        super(name, age);
        this.id = id;
        this.disease = disease;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    // Overriding display method
    @Override
    public void display() {
        System.out.println("ID: " + id + ", Name: " + getName() + ", Age: " + getAge() + ", Disease: " + disease);
    }

    // Overloaded display method
    public void display(String message) {
        System.out.println(message);
    }
}
