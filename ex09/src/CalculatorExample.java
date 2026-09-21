public class CalculatorExample {

    public static void main(String[] args) {
        // 메모리 영역에 올려서 사용할 수 있다.
        // 1.스택영역 2.힙영역 3.메소드영역(static)

        System.out.println(Calculator.PI);
//        System.out.println(Calculator.aa);
        Calculator calc = new Calculator();
        System.out.println(calc.aa);

        Calculator.plus(10,20);
        Calculator.minus(20,8);

//        Calculator.doA();
        calc.doA();

    }

}
