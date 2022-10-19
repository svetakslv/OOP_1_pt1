public class human {
    String name;
    int yearOfBirth;
    String town;

    public human(String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + " я из города " + town + ". Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }

}
