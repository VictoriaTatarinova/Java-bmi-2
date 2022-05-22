public class BmiService {

    public int calculate(int m, int h) {
        int result = (m * 10000 / h / h);

        return result;
    }

}
