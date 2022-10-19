public class human {
    String name;
    int yearOfBirth;
    String town;
    String job;

    public human(String name, int yearOfBirth, String town, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.job = job;
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + " я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

}
