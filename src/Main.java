public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 84;
        double height = 1.81;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);

    }
}
