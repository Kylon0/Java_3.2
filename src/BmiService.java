public class BmiService {
    public static double calculate (double weight, double height ){
        height /= 100;
        double index = weight/(Math.pow(height,2));
        return index;
    }
}
