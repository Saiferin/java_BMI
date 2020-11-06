import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Ваш вес: ");
        double weight = sc.nextDouble();
        System.out.print("Введите ваш рост в сантиметрах: ");
        double height = sc.nextDouble();
        double BMI = service.calculate(weight, height);
        String result = String.format("%.2f",BMI);
        if(BMI<16){
            System.out.println("Недовес: меньше чем 16 "+"\nИндекс массы вашего тела составляет " + result + " кг/рост2");
        }
        else if(BMI>16&&BMI<25){
            System.out.println("Нормальный: между 18.5 и 25 "+" \nИндекс массы вашего тела составляет " + result + " кг/рост2");
        }
        else if(BMI>25&&BMI<30){
            System.out.println("Избыточный вес: между 25 и 30 "+" \nИндекс массы вашего тела составляет " + result + " кг/рост2");
        }

        else if(BMI>=30){
            System.out.println("Ожирение: 30 или больше"+" \nИндекс массы вашего тела составляет " + result + " кг/рост2");
        }

    }

}
