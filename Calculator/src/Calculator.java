public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    public interface Supplier<T> {
        T get();
    }

    public interface BinaryOperator<T> {
        T apply(T t1, T t2);
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y > 0)
            return x / y;
        else
            return Integer.MAX_VALUE;
    };
//    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : 0;

    public interface UnaryOperator<T> {
        T apply(T t);
    }

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;


    public interface Predicate<T> {
        boolean test(T t);
    }

    Predicate<Integer> isPositive = x -> x > 0;


    public interface Consumer<T> {
        void accept(T t);
    }

    Consumer<Integer> println = System.out::println;

}
