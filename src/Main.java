import java.io.File;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        File file = new File ("/Users/levankandasvili/Desktop/Lesson5/src/file.csv");
        File file2 = new File ("/Users/levankandasvili/Desktop/Lesson5/src/file1.csv");

        appData.read(file);

        System.out.println(Arrays.toString(appData.getHeaders()));
        System.out.println(Arrays.toString(appData.getData()[0]));
        System.out.println(Arrays.toString(appData.getData()[1]));
        System.out.println(Arrays.toString(appData.getData()[2]));
        System.out.println(Arrays.toString(appData.getData()[3]));
        System.out.println(Arrays.toString(appData.getData()[4]));
        System.out.println(Arrays.toString(appData.getData()[5]));

        appData.write(file2);
    }

}