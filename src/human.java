public class human {
    String name;
    private int yearOfBirth;
    private String town;
    String job;


    public human(String name, int yearOfBirth, String town, String job) {
        if (name == null) {
            this.name = "Информация отсутсвует";
        } else {
            this.name = name;
        }
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null) {
            this.town = "Информация отсутсвует";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация отсутсвует";
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация отсутсвует";
        } else {
            this.town = town;
        }
    }
}
