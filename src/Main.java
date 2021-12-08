public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double w = 80;
        double h = 183;
        double weight = service.calculate(w, h);
        System.out.println(weight);
    }
}
