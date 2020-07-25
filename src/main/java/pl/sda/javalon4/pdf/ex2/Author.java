package pl.sda.javalon4.pdf.ex2;

public class Author {

    private String email, name;
    private char gender;    //m, f

    public Author(String email, String name, char gender) {
        this.email = email;
        this.name = name;
        setGender(gender);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    private void setGender(char gender) {
        if(gender == 'm' || gender == 'f')
            this.gender = gender;
        else if(gender == 'M' || gender == 'F')
            this.gender = Character.toLowerCase(gender);
        else
            throw new IllegalArgumentException("Gender must be provided either as 'm' or 'f'!");
    }

    @Override
    public String toString() {
        return "Author[" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ']';
    }
}
