package introducaoPoo.entities;

public class Aluguel {
    private String name;
    private String email;


    public Aluguel() {
    }
    public Aluguel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
