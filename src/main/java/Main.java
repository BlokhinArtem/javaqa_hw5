import ru.netology.javaqa5_1.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        System.out.println(service.calculate(10000, 3000, 20000));
    }

}