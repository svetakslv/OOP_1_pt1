public class Main {
    public static void main(String[] args) {

        human Maxim = new human("Максим", 1987, "Минск", "бренд-менеджера");
        human Anya = new human("Аня", 1993, "Москва", "методиста образовательных программ");
        human Katya = new human("Катя", 1994, "Калининград", null);
        human Artem = new human("Артем", 1995, "", "директора по развитию бизнеса");
        human Vladimir = new human("Владимир", 2001, "Казань", "без работы");

        printInfo(Maxim);
        printInfo(Anya);
        printInfo(Katya);
        printInfo(Artem);
        printInfo(Vladimir);

        flower Rose = new flower("Роза",null, "Голландия", 35.59, 3);
        flower Chrysanthemium = new flower("Хризантема", null, null, 15, 5);
        flower Pion = new flower("Пион", null, "Англия", 69.99, 1);
        flower Gypsophila = new flower("Гипсофила", null, "Турция", 19.5, 10);

        printFlower(Rose);
        printFlower(Chrysanthemium);
        printFlower(Pion);
        printFlower(Gypsophila);

    }

    private static void printInfo(human human) {
        System.out.println("Привет! Меня зовут " + human.name + " я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.job + ". Будем знакомы!");
    }

    public static void printFlower (flower flower) {
        System.out.println("Цветок " + flower.name + ", цвет: " + flower.getFlowerColor() + ", страна: " + flower.getCountry() + ", стоимость: " + flower.getCost() + ", срок стояния: " + flower.lifeSpan);
    }
}