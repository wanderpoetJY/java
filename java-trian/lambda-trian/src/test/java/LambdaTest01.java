import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * lambda測試類
 *
 * @author admin 2021/01/25/ 19:58
 */
public class LambdaTest01 {

    @Test
    public void test01(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };

        System.out.println(comparator.compare(1, 2));
    }

    @Test
    public void test02(){
        Runnable r = () -> {
            System.out.println("测试");
        };

        r.run();
    }

    @Test
    public void test03(){


        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> c1 = (String s) -> {
            System.out.println(s);
        };

        Consumer<String> c2 = System.out::println;

        c.accept("常规写法");
        c1.accept("lambda写法");
        c2.accept("方法引用写法");
    }


    @Test
    public void test04(){
        Comparator<Integer> comparator = (a, b) -> a - b;

        System.out.println(comparator.compare(6, 2));
    }

    @Test
    public void test05(){
        Consumer<String> c = System.out::println;

        c.accept("测试05");
    }

    @Test
    public void test06(){
        Supplier<String> supplier = () -> "测试Supplier";
        System.out.println(supplier.get());
    }

    @Test
    public void test07(){
        Comparator<String> comparator1 = (s1,s2) -> s1.compareTo(s2);
        System.out.println(comparator1.compare("abc", "abd"));

        Comparator<String> comparator2 = String::compareTo;
        System.out.println(comparator2.compare("abc", "abd"));
    }

    @Test
    public void test8(){

        Supplier<Student> supplier =() -> new Student();

        Supplier<Student> supplier1 = Student::new;
    }
}
