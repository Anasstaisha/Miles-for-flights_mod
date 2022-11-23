package src;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15_350;
        double miles = service.calculate(price);
        System.out.println("Стоимость Вашего билета: " + price);
        System.out.println("Ваши бонусные мили за эту покупку: " + miles);
    }
}
