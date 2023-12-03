public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 70;
        double heightInMeters = 1.69;
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println("ИМТ " + bmi);

    }
}