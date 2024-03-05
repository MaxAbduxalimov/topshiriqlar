public class Car {
    private String color;
    private String model;
    private long price;
    private boolean isAutomatic;

    public Car() {
    }

    public Car(String color, String model, long price, boolean isAutomatic) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    public void print() {
        String str = "";
        if (isAutomatic) str = "Automat";
        else str = "Mexanika";

        System.out.println("Avtomabil haqida ma'lumotlar:\nModeli: " + model + "\nRangi: "
                + color + "\nNarxi: " + price + "\nUzatmalar qutisi: " + str);

    }
}
