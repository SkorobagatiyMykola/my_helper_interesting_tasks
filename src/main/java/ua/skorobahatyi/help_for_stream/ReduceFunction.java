package ua.skorobahatyi.help_for_stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceFunction {
    /**
     * Optional<T> reduce(BinaryOperator<T> accumulator)
     * T reduce(T identity, BinaryOperator<T> accumulator)
     * U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
     */

    public static void main(String[] args) {
        List<User> users = User.GenerationUsers.generationUsers();

        int ageAll = users.stream().map(user -> user.getAge())
                .reduce(1, (x, y) -> x + y);
        System.out.println(ageAll);

        int sum = users.stream().mapToInt(el -> el.getAge()).sum();
        System.out.println("sum: " + sum);

        int sum2 = users.stream().collect(Collectors.summingInt(el -> el.getAge()));
        System.out.println("sum: " + sum2);


        Optional<Integer> maxAge = users.stream().map(el -> el.getAge()).reduce((a, b) -> a > b ? a : b);
        Optional<Integer> minAge = users.stream().map(el -> el.getAge()).reduce((a, b) -> a > b ? b : a);

        System.out.println(maxAge.get());
        System.out.println(minAge.get());

        Integer maxAge2 = users.stream().map(el -> el.getAge()).reduce(0,(a, b) -> a > b ? a : b);
        Integer minAge2 = users.stream().map(el -> el.getAge()).reduce(100,(a, b) -> a > b ? b : a);

        System.out.println(maxAge2);
        System.out.println(minAge2);


    }
}
