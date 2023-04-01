import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[]args) {
    Test t=new Test();
    int[] array=new int[]{2,4,3,5,1};
    int max=t.findMaxValueOfArray(array);
        System.out.println(max);
    }
        
}