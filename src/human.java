public class human {
    String name;
    int yearOfBirth;
    String town;
    String job;

    public human(String name, int yearOfBirth, String town, String job) {
        if (name == null) {
            this.name = "Информация отсутсвует";
        }else{
        this.name = name;
        }
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        }else{
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null) {
            this.town = "Информация отсутсвует";
        }else{
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация отсутсвует";
        }else{
            this.job = job;
        }
    }
            void hello() {
                System.out.println("Привет! Меня зовут " + name + " я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
            }
        }
