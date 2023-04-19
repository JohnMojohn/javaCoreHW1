public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    @FunctionalInterface
    public interface BinaryOperator<T> {
        T apply(T t1, T t2);
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y > 0)
            return x / y;
        else throw new ArithmeticException("Ошибка деления на ноль!!!");
    };
//    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : 0;

    @FunctionalInterface
    public interface UnaryOperator<T> {
        T apply(T t);
    }

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    Predicate<Integer> isPositive = x -> x > 0;

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    Consumer<Integer> println = System.out::println;

}
