public class Main {
    public static void main(String[] args) {

    human Maxim = new human("Максим",1987,"Минск", "бренд-менеджера");
    human Anya= new human("Аня", 1993,"Москва", "методиста образовательных программ");
    human Katya = new human("Катя", 1994,"Калининград", null);
    human Artem = new human("Артем", 1995,"", "директора по развитию бизнеса");
    human Vladimir = new human("Владимир", 2001, "Казань", "без работы");

    printInfo(Maxim);
    printInfo(Anya);
    printInfo(Katya);
    printInfo(Artem);
    printInfo(Vladimir);

    }
    private static void printInfo(human human) {
        System.out.println("Привет! Меня зовут " + human.name + " я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.job + ". Будем знакомы!");
    }
}