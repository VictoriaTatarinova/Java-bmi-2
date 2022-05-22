public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 60;
        int h = 168;

        int bmi = service.calculate(m, h);

        System.out.println("Body Mass Index " + bmi);

    }
}
