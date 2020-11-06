public class BmiService {



    public double calculate(double weight, double height) {
        double bmiNew = (weight / (height * height))*10000;
        return bmiNew;
    };
}
