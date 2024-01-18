public class Main {
    {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }

    public static void main(String[] args) {
    }
}
