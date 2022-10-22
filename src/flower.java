public class flower {

    String name;
    String flowerColor;
    String country;
    double cost;
    int lifeSpan;

    public flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
         public flower(String name, String flowerColor, String country, double cost) {
             this(name, flowerColor, country, cost, 3);
         }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        }
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country == null || country.isEmpty()){
            this.country = "Россия";
        }
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        }
        this.cost = cost;
    }
}
