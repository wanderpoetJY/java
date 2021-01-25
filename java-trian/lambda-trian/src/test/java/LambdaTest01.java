import java.util.Comparator;
import java.util.function.Consumer;

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
        Consumer<String> c = (String s) -> {
            System.out.println(s);
        };

        c.accept("测试");
    }


    @Test
    public void test04(){
        Comparator<Integer> comparator = (a, b) -> a - b;

        System.out.println(comparator.compare(6, 2));
    }
}
