package com.juc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors( chain = true)
class User{
    private Integer id;
    private String userName;
    private int age;
}

/**
 * 题目：请按照给出数据，找出同时满足以下条件的用户，也即以下条件全部满足
 *       偶数ID且年龄大于24
 *       且用户名转为大写
 *       且用户名字母倒排序
 *       只输出一个用户名字
 */
public class StreamDemo {

    public static void main(String[] args) {
        User u1 = new User(11, "a", 23);
        User u2 = new User(12, "b", 24);
        User u3 = new User(13, "c", 22);
        User u4 = new User(14, "d", 28);
        User u5 = new User(16, "e", 26);

        List<User> list  = Arrays.asList(u1,u2,u3,u4,u5);

        list.stream().filter(u -> {return u.getId() % 2 == 0;})
                .filter(t -> {return t.getAge() > 24;})
                .map(m -> {return m.getUserName().toUpperCase();})
                .sorted((o1, o2) -> {return o2.compareTo(o1);})
                .limit(1)
//                .count()
                .forEach(System.out::println);

//        List<Integer> list2 = Arrays.asList(1,2,3);
//
//        list2 = list2.stream().map(x -> {return x * 2;}).collect(Collectors.toList());
//
//        for (Integer element : list2) {
//            System.out.println(element);
//        }

//        map(Function<? super T,? extends R> mapper)
//       map(Function<T,R> mapper)


        //================================================================================
        //================================================================================
        //================================================================================

        // select userName from student where id = ? and age > 24;

        // 函数式接口
//        Function<String, Integer> function = s -> {return s.length();};
//        System.out.println(function.apply("abc"));
//        Function<String, Integer> function = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//
//                return 1024;
//            }
//        };
//        System.out.println(function.apply("abc"));



        // 布尔型接口（判断型接口）
//        Predicate<String> predicate = s -> { return  s.isEmpty();};
//        System.out.println(predicate.test("xiass"));

//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return false;
//            }
//        };

        // 消费型接口
//        Consumer<String> consumer = s -> {
//            System.out.println(s);
//        };

//        consumer.accept("xiass");

//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        };

        // 供给型接口
//        Supplier<String> supplier = () -> {return "java0222";};
//        System.out.println(supplier.get());

//        Supplier<String> supplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return null;
//            }
//        };
    }
}


//interface MyInterface{
//    public int myInt(int x);
//    public String myString(String str);
//    public boolean isOK(String str);
//}