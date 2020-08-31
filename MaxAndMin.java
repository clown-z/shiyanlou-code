import java.util.Arrays;

/**现给出一串数据（313, 89, 123, 323, 313, 15, 90, 56, 39）求出最大值和最小值并输出。 */
public class MaxAndMin {

    public static void main(String[] args) {
        //声明数组，保存数据
        int[] nums = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        //定义max，min储存最大最小值
        int max = nums[0]; 
        int min = nums[0];
        //遍历数组(方法一)
        // for(int i = 0; i < nums.length - 1; i++){
        //      //数据对比获取最大最小值
        //      if(nums[i] > max) max = nums[i];
        //      if(nums[i] < min) min = nums[i];
        // }
        
        //排序获取最大最小值（方法二）
        // Arrays.sort(nums);
        // min = nums[0];
        // max = nums[nums.length - 1];

        //流获取最大最小值（方法三）
        max = Arrays.stream(nums).max().getAsInt();
        min = Arrays.stream(nums).min().getAsInt();
        System.out.println("Max = " + max + "\nMin = " + min);
    }

}