import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        //声明一个扫描器
        Scanner in = new Scanner(System.in);
        //获取用户输入信息（字符串）
        System.out.println("输入：");
        String[] sarr = new String[100];
        int count = 0;
        while(!in.hasNext("end") && count < 100){
            //储存输入信息
            sarr[count] = in.nextLine();
            count++;
            //判断字符串是否超过100
            if(count == 100) break;
        }
        System.out.println("输出：");
        for(int i = 0; i < count; i++){
            System.out.println(sarr[i]);
        }
    }

    //  public static void main(String[] args) {
    //     String[] data = new String[100];
    //     Scanner in = new Scanner(System.in);
    //     for (int i = 0; i < 5; i++) {
    //         if ((data[i] = in.nextLine()).equals("end")) {
    //             break;
    //         }
    //     }
    //     for (String a : data) {
    //         if (a.equals("end")) {
    //             break;
    //         }
    //         System.out.println(a);
    //     }
    // }
}