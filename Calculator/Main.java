public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); //Ошибка возникает из-за деления числа на ноль.
        // Нужно прописать условие при котором
        //не будет возможности реализации такого действия, а если будет то программа долдна поймать ошибку.
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}